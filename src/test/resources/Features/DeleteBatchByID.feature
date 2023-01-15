@deleteBatchByID
Feature: To delete a batch by ID

  Scenario: To delete a batch by ID
  Given user has access to with end point "https://lms-backend-service.herokuapp.com/lms/batches/942"
  When user makes a request to delete batch by Batch ID
  Then Status code should be 200 
  And  User get Message: Batch with Id-(Batch ID) deleted Successfully!
  








