package stepdefinitions.apisteps;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.apipojos.CountryApi;
import utilities.ConfigReader;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class CountryApiSteps {
    Response response;
    CountryApi[] countries;

    @Given("user sets the response using end point {string} and creates country using {string} and {string}")
    public void user_sets_the_response_using_end_point_and_creates_country_using_and(String url, String type, String country) {
        Map<String, Object> data = new HashMap<>();
        data.put(type,country);

        response = given().headers(
                        "Authorization",
                        "Bearer " + ConfigReader.getProperty("api_bearerToken"),
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON)
                .when().body(data)
                .post(url)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();

    }

    @Given("user sets the countries to response using {string}")
    public void userSetsTheCountriesToResponseUsing(String url) {
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

    @And("user saves the countries to correspondent files")
    public void userSavesTheCountriesToCorrespondentFiles() throws Exception {
        response.prettyPrint();
        ObjectMapper obj = new ObjectMapper();
        countries = obj.readValue(response.asString(), CountryApi[].class);
        System.out.println(countries[0].getName());
    }

    @Then("user validates the countries")
    public void userValidatesTheCountries() {
    }

//    @Given("user deletes a country using endpoint {string} and its extension {string}")
//    public void user_deletes_a_country_using_endpoint_and_its_extension(String endPoint, String id) {
//        response = given().headers(
//                        "Authorization",
//                        "Bearer " + ConfigReader.getProperty("api_bearerToken"),
//                        "Content-Type",
//                        ContentType.JSON,
//                        "Accept",
//                        ContentType.JSON)
//                .when()
//                .delete(endPoint+id)
//                .then()
//                .extract()
//                .response();
//    }

    @Given("users sees all logs {string}")
    public void usersSeesAllLogs(String arg0) {
    }


    @Given("user deletes a country using endpoint {string} and its extension {string}")
    public void userDeletesACountryUsingEndpointAndItsExtension(String endPoint, String id) {
        response = given().headers(
                        "Authorization",
                        "Bearer " + ConfigReader.getProperty("api_bearerToken"),
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON)
                .when()
                .delete(endPoint+id)
                .then()
                .extract()
                .response();
    }
}
