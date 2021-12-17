package stepdefinitions.apisteps;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.apipojos.CountryApi;
import utilities.ConfigReader;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class Us26UpdateCountrySteps {
    Response response;
    CountryApi[] countries;
    CountryApi inputCountry = new CountryApi();


    @Given("user validate updated countries with end point {string} and using {string} and {string}")
    public void userValidateUpdatedCountriesWithEndPointAndUsingAnd(String url, String id, String name) {

        inputCountry.setId(Integer.parseInt(id));
        inputCountry.setName(name);

        response = given().headers(
                        "Authorization",
                        "Bearer " + ConfigReader.getProperty("api_bearerToken"),
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON)
                .when().body(inputCountry)
                .put(url)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();

        response.prettyPrint();

        CountryApi responseCountry = response.as(CountryApi.class);

        assertEquals(inputCountry.getId(), responseCountry.getId());
        assertEquals(inputCountry.getName(), responseCountry.getName());
    }

}