package restAssuredPackages;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class Verification_Get_Request {
	
	@Test
	public void getrequestStatusCode() {
		
		given().
		when().get("https://reqres.in/api/users?page=2")
		.then().statusCode(200);
		
	}
	@Test
	public void getrequestLogAll() {
		
		given()
		.when().get("https://reqres.in/api/users?page=2")
		.then().log().all();
		
	}
	@Test
	public void getrequestNameVerify() {
		given()
	    .when()
	        .get("https://reqres.in/api/users?page=2")
	    .then()
	        .statusCode(200)
	        .body("data[1].first_name", equalTo("Lindsay"));
			
	}
	@Test
	public void getrequestNameVerifyAll() {
		given()
	    .when()
	        .get("https://reqres.in/api/users?page=2")
	    .then()
	        .statusCode(200)
	        .body("data.first_name", hasItems("Michael","Lindsay","Tobias","Byron","George","Rachel"));
			
	}

	@Test
	public void getParamAndSetHeaders() {
		
		given()
			.param("ANa","Ma")
			.header("sh","am")
		.when()
			.get("https://reqres.in/api/users?page=2")
		.then()
			.statusCode(200)
			.log().all();
	}
}
