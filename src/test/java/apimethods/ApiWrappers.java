
  package apimethods;
  
  import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;


import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;
  
  public class ApiWrappers {
  
	public static String baseURI()
	{
		return RestAssured.baseURI="http://localhost:3000";
		
	}
	 public  static Response postRequest(String pathParameter, String payloadJson)
	  {
		  
		  Response response=given()
				  .contentType("application/json")
				  .body(payloadJson)
		  .when().post(pathParameter);
		  return response;
		        
		  
	  }
	  public String getJsonValue(Response response, String jsonKey ) {
			
			JsonPath jspath = response.jsonPath();
		    return jspath.get(jsonKey).toString();
		}
	  
	public Response getRequest(Map<String, Object>paramMap, String pathParameter) {
		Response response = given()
				.params(paramMap)
				.when()
				.get(pathParameter);
		
		return response;
	}
  public static Response getRequest(String pathParameter,String id)
  {
	 System.out.println("tam" +pathParameter);
	 Response response = given()
//	.queryParam("id", id)
	.when()
	.get(pathParameter+id);
	 
//	 System.out.println(response.asPrettyString());
	return response;
}
	        
	  
  
  public Response deleteRequest(String pathParameter,String id)
  {
	  Response response=given().log().all()
			  .when().delete(pathParameter+id);
			
	return response;
  }
	        
	 public Response putRequest(String pathParameter,String id,String payloadJson)
	  {
		  Response response=given().log().all()
		  .contentType("application/json")
		  .body(payloadJson)
		  .when().put(pathParameter+id);
				
		return response;
		      
  }
	
  }
 