package com.fourstay.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.sql.Driver;
import java.util.List;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//a[@href='/sign-up'])[1]")
    public WebElement signUpLink;

    @FindBy(xpath = "//a[contains(text(),'More options')]")
    public WebElement moreOptions;

    @FindBy(css = "[class='btn facebook-btn w-100 m-0 mb-3']")
    public WebElement facebookSignUp;

    @FindBy(css = "[class='btn google-btn w-100 m-0 mb-3']")
    public WebElement googleSignUp;

    @FindBy(css = "[class='btn email-btn w-100 m-0 mb-3']")
    public WebElement emailSignUp;

    @FindBy(xpath = "//div[@class='title p-b-60 text-center']")
    public WebElement whatTheySaid;

    @FindBy(linkText = "REQUEST A STAY")
    public WebElement requestStayButton;

    @FindBy(css = "[class='btn search-btn']")
    public WebElement mainSearchButton;

    @FindBy(xpath = "//div[@class='form-group']/input")
    public WebElement mainSearchBox;

    @FindBy(xpath = "(//span[@class='rotate-header'])[1]")
    public WebElement dynamicHeader1;

    @FindBy(xpath = "(//span[@class='rotate-header'])[2]")
    public WebElement dynamicHeader2;

    @FindBy(xpath = "(//span[@class='rotate-header'])[1]/span")
    public List<WebElement> dynamicHeaderContent1;

    @FindBy(xpath = "(//span[@class='rotate-header'])[2]/span")
    public List<WebElement> getDynamicHeaderContent2;

    @FindBy(css="overlay")
    public List<WebElement> overlays;

    @FindBy(linkText = "VIEW ALL CITIES")
    public WebElement viewAllCitiesButton;

    @FindBy(linkText = "//p[.='As an Associate Director of Sponsored Programs, I never had to worry about housing for our students because of our relationship with 4stay!']")
    public WebElement leezaSaid;

    @FindBy(xpath = "//img[@alt='Testimonial 1']")
    public WebElement leezaPic;

    @FindBy(linkText = "I came from Europe for an internship at Pennsylvania Hospital, it was very easy for me to find a furnished home on the platform.")
    public WebElement rudolfSaid;

    @FindBy(xpath = "//img[@alt='Testimonial 2']")
    public WebElement rudolfPic;

    @FindBy(linkText = "My home was ready before I arrived. It was very close to all the touristic attractions and the price was good.")
    public WebElement studentSaid;

    @FindBy(xpath = "//img[@alt='Testimonial 3']")
    public WebElement studentPic;

    @FindBy(linkText = "My home was literally walking distance to my campus. Everything was furnished and all utilities included.")
    public WebElement zeineSaid;

    @FindBy(xpath = "//img[@alt='Testimonial 4']")
    public WebElement zeinePic;

    @FindBy(xpath = "//div[@class='carousel-inner d-flex flex-row justify-content-between']//img")
    public List<WebElement> learnSomethingNewPicRotation;

    @FindBy(xpath = "//a[@href='/about-us']")
    public WebElement aboutUsLink;

    @FindBy(xpath = "//a[@href='http://blog.4stay.com']")
    public WebElement blogLink;

    @FindBy(xpath = "//a[@href='/about-us#press']")
    public WebElement pressLink;

    @FindBy(xpath = "//a[@href='https://angel.co/4-stay/jobs']")
    public WebElement careersLink;

    @FindBy(xpath = "//a[@href='/contact-us']")
    public WebElement contactUsLink;

    @FindBy(xpath = "//a[@href='https://help.4stay.com/']")
    public WebElement helpLink;

    @FindBy(xpath = "//a[@href='https://help.4stay.com/']")
    public WebElement facebookLink;

    @FindBy(xpath = "//a[@href='https://twitter.com/@4stay_co']")
    public WebElement twitterLink;

    @FindBy(xpath = "//a[@href='https://www.instagram.com/4stay.co/']")
    public WebElement instagramLink;

    @FindBy(xpath = "//img[@src='https://static.intercomassets.com/avatars/1348078/square']")
    public WebElement chatBox;

    @FindBy(xpath = "//div[contains(@class,'intercom-conversation-summary intercom-conversation-summary-0')]")
    public WebElement conversation1;

    @FindBy(css= "[placeHolder='\"Write a reply…\"]")
    public WebElement writeReplyBox;


    @FindBy(css = "[viewBox='0 0 29 18']")
    public WebElement gifButton;

    @FindBy(css = "[viewBox='0 0 18 18']")
    public WebElement smileyButton;

    @FindBy(css = "[viewBox='0 0 16 18']")
    public WebElement attachButton;

    @FindBy(xpath = "//*[@class='intercom-conversation intercom-messenger-body-view-enter-done']//div[@class='intercom-gif-picker-gif']")
    public List<WebElement> gifsFromBlueBox;

    @FindBy(xpath = "(//div[@class='intercom-emoji-picker-group'])")
    public static List<WebElement> emojisGroups;

    @FindBy(linkText = "Rent medium to long-term furnished stays today!")
    public WebElement banner;

    @FindBy(id = "first-name")
    public WebElement firstNameField;

    @FindBy(id = "last-name")
    public WebElement lastNameField;

    @FindBy(id = "email")
    public WebElement emailField;

    @FindBy(id = "password")
    public WebElement passwordField;

    @FindBy(css = "[class='btn btn-primary w-100 m-0 ng-binding']")
    public WebElement signUpButton;

    @FindBy(css = "[class='btn btn-primary w-100 m-0 mb-3']")
    public WebElement nextButtonDuringSignUp;

    @FindBy(id = "occupation")
    public WebElement occupationField;

    @FindBy(id = "phone")
    public WebElement phoneField;

    @FindBy(id="about_me")
    public WebElement aboutMeField;

    @FindBy(id="dob")
    public WebElement dobField;

    @FindBy(css = "[class='btn btn-primary w-100 m-0 ng-binding']")
    public WebElement saveButton;

    @FindBy(xpath = "//input[@type='email']")
    public WebElement googleSignUpEmailField;

    @FindBy(xpath = "//span[.='Next']")
    public WebElement googleSignUpEmailNextButton;

    @FindBy(id="email")
    public WebElement facebookSignUpEmailField;

    @FindBy(id="pass")
    public WebElement facebookSignUpPasswordField;

    @FindBy(xpath="//input[@type='submit']")
    public WebElement facebookSignSubmitButton;



    public int getFrameSize(){
        return driver.findElements(By.tagName("iframe")).size();
    }

    public void switchFrame(){

        driver.switchTo().defaultContent();
    }
}
