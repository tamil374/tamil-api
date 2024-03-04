

Feature: calculation of total employees

@new_emp_post
  Scenario: Post employees
    Given set a post employee with endpoint "http://localhost:3000/"
    When payload body with path param of "employees"
    Then verify it should contain status codes as 201
    And name should contain "tamil"
  

@new_emp_get
 Scenario: Get employees
        Given set a get employee with endpoint "http://localhost:3000/"
        When payload with pathparam values of "employees/" with "id"
        Then verify the status code should contain value as 200
         
@new_emp_delete
 Scenario: Delete employees
        Given delete a value in employee with endpoint "http://localhost:3000/"
        When delete the values of "employees/" with "id"
        Then deleted status code should contain value as 200  
        
 @new_emp_put
 Scenario: update employees
        Given update a value in employee with endpoint "http://localhost:3000/"
        When updating the values with payload as "employees/" and "id"
        Then updated status code should contain value as 200  
               
      