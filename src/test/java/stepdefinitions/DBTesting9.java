package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.DatabaseUtility;

public class DBTesting9 {
    @Given("user creates a connection with db using {string} , {string} and {string}")
    public void user_creates_a_connection_with_db_using_and(String url, String username, String password) {
        DatabaseUtility.createConnection(url, username, password);
    }

    @Given("user sends their query to db and gets related data {string} and {string}")
    public void userSendsTheirQueryToDbAndGetsRelatedDataAnd(String arg0, String arg1) {

    }

    @And("user sets DB data into correspondent files")
    public void userSetsDBDataIntoCorrespondentFiles() {
    }

    @Then("user validates db data using records")
    public void userValidatesDbDataUsingRecords() {
    }
}