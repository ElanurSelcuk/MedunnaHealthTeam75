package utilities;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static Hooks.Hooks.spec;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class Authentication {
    // I will send a post request to generate a token



    public static String generateToken() {
        // Set the url


        // path params
        spec.pathParams("first", "api", "second", "authenticate");

        // Set the expected data

        /*
        {
  "password": "admin",
  "rememberMe": "true",
  "username": "admin79"
}
         */

        Map<String, Object> reqBody = new HashMap<>();
        reqBody.put("username", "admin79");
        reqBody.put("password", "admin");
        reqBody.put("rememberMe", "true");

        // Send the request
        Response response = given().
                spec(spec).
                contentType(ContentType.JSON).
                body(reqBody).
                when().
                post("/{first}/{second}");
        //  response.prettyPrint();

        JsonPath json = response.jsonPath();

        return json.getString("id_token");

    }

}
