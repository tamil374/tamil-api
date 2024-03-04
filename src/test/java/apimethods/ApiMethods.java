package apimethods;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import payload.PayloadJson;

import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class ApiMethods extends ApiWrappers {
	
	private static Response response;
	
	@Test
	public void getEmployee()
	{
//		baseURI();
		
	  
		
		 Map<String,Object> emp=new LinkedHashMap<String,Object>(); 
		 emp.put("firstname","tamil");
     	 emp.put("id", "31");
		 
		
//		response= getemployees(String pathParam);
	  System.out.println(response.asPrettyString());
	  System.out.println(response.getStatusCode());
	  System.out.println(response.getContentType());
	  System.out.println(response.getTime());
	  
	  
	  
	}
	
	@Test
	public Response postEmployee()
	{
//		baseURI();
		
	//	response=postRequest("/employees",PayloadJson.nameJson(null, null, null));
	  System.out.println(response.asPrettyString());
	  System.out.println(response.getStatusCode());
	  System.out.println(response.getContentType());
	  System.out.println(response.getTime());
	  
	return response;
	  
	  
	  
	}
	
	@Test
	public void deleteEmployee()
	{
		RestAssured.baseURI="http://localhost:3000/";

		
	  Response response=given().log().all().
			  contentType("application/json")
		//	  .body(payloadjson.data())
			  .when().delete("employees/36");
	  System.out.println(response.asPrettyString());
	  System.out.println(response.getStatusCode());
	  System.out.println(response.getContentType());
	  System.out.println(response.getTime());
	//  System.out.println(payloadjson.data());
	  
	  
	  
	}
	
    public static void main(String[] args) {
		ApiMethods api=new ApiMethods();
	//	api.getEmployee();
       api.postEmployee();
	//	api.deleteemployees();
    	
	}
}
