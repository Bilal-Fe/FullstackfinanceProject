package stepdefinitions;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.Customer9;
import utilities.ConfigReader;
import utilities.JsonUtil;




import static io.restassured.RestAssured.*;

public class CustomerApi9Steps {

    Response response;
    String bearerToken = ConfigReader.getProperty("api_bearer_token");
    Customer9 [] customer9s;

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
    public void userShouldGetAllCustomerDataAndDeserializeTheDataToJava() throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        customer9s = objectMapper.readValue(response.asString(),Customer9[].class);
//        customer9s = JsonUtil.convertJsonToJava(response.asString(),Customer9[].class);
        System.out.println(customer9s[1].getFirstName());
        System.out.println(customer9s[1].getLastName());

    }

    @And("user saves the customer data to correspondent files")
    public void userSavesTheCustomerDataToCorrespondentFiles() {
    }

    @Then("user needs to validate all customer api data")
    public void userNeedsToValidateAllCustomerApiData() {
    }
}
