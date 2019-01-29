package com.Intive.Patronage.tests.steps;

import com.Intive.Patronage.tests.DriverFactory;
import com.Intive.Patronage.tests.pages.ContactUsPage;
import com.Intive.Patronage.tests.pages.MainPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import org.junit.Assert;

public class ContactUsSteps extends DriverFactory {

    MainPage mainPage = new MainPage(driver);
    ContactUsPage contactUsPage = new ContactUsPage(driver);


    @Given("^I open automationpractice website$")
    public void iOpenAutomationpracticeWebsite() {
        mainPage.openAutomationPracticePage();
    }

    @When("^I click on ContactUS link$")
    public void iClickOnContactUSLink() {
        Assert.assertTrue(contactUsPage.contactUsLink.isDisplayed());
        contactUsPage.contactUsButton().click();
    }

    @And("^I click on Send button$")
    public void iClickOnSendButton() {
        Assert.assertTrue(contactUsPage.submitButtonContactUs.isDisplayed());
        contactUsPage.submitButtonContactUs.click();

    }

    @Then("^I see error popup$")
    public void iWillSeeErrorPopup() {
        Assert.assertTrue(contactUsPage.error().isDisplayed());

    }
    @And("^I choose anything in Subject Heading, Email address, Order reference and Product; Message box and attachment is empty$")
    public void iChooseAnythingInSubjectHeadingEmailAddressOrderReferenceAndProductMessageBoxAndAttachmentIsEmpty() {


        Select idContact = new Select(driver.findElement(By.id("id_contact")));
        idContact.selectByIndex(1);

        Select email = new Select(driver.findElement(By.id("email")));
        email.selectByVisibleText("testxyz1994@gmail.com");

        Select order = new Select(driver.findElement(By.id("id_order")));
        order.selectByIndex(1);

        Select idProduct = new Select(driver.findElement(By.id("id_product")));
        idProduct.selectByIndex(1);

    }

    @And("^I write anything in Message box$")
    public void iWriteAnythingInMessageBox() {

        WebElement message = driver.findElement(By.id("message"));
        message.sendKeys("Hello");
    }

    @And("^I fill forms, without attachment$")
    public void iFillFormsWithoutAttachment() {

        Select idContact = new Select(driver.findElement(By.id("id_contact")));
        idContact.getFirstSelectedOption();

        Select email = new Select(driver.findElement(By.id("email")));
        email.selectByVisibleText("testxyz1994@gmail.com");

        Select order = new Select(driver.findElement(By.id("id_order")));
        order.getFirstSelectedOption();

        Select idProduct = new Select(driver.findElement(By.id("id_product")));
        idProduct.getFirstSelectedOption();

        WebElement message = driver.findElement(By.id("message"));
        message.sendKeys("Hello");
    }

    @Then("^I will send message$")
    public void iWillSendMessage() {
        Assert.assertTrue(contactUsPage.alertSuccess.isDisplayed());

    }

}
