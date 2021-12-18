package stepdefinitions.apisteps;


import io.cucumber.java.en.*;
import org.junit.Assert;
import utilities.ConfigReader;
import utilities.DatabaseUtility;
import utilities.ReadTxt;
import utilities.WriteToTxt;

import java.util.ArrayList;
import java.util.List;

public class DBTesting9 {
    List<Object> customerSSNIDs;
    String fileName = ConfigReader.getProperty("customerdb9");
    @Given("user creates a connection with db using {string} , {string} and {string}")
    public void user_creates_a_connection_with_db_using_and(String url, String username, String password) {
        DatabaseUtility.createConnection(url, username, password);
    }

    @Given("user sends their query to db and gets related data {string} and {string}")
    public void userSendsTheirQueryToDbAndGetsRelatedDataAnd(String query, String ssn) {
        customerSSNIDs = DatabaseUtility.getColumnData(query,ssn);
        System.out.println(customerSSNIDs);
    }

    @And("user sets DB data into correspondent files")
    public void userSetsDBDataIntoCorrespondentFiles() {
        WriteToTxt.saveAllCustomersComingFromDB(fileName,customerSSNIDs);
    }

    @Then("user validates db data using records")
    public void userValidatesDbDataUsingRecords() {
        List<String> actualSSNIDs = ReadTxt.returnAllCustomersSSNs(fileName);
        List<String> expectedSSNIDs = new ArrayList<>();
        expectedSSNIDs.add("746-90-0683");
        expectedSSNIDs.add("279-39-5686");

        Assert.assertTrue("The data doesn't match",actualSSNIDs.containsAll(expectedSSNIDs));
    }
}
