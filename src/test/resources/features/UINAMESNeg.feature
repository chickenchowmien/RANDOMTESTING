Feature: Do a negative test 
Scenario: request invalid number of names
When we send a request for zero names
Then we should get back a bad status code
And the error message should say Amount of requested names exceeds maximum allowed