package authentication;

import apimethods.ApiWrappers;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class basicauth extends ApiWrappers
{
	@Test
	public void loginToPostman()
	{
	baseURI();
	given().auth().basic("postman", "password")
	.when().get("/	basicauth");
	}
	
	
}
