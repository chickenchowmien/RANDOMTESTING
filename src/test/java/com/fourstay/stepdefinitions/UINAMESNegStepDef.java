package com.fourstay.stepdefinitions;

import static io.restassured.RestAssured.given;

import java.util.Map;

import org.testng.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class UINAMESNegStepDef {
	Map map;
	Response response;
	@When("we send a request for zero names")
	public void we_send_a_request_for_zero_names() {
		RestAssured.basePath = "https://uinames.com/api/";
	    response = 
	    		given().accept(ContentType.JSON)
	    		.and().params("amount", 0,"region", "United States")
	    		.when().get(RestAssured.basePath);
	    map = response.as(Map.class);
	}

	@Then("we should get back a bad status code")
	public void we_should_get_back_a_bad_status_code() {
		Assert.assertEquals(400, response.getStatusCode());
	}

	@Then("the error message should say Amount of requested names exceeds maximum allowed")
	public void the_error_message_should_say_Amount_of_requested_names_exceeds_maximum_allowed() {
		Assert.assertEquals(map.get("error"), "Amount of requested names exceeds maximum allowed");
	}

}
