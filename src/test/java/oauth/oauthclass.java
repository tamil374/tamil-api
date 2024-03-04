package oauth;

import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

import apimethods.ApiWrappers;
import io.restassured.RestAssured;

public class oauthclass extends ApiWrappers{

	
	public void access()
	{
		
		 Response response = 
		    		given()
		    		.log().all()
		    		.formParam("client_id", "692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
		    		.formParam("client_secret", "erZOWM9g3UtwNRj340YYaK_W")
		    		.formParam("grant_type", "client_credentials")
		    		.formParam("scope", "client_credentials")
		    		.when()
		    		.post("oauthapi/oauth2/resourceOwner/token");
		RestAssured.baseURI="https://rahulshettyacademy.com";
		
		String token =  getJsonValue(response,"access_token");
	    
	
		response = 
	    		given()
	    		.log().all()
	    		.queryParam("access_token", token )
	    		.when()
	    		.get("/oauthapi/getCourseDetails");
	    
	    System.out.println(response.asPrettyString());
	    System.out.println(response.statusCode());

}
}
