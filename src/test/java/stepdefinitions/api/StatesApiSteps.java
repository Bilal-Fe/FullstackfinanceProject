package stepdefinitions.api;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.CountryApi;
import utilities.ConfigReader;
import static io.restassured.RestAssured.given;

public class StatesApiSteps {
    Response response;
    CountryApi[] countries;
    @Given("user sets the response using api end point {string} and updates states using {string} and {string}")
    public void userSetsTheResponseUsingApiEndPointAndUpdatesStatesUsingAnd(String endPoint, String id, String name) {
        response = given().headers(
                        "Authorization",
                        "Bearer " + ConfigReader.getProperty("api_bearerToken"),
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON)
                .when().body("{\"countryId\": "+id+",\"name\": \""+name+"\"}")
                .put(endPoint)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();
    }

    @Given("user sets all states to response using {string}")
    public void userSetsAllStatesToResponseUsing(String arg0) {
    }

    @Given("user manipulates all states")
    public void userManipulatesAllStates() {
    }

    @And("user saves the states to correspondent files")
    public void userSavesTheStatesToCorrespondentFiles() {
    }

    @Then("user validates all states")
    public void userValidatesAllStates() {
    }

    @Given("user deletes a states using endpoint {string} and its extension {string}")
    public void userDeletesAStatesUsingEndpointAndItsExtension(String arg0, String arg1) {
    }

    @Given("user deletes a state using {string} and {string}")
    public void userDeletesAStateUsingAnd(String url, String id) {
        response = given().headers(
                        "Authorization",
                        "Bearer " + ConfigReader.getProperty("api_bearerToken"),
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON)
                .when()
                .delete(url+id)
                .then()
                .extract()
                .response();
    }

    @Given("user sets the response using end point {string} and creates states using {string} and {string}")
    public void userSetsTheResponseUsingEndPointAndCreatesStatesUsingAnd(String endPoint, String id, String name) {
        response = given().headers(
                        "Authorization",
                        "Bearer " + ConfigReader.getProperty("api_bearerToken"),
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON)
                .when().body("{\"countryId\": "+id+",\"name\": \""+name+"\"}")
                .post(endPoint)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();
    }
}