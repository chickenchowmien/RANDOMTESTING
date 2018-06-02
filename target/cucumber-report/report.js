$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Account.feature");
formatter.feature({
  "name": "Profile for customer verify api",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "verifying number of customers in api",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@account"
    }
  ]
});
formatter.step({
  "name": "the user sends request for a female name",
  "keyword": "When "
});
formatter.match({
  "location": "APIDay2.the_user_sends_request_for_a_female_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "we should get back a valid status code",
  "keyword": "Then "
});
formatter.match({
  "location": "APIDay2.we_should_get_back_a_valid_status_code1()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "gender should be female",
  "keyword": "And "
});
formatter.match({
  "location": "APIDay2.gender_should_be_female()"
});
formatter.result({
  "status": "passed"
});
});