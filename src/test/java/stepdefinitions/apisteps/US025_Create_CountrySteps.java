package stepdefinitions.apisteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.apipojos.CountryApi;
import utilities.ConfigReader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US025_Create_CountrySteps {

    Response response;
    Response responseCreate;
    CountryApi country = new CountryApi();
    String jsonBody;


    @Given("user sets the response using end point {string} and creates country using {string} and {string")
    public void userCreatesACountryUsing(String url, String id, String name) {
//        Map<String, Object> data = new HashMap<>();
//        data.put(id, name);
        // "{id: "+id+",name: "+name+"}"

        country.setName(name);


        responseCreate = given().headers("Authorization",
                        "Bearer " + ConfigReader.getProperty("api_bearerToken"),
                        "Content-Type", ContentType.JSON,
                        "Accept", "ContentType.JSON").
                when().body(country).post(url).
                then().contentType(ContentType.JSON).
                extract().
                response();

        response.prettyPrint();

        CountryApi responseList=response.as(CountryApi.class);

        assertEquals(country.getName(),responseList.getName());

//        response = given().accept(ContentType.JSON).auth().oauth2(ConfigReader.getProperty("api_bearerToken")).
//                get(url);
//

//        JsonPath jsonPath=responseCreate.jsonPath();
//       // jsonBody = responseCreate.jsonPath().get("name");
//        jsonBody=jsonPath.get("name");
//        System.out.println(jsonBody);
//    }
//
//    @Then("validates the country")
//    public void validatesTheCountry() {
//
//        JsonPath jsonPath = response.jsonPath();
//        List<Object> countryList = jsonPath.getList("name");
//        System.out.println(countryList);
//        Assert.assertTrue(countryList.contains(jsonBody));
//    }
    }

}










