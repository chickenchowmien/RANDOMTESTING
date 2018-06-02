Feature: Profile for customer verify api 
@account
Scenario: verifying number of customers in api
When the user sends request for a female name
Then we should get back a valid status code
And gender should be female
