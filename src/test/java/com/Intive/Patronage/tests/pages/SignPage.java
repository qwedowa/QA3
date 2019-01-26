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

    @FindBy(how = How.CLASS_NAME, using = "submit")
    public WebElement submitButtonSign;

    @FindBy(how = How.XPATH, using = "//*[@id='create_account_error']")
    public WebElement createAccountError;

    public SignPage(final WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}