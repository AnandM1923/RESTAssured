package TestForRough;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.*;

public class basicAutintication {
	
	@Test
	public void basicAuth() {
		
		given()
			.auth().basic("postman", "password")
		.when()
			.get("https://postman-echo.com/basic-auth")
		.then()
			.statusCode(200)
			.body("authenticated",equalTo(true))
			.log().all();
		
	}
	
	@Test
	public void digestAuth() {
		
		given()
			.auth().digest("postman", "password")
		.when()
			.get("https://postman-echo.com/basic-auth")
		.then()
			.statusCode(200)
			.log().all()
			.body("authenticated",equalTo(true));
	}
	
	public void preemptiveAuth() {
		given()
		.auth().preemptive().basic("postman", "password")
	.when()
		.get("https://postman-echo.com/basic-auth")
	.then()
		.statusCode(200)
		.log().all()
		.body("authenticated",equalTo(true));
}
	
	public void BearerAuth() {
		given()
		.headers("Authorisation","bearer"+"Token")
	.when()
		.get("https://api.github.com/user/repos")
	.then()
		.statusCode(200)
		.log().all()
		.body("authenticated",equalTo(true));
}
	@Test
	public void Oauth1() {
	given()
		.auth().oauth("Consumerkey", "consumersecret", "accesstoken", "tokensecrete")
	.when()
		.get("https://api.github.com/user/repos")
	.then()
		.statusCode(200)
		.log().all()
		.body("authenticated",equalTo(true));
}
	

	@Test
	public void Oauth2() {
	given()
		.auth().oauth2("accesstoken")
	.when()
		.get("https://api.github.com/user/repos")
	.then()
		.statusCode(200)
		.log().all()
		.body("authenticated",equalTo(true));
}
	



}




