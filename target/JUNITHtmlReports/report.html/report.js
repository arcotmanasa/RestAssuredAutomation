$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/DeleteBatchByID.feature");
formatter.feature({
  "name": "To delete a batch by ID",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@deleteBatchByID"
    }
  ]
});
formatter.scenario({
  "name": "To delete a batch by ID",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@deleteBatchByID"
    }
  ]
});
formatter.step({
  "name": "user has access to with end point \"https://lms-backend-service.herokuapp.com/lms/batches/942\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.DeleteBatchByID.user_has_access_to_with_end_point(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user makes a request to delete batch by Batch ID",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.DeleteBatchByID.user_makes_a_request_to_delete_batch_by_Batch_ID()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Status code should be 200",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.DeleteBatchByID.status_code_should_be(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User get Message: Batch with Id-(Batch ID) deleted Successfully!",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.DeleteBatchByID.user_get_Message_Batch_with_Id_Batch_ID_deleted_Successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Features/GetAllPrograms.feature");
formatter.feature({
  "name": "To view the restful All Programs",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@GetAllPrograms"
    }
  ]
});
formatter.scenario({
  "name": "To get all the programs details",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@GetAllPrograms"
    }
  ]
});
formatter.step({
  "name": "a service with \"https://lms-backend-service.herokuapp.com/lms/allPrograms\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.GetAllPrograms.a_service_with(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user sends request to get the program details",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.GetAllPrograms.user_sends_request_to_get_the_program_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should get the response code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.GetAllPrograms.user_should_get_the_response_code(int)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Features/GetProgramByID.feature");
formatter.feature({
  "name": "Get program by Id",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Get program by Id",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "A Service with \"https://lms-backend-service.herokuapp.com/lms/programs/367\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.GetProgramByID.a_service_with(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user sends get request",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.GetProgramByID.user_sends_get_request()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should get successful response code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.GetProgramByID.user_should_get_successful_response_code(int)"
});
formatter.result({
  "status": "passed"
});
});