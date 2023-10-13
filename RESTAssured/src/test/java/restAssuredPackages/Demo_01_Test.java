package restAssuredPackages;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.*;

public class Demo_01_Test {

	@Test
	public void GetRequest() {
		
		given()
		 .when()
		  .get("https://demoqa.com/BookStore/v1/Books")
		   .then()
		    .statusCode(200)
		    .contentType("application/json; charset=utf-8");
		
	}
}
