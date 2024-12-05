package base;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseAuth {
    private static String token;

    public static String getToken() {
        if (token == null) {
            RequestSpecification request = RestAssured.given()
                    .baseUri("https://restful-booker.herokuapp.com")
                    .header("Content-Type", "application/json")
                    .body("{\"username\": \"admin\", \"password\": \"password123\"}");

            Response response = request.post("/auth");
            token = response.jsonPath().getString("token");
        }
        return token;
    }
}
