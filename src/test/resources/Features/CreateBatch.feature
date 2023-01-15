Scenario: Create Batch by POST operation
  Given A service for "/batches"
  When I perform POST operation for "/batches" with body as
  	| BatchName       | BatchDescription | BatchStatus   | 
  	| Cucumber 991988 | API testing      | Active        |
  Then I validate the response code 201
	Then I perform DELETE operation to clear the program data for "DeleteBatchByID"