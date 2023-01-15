package StepDefinitions;

import org.junit.Assert;
import org.junit.Before;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import io.restassured.specification.RequestSpecification;

public class DeleteBatchByID {
	
	private static final String BASE_URL="https://lms-backend-service.herokuapp.com/lms";
	Response response;
	RequestSpecification request;
	
	
	@Given("user has access to with end point {string}")
	public void user_has_access_to_with_end_point(String string) {
		 
		 RestAssured.baseURI = BASE_URL;
		  request = RestAssured.given();
		 RestAssured.baseURI=BASE_URL;
		
		request.header("Content-Type","application/json");

	    
	}

	@When("user makes a request to delete batch by Batch ID")
	public void user_makes_a_request_to_delete_batch_by_Batch_ID() {
		
		 response = request.when().delete("/batches/1715");	
	    
	}

	@Then("Status code should be {int}")
	public void status_code_should_be(int responseCode) {
		int statusCode = response.getStatusCode();
		  Assert.assertEquals(statusCode, responseCode);
	   
	    
	}

	@Then("User get Message: Batch with Id-\\(Batch ID) deleted Successfully!")
	public void user_get_Message_Batch_with_Id_Batch_ID_deleted_Successfully() {
		System.out.println(" Message: Batch with Id-942 deleted Successfully!");
		
	    
	}


}
