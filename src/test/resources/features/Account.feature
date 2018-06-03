Feature: Profile for customer verify api 
@account
Scenario: verifying number of customers in api
When the user sends request for a female name
Then we should get back a valid status code
And gender should be female


#negative scenario
@negative
Scenario:  request invalid number of names
When the user sends a request for zero names
Then we should get back a invalid status code of 400
And the error message should say "Amount of requested names exceeds maximum allowed"


