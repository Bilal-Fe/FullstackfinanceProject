package stepdefinitions.apisteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.apipojos.CountryApi;
import utilities.Authentication;
import utilities.ConfigReader;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class Us27DeleteStatesSteps {
    Response response;

//    @Given("user validate updated countries with end point {string} and using {string} and {string}")
//    public void userValidateUpdatedCountriesWithEndPointAndUsingAnd(String url, String id, String name) {
//
//

//        response = given().headers(
//                        "Authorization",
//                        "Bearer " + Authentication.generateToken(),
//                        "Content-Type",
//                        ContentType.JSON,
//                        "Accept",
//                        ContentType.JSON)
//                .when().body(inputCountry)
//                .post(url)
//                .then()
//                .contentType(ContentType.JSON)
//                .extract()
//                .response();
//
//        response.prettyPrint();
//
//        CountryApi responseCountry = response.as(CountryApi.class);
//
//        assertEquals(inputCountry.getId(), responseCountry.getId());
//        assertEquals(inputCountry.getName(), responseCountry.getName());
//    }

    @Given("create a state from endpoint <{string}> and country id <{string}>")
    public void createAStateFromEndpointAndCountryId(String arg0, String arg1) {

    }

    @And("delete state using endpoint <{string}> and state id <{string}>")
    public void deleteStateUsingEndpointAndStateId(String arg0, String arg1) {
    }

    @Then("verify that state deleted")
    public void verifyThatStateDeleted() {
    }
}
