package com.Intive.Patronage.tests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SignPage {

    private WebDriver driver;

    private static String AUTOMATIONPRACT_URL = "http://automationpractice.com";
    public void openAutomationPracticePage() {
        driver.get(AUTOMATIONPRACT_URL);
    }

    @FindBy(how = How.ID, using = "SubmitCreate")
    public WebElement submitButtonSign;

    @FindBy(how = How.CLASS_NAME, using = "alert-danger")
    public WebElement createAccountError;

    @FindBy(how = How.ID, using = "email_create")
    public WebElement createdEmail;

    @FindBy(how = How.CLASS_NAME, using = "submit clearfix")
    public WebElement register;

    @FindBy(how = How.ID, using = "email")
    public WebElement emailAddress;

    @FindBy(how = How.ID, using = "passwd")
    public WebElement password;

    @FindBy(how = How.ID, using = "SubmitLogin")
    public WebElement submitLoginSign;

    @FindBy (how = How.ID, using = "search_query_top")
    public  WebElement searchbar;

    @FindBy (how = How.CLASS_NAME, using =  "account")
    public WebElement loggedIn;

    @FindBy (how = How.CLASS_NAME, using = "alert-danger")
    public WebElement wrongPswd;

    @FindBy (how = How.CLASS_NAME, using = "btn btn-default button-search")
    public WebElement searchButton;

    public SignPage(final WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public WebElement createError() {
        return createAccountError;
    }
}