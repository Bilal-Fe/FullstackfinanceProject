package stepdefinitions.apisteps;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.apipojos.RegistrantsApi;
import utilities.ConfigReader;
import utilities.ReadTxt;
import utilities.WriteToTxt;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class US23step_def {
    Response response;
    RegistrantsApi[] registrants;
    String registrantFileName = ConfigReader.getProperty("fileNameOfRegistrantSSN");

    @Given("user sets the registrants to response using {string}")
    public void userSetsTheRegistrantsToResponseUsing(String url) {
        response = given().headers(
                        "Authorization",
                        "Bearer " + ConfigReader.getProperty("api_bearerToken"),
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

    }

    @And("user saves the registrants to correspondent files")
    public void userSavesTheRegistrantsToCorrespondentFiles() throws JsonProcessingException {
        response.prettyPrint();
        ObjectMapper obj = new ObjectMapper();
        registrants = obj.readValue(response.asString(), RegistrantsApi[].class);
        System.out.println(registrants[0].getFirstName());
        WriteToTxt.saveRegistrantsDataInFileWithSSN(registrantFileName, registrants);
    }

    @Then("user validates the registrants")
    public void userValidatesTheRegistrants() {

        List<String> expectedSSN = new ArrayList<>();
        expectedSSN.add("235-85-0011");
//        expectedSSN.add("000-00-0000");
//        expectedSSN.add("303-81-4293");

        List<String> actualSSNIDs = ReadTxt.returnCustomerSNNList(registrantFileName);
        Assert.assertTrue("All SSN Ids are not matching!", actualSSNIDs.containsAll(expectedSSN));
    }
}
