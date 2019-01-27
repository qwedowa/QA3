package com.Intive.Patronage.tests.steps;

import com.Intive.Patronage.tests.DriverFactory;
import com.Intive.Patronage.tests.pages.MainPage;
import com.Intive.Patronage.tests.pages.SignPage;
import cucumber.api.PendingException;
import cucumber.api.java.cs.A;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPageSteps extends DriverFactory {
    MainPage mainPage = new MainPage(driver);
    SignPage signPage = new SignPage(driver);

    @Given("^I open Automationpractice Website$")
    public void iOpenAutomationpracticeWebsite() {mainPage.openAutomationPracticePage();
    }

    @When("^I click on SignIn button$")
    public void iClickOnSignInButton() {
        Assert.assertTrue(mainPage.signPage.isDisplayed());
        mainPage.signPage.click();
    }

    @And("^I click on CreateAnAccount button$")
    public void iClickOnCreateAnAccountButton() {
        Assert.assertTrue(signPage.submitButtonSign.isDisplayed());
        signPage.submitButtonSign.click();
    }

    @Then("^I will see error popup$")
    public void iWillSeeErrorPopup() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("create_account_error")));
    }


    @And("^I write \"([^\"]*)\" and click on CreateAnAccount button$")
    public void iWriteAndClickOnCreateAnAccountButton() {
        WebElement emailAddress = driver.findElement(By.id("email"));
        emailAddress.sendKeys("123abc@gmail.com");
        signPage.submitButtonSign.click();
        Assert.assertTrue(signPage.createdEmail.isDisplayed());
    }

    @Then("^I will able to create an account$")
    public void iWillCreateAnAccount() {
        Assert.assertTrue(signPage.register.isDisplayed());
    }

    @And("^I write incorrect e-mail address and correct password$")
    public void iWriteIncorrectEMailAddressAndCorrectPassword() {
        WebElement emailAddress = driver.findElement(By.id("email"));
        emailAddress.sendKeys("test-email");
        WebElement password = driver.findElement(By.id("passwd"));
        password.sendKeys("pass123");
        signPage.submitLoginSign.click();
    }

    @And("^I search with phrase \"([^\"]*)\"$")
    public void iSearchWithPhrase ()  {
        WebElement searchbar = driver.findElement(By.id("search_query_top"));
        searchbar.sendKeys("Dress");
        signPage.submitButtonSign.click();
    }

    @And("^I write correct data and click on SignIn button$")
    public void iWriteCorrectDataAndClickOnSignInButton() {
        WebElement emailAddress = driver.findElement(By.id("email"));
        emailAddress.sendKeys("testxyz1994@gmail.com");
        WebElement password = driver.findElement(By.id("passwd"));
        password.sendKeys("12345");
        signPage.submitLoginSign.click();
    }

    @Then("^I will sign in$")
    public void iWillSignIn() {
        Assert.assertTrue(signPage.loggedIn.isDisplayed());
    }

    @And("^I write correct e-mail address and incorrect password$")
    public void iWriteCorrectEMailAddressAndIncorrectPassword() {
        WebElement emailAddress = driver.findElement(By.id("email"));
        emailAddress.sendKeys("testxyz1994@gmail.com");
        WebElement password = driver.findElement(By.id("passwd"));
        password.sendKeys("12345678");
        Assert.assertTrue(signPage.wrongPswd.isDisplayed());
    }

    @When("^I click on Search button$")
    public void iClickOnSearchButton() {
        signPage.searchButton.click();
    }

    @Then("^I will see (\\d+) results$")
    public void iWillSeeResults(int arg0) {

    }

}
