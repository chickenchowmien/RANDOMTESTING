package com.fourstay.stepdefinitions;

import com.fourstay.pages.HomePage;
import com.fourstay.utilities.DriverManager;
import com.fourstay.utilities.DriverManagerFactory;
import com.fourstay.utilities.DriverType;
import com.fourstay.utilities.HomePageConstants;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HomePageFeaturesStep {
    private WebDriver driver;
    private DriverManager driverManager;
    private HomePage homePage;

    @Given("the user is on the fourstay home page")
    public void the_user_is_on_the_fourstay_home_page() {
        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
        driver = driverManager.getDriver();
        homePage = new HomePage(driver);
        driver.get("https://fourstay-staging.herokuapp.com/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }


    @When("the user clicks on the registration options")
    public void the_user_clicks_on_the_registration_options() {
        homePage.signUpLink.click();
        homePage.moreOptions.click();
        driverManager.quitDriver();
    }


}
