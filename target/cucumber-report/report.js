$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/HomePageFeatures.feature");
formatter.feature({
  "name": "Checking basic features on home page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Go to home page and check for basic elements",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@first"
    }
  ]
});
formatter.step({
  "name": "the user is on the fourstay home page",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageFeaturesStep.the_user_is_on_the_fourstay_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the registration options",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageFeaturesStep.the_user_clicks_on_the_registration_options()"
});
formatter.result({
  "status": "passed"
});
});