package stepdefinitions.apistepdefinitions;


import base_urls.Medunna_Base_Url;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojos.Appointment;
import utilities.ConfigurationReader;

import static io.restassured.RestAssured.given;
import static utilities.WriteToTextApiAppointment.saveAppointData;


public class US_07_AppointmentDefs {
Appointment appointment=new Appointment();
    Response response;

    @Given("user sets the necessary path params")
    public void user_sets_the_necessary_path_params() {


    }
    @Given("user fills all the requested information {string}, {string}, {string} , {string} , {string}, {string}")
    public void user_fills_all_the_requested_information(String firstName, String lastName, String ssn, String email, String phone, String startDate) {
        appointment.setFirstName(firstName);
appointment.setLastName(lastName);
appointment.setSsn(ssn);
appointment.setEmail(email);
appointment.setPhone(phone);
appointment.setStartDate(startDate);


    }
    @Given("user sends the POST request and gets the response")
    public void user_sends_the_post_request_and_gets_the_response() {
        RequestSpecification spec=new RequestSpecBuilder().setBaseUri("https://medunna.com").build();
        spec.pathParams("first","api","second","appointments","third","request");
response=given().spec(spec).contentType(ContentType.JSON).body(appointment).when().post("/{first}/{second}/{third}");

    }
    @When("user save the api records to correspondent files")
    public void user_save_the_api_records_to_correspondent_files() {
        saveAppointData(appointment);

    }
    @Then("user validates api records")
    public void user_validates_api_records() {
response.then().statusCode(201);
response.prettyPrint();


    }
    }
