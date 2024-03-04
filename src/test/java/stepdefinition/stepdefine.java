package stepdefinition;



import org.junit.Assert;


import apimethods.ApiWrappers;
import hooksmanager.hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import payload.PayloadJson;

public class stepdefine extends ApiWrappers 
{
   
  private Response response;
  
	
	@Given("set a post employee with endpoint {string}")
	public void set_a_post_employee_with_endpoint(String baseurl) {
		baseURI();
	    
	}

	@When("payload body with path param of {string}")
	public void payload_body_with_path_param_of(String pathParam)
	{
		response=postRequest(pathParam,PayloadJson.nameJson("tamil","arasan","tamil@gmail.com"));
	   
	}

	@Then("verify it should contain status codes as {int}")
	public void verify_it_should_contain_status_codes_as(int statuscode) {
		System.out.println(response.statusCode());
	    Assert.assertEquals(statuscode,response.statusCode());
	}

	@Then("name should contain {string}")
	public void name_should_contain(String responseExpected) {
		System.out.println(response.asPrettyString());
		Assert.assertTrue(response.asPrettyString().contains(responseExpected));
		hooks.scenario.log(String.valueOf(response.statusCode()));
		hooks.scenario.log(response.asPrettyString());
	}
/*	@And("it should contain id {string}")
	public void it_should_contain_id(String id) {
		id=getJsonValue(response, id);
		 System.out.println(id); 
		String.valueOf(response.statusCode());
		hooks.scenario.log(String.valueOf(response.statusCode()));
		}*/
	
	
	//Get
	
	@Given("set a get employee with endpoint {string}")
	public void set_a_get_employee_with_endpoint(String baseURI) {
//	    System.out.println("set a get employee with endpoint {string}");
		baseURI();	   
	}
		
	@When("payload with pathparam values of {string} with {string}")
	public void payload_with_pathparam_values_of_with(String pathParam,String id) {
		
		response=getRequest(pathParam,"138");
		  System.out.println(response.asPrettyString());
	//	  Assert.assertTrue(response.asPrettyString().contains("109"));
	}
	
	@Then("verify the status code should contain value as {int}")
	public void verify_the_status_code_should_contain_value_as(int StatusCode) {
		System.out.println(response.statusCode());
		Assert.assertEquals(StatusCode,response.statusCode());
	    
	}
	//delete
	@Given("delete a value in employee with endpoint {string}")
	public void delete_a_value_in_employee_with_endpoint(String basURI) {
		baseURI();
	   
	}
	@When("delete the values of {string} with {string}")
	public void delete_the_values_of_with(String pathParam, String id) {
		response=deleteRequest(pathParam,"138");
	    
	}
	@Then("deleted status code should contain value as {int}")
	public void deleted_status_code_should_contain_value_as(int StatusCode) {
		System.out.println(response.statusCode());
	Assert.assertEquals(StatusCode,response.statusCode());
}
	//put
	@Given("update a value in employee with endpoint {string}")
	public void update_a_value_in_employee_with_endpoint(String baseURI) {
		baseURI();
	   
	}
	@When("updating the values with payload as {string} and {string}")
	public void updatimng_the_values_with_payload_as(String pathParam,String id) {
		response=putRequest(pathParam,"118",PayloadJson.nameJson("sachin","arasan","tamil@gmail.com"));
	   }
	@Then("updated status code should contain value as {int}")
	public void updated_status_code_should_contain_value_as(int StatusCode) {
		System.out.println(response.statusCode());
	Assert.assertEquals(StatusCode,response.statusCode());
}
}



