package stepdefinitions.apisteps;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;
import com.fasterxml.jackson.databind.ObjectMapper;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import gmibank.jsonModels.StateJson;
//import gmibank.pojos.States;
//import gmibank.utilities.ConfigurationReader;
//import gmibank.utilities.ReadTxt;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.uipojos.States;
import utilities.ConfigReader;
import utilities.ReadTxt;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class US22step_def {

    Response response;
    States[] states;
    String filePath = "AllStatesData2.txt";

    @Given("user gets states to response using {string}")
    public void user_gets_states_to_response_using(String url) {

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

        response.prettyPrint();

    }
}




