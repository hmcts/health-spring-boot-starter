package uk.gov.hmcts.reform.health;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.Is.is;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = RANDOM_PORT)
@SpringBootConfiguration
@EnableAutoConfiguration
@SuppressWarnings("PMD.BeanMembersShouldSerialize")
class LivenessTest {

    @LocalServerPort
    private int port;

    @Test
    @DisplayName("Check if endpoint exists.")
    void endpointShouldExistAndReturnAValidResponse() {
        given()
            .port(port)
            .accept(APPLICATION_JSON_VALUE)
            .when()
            .get("/health/liveness")
            .then()
            .statusCode(200)
            .body("status", is("UP"));
    }
}
