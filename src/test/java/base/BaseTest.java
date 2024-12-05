package base;

import client.ApiClient;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    protected ApiClient apiClient;


    @BeforeClass
    public void setup() {
        // Initialize the APIClient before running the tests
        apiClient = new ApiClient();
        System.out.println("Setup completed for the test class");
    }

    @AfterClass
    public void teardown() {
        // Cleanup operations after all tests in the class are done
        System.out.println("Teardown completed for the test class");
    }
}
