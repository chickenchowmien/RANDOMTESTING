package com.fourstay.stepdefinitions;
import cucumber.api.PendingException;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.testng.Assert.assertEquals;

import java.util.Map;

public class NegativeScenario {
	Map map;
	Response response;
	
	
	@When("the user sends a request for zero names")
	public void the_user_sends_a_request_for_zero_names() {
		basePath="http://uinames.com";
		response=given().accept(ContentType.JSON).when().params("amount",0,"region","United States").when().get(basePath+"/api");
		

	}

	@Then("we should get back a invalid status code of {int}")
	public void we_should_get_back_a_invalid_status_code_of(Integer int1) {
		assertEquals(response.getStatusCode(), int1.intValue());
	
	}

	@Then("the error message should say {string}")
	public void the_error_message_should_say(String string) {
	map=response.body().as(Map.class); //deserialization
	String error="Amount of requested names exceeds maximum allowed";
	assertEquals(map.get("error"),	error);
	System.out.println("hello");
		
	
	
	
	}
}
