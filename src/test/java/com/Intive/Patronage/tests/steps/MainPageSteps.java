package com.Intive.Patronage.tests.steps;

import com.Intive.Patronage.tests.DriverFactory;
import com.Intive.Patronage.tests.pages.MainPage;
import com.Intive.Patronage.tests.pages.SignPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MainPageSteps extends DriverFactory {
    MainPage mainPage = new MainPage(driver);
    SignPage signPage = new SignPage(driver);

    @Given("^I open Automationpractice Website$")
    public void iOpenAutomationpracticeWebsite() {mainPage.openAutomationPracticePage();
    }

    @When("^I click on SignIn button$")
    public void iClickOnSignInButton() {
        mainPage.signPage.isDisplayed();
        mainPage.signPage.click();
    }

    @And("^I click on CreateAnAccount button$")
    public void iClickOnCreateAnAccountButton() {
        signPage.submitButtonSign.isDisplayed();
        signPage.submitButtonSign.click();
    }

    @Then("^I will see error popup$")
    public void iWillSeeErrorPopup() {
        Assert.assertTrue(signPage.createAccountError.isDisplayed());
    }



}
