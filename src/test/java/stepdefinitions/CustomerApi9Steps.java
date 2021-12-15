package stepdefinitions;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.Customer9;
import utilities.ConfigReader;
import utilities.JsonUtil;
import utilities.ReadTxt;
import utilities.WriteToTxt;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.*;

public class CustomerApi9Steps {

    Response response;
    String bearerToken = ConfigReader.getProperty("api_bearer_token");
    Customer9 [] customer9s;
    String fileName = ConfigReader.getProperty("fileNameOfCustomerSSN");

    @Given("user uses api end point{string} to get all customer data")
    public void userUsesApiEndPointToGetAllCustomerData(String url) {
        response = given()
                .headers(
                        "Authorization",
                        "Bearer "+bearerToken,
                "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON).
                when().
                get(url).
                then().
                contentType(ContentType.JSON).
                extract().
                response();
//        response.prettyPrint();
    }

    @Given("user should get all customer data and deserialize the data to java")
    public void userShouldGetAllCustomerDataAndDeserializeTheDataToJava() {
//        ObjectMapper objectMapper = new ObjectMapper();
//        customer9s = objectMapper.readValue(response.asString(),Customer9[].class);
        customer9s = JsonUtil.convertJsonToJava(response.asString(),Customer9[].class);
//        System.out.println(customer9s[1].getFirstName());
//        System.out.println(customer9s[1].getLastName());
//        System.out.println(customer9s[0].getUser().getEmail());
//        for (int i=0; i<customer9s.length;i++){
//            if (customer9s[i].getCountry() != null) {
//
//            System.out.println(customer9s[i].getCountry().getName());
//        }
//        }
    }

    @And("user saves the customer data to correspondent files")
    public void userSavesTheCustomerDataToCorrespondentFiles() {
        WriteToTxt.saveDataInFileWithSSN(fileName,customer9s);
    }

    @Then("user needs to validate all customer api data")
    public void userNeedsToValidateAllCustomerApiData() {
        List<String> expectedSSNIds = new ArrayList<>();
        expectedSSNIds.add("222-33-4441");
        expectedSSNIds.add("235-85-0011");
        expectedSSNIds.add(ConfigReader.getProperty("customer_ssn"));
        System.out.println(expectedSSNIds);
        List<String> actualSSNIds = ReadTxt.returnCustomerSNNList(fileName);
        Assert.assertTrue("All SSN Ids are not matching", actualSSNIds.containsAll(expectedSSNIds));

    }
}
