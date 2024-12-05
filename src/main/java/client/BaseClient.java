package client;

import base.BaseAuth;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class BaseClient {

    protected RequestSpecification requestSpec;

    // Constructor
    public BaseClient() {
        requestSpec = new RequestSpecBuilder()
                .setBaseUri("https://restful-booker.herokuapp.com")
                .addHeader("Content-Type", "application/json")
                .addHeader("Authorization", "Bearer " + BaseAuth.getToken())
                .build();
    }

    public RequestSpecification getRequestSpec() {
        return requestSpec;
    }
}
