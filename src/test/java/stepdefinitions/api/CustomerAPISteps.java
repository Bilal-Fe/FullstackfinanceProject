package stepdefinitions.api;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.CustomerApi;
import utilities.ConfigReader;
import utilities.ReadTxt;
import utilities.WriteToTxt;
import java.util.ArrayList;
import java.util.List;
import static io.restassured.RestAssured.*;

public class CustomerAPISteps {
    Response  response;
    String bearerToken = ConfigReader.getProperty("api_bearerToken");
    CustomerApi[] customers;
    String fileName = ConfigReader.getProperty("fileNameOfCustomerSSN");

    @Given("user uses api end point {string} to get all customer data")
    public void user_uses_api_end_point_to_get_all_customer_data(String url) {
        response = given().headers(
                        "Authorization",
                        "Bearer " + bearerToken,
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON)
                .when()
                .get(url)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();
        response.prettyPrint();
    }
    @Given("user should get all customer data and deserialize the data to java")
    public void user_should_get_all_customer_data_and_deserialize_the_data_to_java() throws Exception {
        ObjectMapper obj = new ObjectMapper();
        customers = obj.readValue(response.asString(), CustomerApi[].class );
//        System.out.println(customers[1].getFirstName() );
//        System.out.println(customers[1].getLastName() );
//        System.out.println(customers[1].getCountry().getName() );

    }
    @Given("user saves the customer data to correspondent files")
    public void user_saves_the_customer_data_to_correspondent_files() {
        WriteToTxt.saveDataInFileWithSSN(fileName, customers);

    }
    @Then("user needs to validates all customer api data")
    public void user_needs_to_validates_all_customer_api_data() {
        List<String> expectedSSN = new ArrayList<>();
        expectedSSN.add("235-85-0011");
        expectedSSN.add("222-33-4441");
//        expectedSSN.add("303-81-4293");

        List<String> actualSSNIDs = ReadTxt.returnCustomerSNNList(fileName);
        Assert.assertTrue("All SSN Ids are not matching!", actualSSNIDs.containsAll(expectedSSN));
    }
}