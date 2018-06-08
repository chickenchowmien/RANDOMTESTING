Feature: Verify UNINAMES functions
@first
Scenario: ask for a female name
When we send a request for a user name
Then we should get back a good status code
And the gender should be female


