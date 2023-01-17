package stepDefinition;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;

public class SaveProgram {
	private static final String BASE_URL="https://lms-backend-service.herokuapp.com/lms";
	RequestSpecification request;
	Response response;
	String jsonString;
	int saveprogramId;
	Map<String, Object>  body;
	JSONObject jsonbody;


@Given("User ensures to perform POST operation with body like")
public void User_ensures_to_perform_POST_operation_with_body_like(DataTable table) throws Throwable {
	
	List<List<String>> data = table.asLists(String.class);
	body = new HashMap<>();
	body.put("programName", data.get(1).get(0));
	body.put("programDescription", data.get(1).get(1));
	body.put("programStatus", data.get(1).get(2));

	SimpleDateFormat DateFor = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
	String stringDate = DateFor.format(new Date());
	body.put("lastModTime", stringDate);
	body.put("creationTime", stringDate);

	jsonbody = new JSONObject(body);
	
}


@When("User sends the post request using the \"([^\"]*)\" as$")
public void user_sends_the_post_request_using_the_saveprogram_as(String url) {
	request = RestAssured.given();	
	request.header("Content-Type", "application/json");
	request.body(jsonbody.toString());
	request.baseUri(BASE_URL);

	response = request.post(url);
	saveprogramId = response.getBody().jsonPath().getInt("programId");
	System.out.println("Response status code: " + response.statusCode());
}

@Then("User validates status code as {int} ok")
public void User_validates_status_code_as_ok(Integer int1) {
	int statusCode=((ResponseOptions<Response>) response).getStatusCode();
    Assert.assertEquals(201, statusCode);
}

@Then("User performs Delete operation to clear porgram for the url \"([^\"]*)\"$")
public void user_performs_Delete_operation_to_clear_porgram_for_the_url(String url) {
	Response response = request.delete(url + "/" + saveprogramId);
	System.out.println("DELETE Response status code: " + response.statusCode());
	//System.out.println("DELETE Response: " + response.getBody().asPrettyString());
	if(response.statusCode() == 200) {
  	  System.out.println("Save Program " + saveprogramId + " has been deleted successfully.");
}
}
}
