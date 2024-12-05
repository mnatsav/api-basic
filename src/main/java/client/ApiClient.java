package client;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class ApiClient extends BaseClient{

    public Response get(String endpoint) {
        return given(requestSpec) // Use given() with the requestSpec
                .when()
                .get(endpoint)
                .then()
                .log().all()
                .extract().response();
    }

    public Response post(String endpoint, Object body) {
        return given(requestSpec)
                .body(body)
                .when()
                .post(endpoint)
                .then()
                .log().all()
                .extract().response();
    }

    public Response put(String endpoint, Object body) {
        return given(requestSpec)
                .body(body)
                .when()
                .put(endpoint)
                .then()
                .log().all()
                .extract().response();
    }

    public Response delete(String endpoint) {
        return given(requestSpec)
                .when()
                .delete(endpoint)
                .then()
                .log().all()
                .extract().response();
    }
}
