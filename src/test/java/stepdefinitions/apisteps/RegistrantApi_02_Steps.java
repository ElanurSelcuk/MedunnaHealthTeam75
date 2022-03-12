package stepdefinitions.apisteps;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.Registrant;

import static Hooks.Hooks.spec;
import static io.restassured.RestAssured.given;
import static junit.framework.TestCase.assertEquals;
import static utilities.WriteToTxt.saveRegistrantData;

public class RegistrantApi_02_Steps {

    Registrant registrant = new Registrant();
     Faker faker = new Faker();
    Response response;

    @Given("user sets the necessary path params")
    public void user_sets_the_necessary_path_params() {

        spec.pathParams("first", "api", "second", "register");

    }

    @Given("user sends the POST request and gets the response")
    public void user_sends_the_post_request_and_gets_the_response() {

        response = given().spec(spec).contentType(ContentType.JSON).body(registrant).when().post("/{first}/{second}");
    }
    @Given("user sets the expected data  {string} , {string}")
    public void user_sets_the_expected_data(String email, String username) {

        email = faker.internet().emailAddress();
        username = faker.name().username();

        registrant.setEmail(email);
        registrant.setLogin(username);

    }
    @When("user saves the api records to correspondent files")
    public void user_saves_the_api_records_to_correspondent_files() {
        saveRegistrantData(registrant);
    }
    @Then("user validates api records")
    public void user_validates_api_records() throws  Exception{
        response.then().statusCode(201);
        response.prettyPrint();

        ObjectMapper obj = new ObjectMapper();

        Registrant actualRegistrant = obj.readValue(response.asString(), Registrant.class);

        System.out.println(actualRegistrant);

        assertEquals(registrant.getLogin(),actualRegistrant.getLogin());
        assertEquals(registrant.getEmail(),actualRegistrant.getEmail());
    }

}

