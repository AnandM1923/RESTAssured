package restAssuredPackages;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.*;

public class Demoqa_02_Delete{
	
	@Test
	public void PostRequest() {
		
		Response response =
		
		given()
		.when()
		 .delete("https://dummy.restapiexample.com/api/v1/delete/2")
		  .then()
		  .log().all()
		  .statusLine("HTTP/1.1 200 OK")
		  .extract().response();
		
		String jsonresponse = response.asString();
		Assert.assertEquals(jsonresponse.contains("Successfully! Record has been deleted"), true);
		 
		
	}

}
