import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoTest {

    @Test
    void shouldEchoPostedData() {
        String requestData = "some data";

        given()
                .baseUri("https://postman-echo.com")
                .body(requestData)
                .when()
                .post("/post")
                .then()
                .statusCode(500)
                .body("data", equalTo(requestData));
    }
}
