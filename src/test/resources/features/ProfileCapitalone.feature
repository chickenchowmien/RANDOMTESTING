Feature: Profile for customer verify api 

Scenario: verifying number of customers in api
When the user sends request for a female name
Then we should get back a valid status code
And gender should be female
@first1
Scenario: request invalid number of names
When we send a request for zero names
Then we should get back bad status code
And error messsage should say Amount of requested names exceeds maximum allowed