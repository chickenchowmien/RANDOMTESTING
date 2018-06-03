$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Account.feature");
formatter.feature({
  "name": "Profile for customer verify api",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "request invalid number of names",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@negative"
    }
  ]
});
formatter.step({
  "name": "the user sends a request for zero names",
  "keyword": "When "
});
formatter.match({
  "location": "NegativeScenario.the_user_sends_a_request_for_zero_names()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "we should get back a invalid status code of 400",
  "keyword": "Then "
});
formatter.match({
  "location": "NegativeScenario.we_should_get_back_a_invalid_status_code_of(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error message should say \"Amount of requested names exceeds maximum allowed\"",
  "keyword": "And "
});
formatter.match({
  "location": "NegativeScenario.the_error_message_should_say(String)"
});
formatter.result({
  "status": "passed"
});
});