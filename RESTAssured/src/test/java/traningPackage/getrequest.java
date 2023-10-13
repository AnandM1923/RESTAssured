package traningPackage;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.*;

public class getrequest {
	
	@Test
	public void getRequest() {
		
	given()
	.queryParam("CUSTOMER_ID", "68195")
	.queryParam("PASSWORD", "1234")
	.queryParam("Account_No", "1")
		.when()
			.get("http://demo.guru99.com/V4/sinkministatement.php")
		.then()
				.log().all()
				.statusCode(200);
				
		
		
	}

}
