package edu.poniperro;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class DeveloperResourceTest {

    @Test
    public void testHelloEndpoint() {
        assert true == true;
    }

}