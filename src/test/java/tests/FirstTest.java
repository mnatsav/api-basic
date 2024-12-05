package tests;

import base.BaseTest;
import client.ApiClient;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest extends BaseTest {

    @Test
    public void testGetUser() {
        new ApiClient().get("/booking");
    }
}
