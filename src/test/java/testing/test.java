package testing;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class test {
	public static String baseURI="http://localhost:3000";
	public static String payloadJson= "{\r\n"
	+ "    \"firstname\": \""+"ram"+"\",\r\n"
	+ "    \"lastname\": \""+"Rajesh"+"\",\r\n"
	+ "    \"emailID\": \""+"Anc@gmail.com"+"\"\r\n"
	+ "}";
	public static Response response;
	@Test
	public  static Response postRequest(String pathParameter)
	  {
		//Response response;
		 try { 
		 response=given().baseUri(baseURI)
				  .contentType("application/json")
				  .body(payloadJson)
		  .when().post("employees");
		  System.out.println(response.asPrettyString());
		 
		 }
		 
		 catch(Exception e) {
			System.out.println(e); 
		 }
		return response;
		        
		  
	  }

}
