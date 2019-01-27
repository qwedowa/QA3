package com.Intive.Patronage.tests.steps;

import com.Intive.Patronage.tests.DriverFactory;
import com.Intive.Patronage.tests.pages.MainPage;
import com.Intive.Patronage.tests.pages.SignPage;
import com.Intive.Patronage.tests.pages.WomenPage;
import cucumber.api.java.cs.A;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class WomenSteps extends DriverFactory {
    MainPage mainPage = new MainPage(driver);
    SignPage signPage = new SignPage(driver);
    WomenPage womenPage = new WomenPage(driver);

    @Given("^I open automationpractice website, sign in$")
    public void iOpenAutomationpracticeWebsiteSignIn() {
        mainPage.openAutomationPracticePage();
        Assert.assertTrue(mainPage.signPage.isDisplayed());
        mainPage.signPage.click();
        WebElement emailAddress = driver.findElement(By.id("email"));
        emailAddress.sendKeys("testxyz1994@gmail.com");
        WebElement password = driver.findElement(By.id("passwd"));
        password.sendKeys("12345");
        signPage.submitLoginSign.click();
    }

    @When("^I open Women category$")
    public void iOpenWomanCategory() {
        womenPage.openWomenCategory();

    }

    @And("^I choose any product$")
    public void iChooseAnyProduct() {
        Assert.assertTrue(womenPage.anyProduct.isDisplayed());
        womenPage.anyProduct.click();
    }

    @And("^I click on Be the first to write your review! button$")
    public void iClickOnBeTheFirstToWriteYourReviewButton() {
        Assert.assertTrue(womenPage.addReview.isDisplayed());
        womenPage.addReview.click();
    }

    @And("^I write Title and leave empty Comment$")
    public void iWriteTitleAndLeaveEmptyComment() {

        WebElement reviewTitle = driver.findElement(By.id("comment_title"));
        reviewTitle.sendKeys("Hello");
    }

    @And("^I click on SendButton$")
    public void iClickOnSendButton() {
        Assert.assertTrue(womenPage.sendReview.isDisplayed());
        womenPage.sendReview.click();
    }

    @And("^I write Comment and leave empty Title$")
    public void iWriteCommentAndLeaveEmptyTitle() {
        WebElement reviewComment = driver.findElement(By.id("content"));
        reviewComment.sendKeys("Good product");
    }

    @And("^I write Comment and Title$")
    public void iWriteCommentAndTitle() {
        WebElement reviewTitle = driver.findElement(By.id("comment_title"));
        reviewTitle.sendKeys("Hello");
        WebElement reviewComment = driver.findElement(By.id("content"));
        reviewComment.sendKeys("Good product");
    }

    @Then("^I will add an review$")
    public void iWillAddAnReview() {
        Assert.assertTrue(womenPage.addedReview.isDisplayed());
    }

    @And("^I click on Enter key$")
    public void iClickOnEnterKey() {
        driver.findElement(By.id("submitNewMessage")).sendKeys(Keys.ENTER);
    }

    @Then("^Nothing happen$")
    public void nothingHappen() {
        
    }

    @And("^I choose two different products$")
    public void iChooseTwoDifferentProducts() {
        Assert.assertTrue(womenPage.anyProduct.isDisplayed());
        womenPage.anyProduct.click();
        Assert.assertTrue(womenPage.addToCart.isDisplayed());
        womenPage.addToCart.click();
    }

    @And("^I click on Add to Cart button$")
    public void iClickOnAddToCartButton() {
        Assert.assertTrue(womenPage.addToCartButton.isDisplayed());
        womenPage.addToCartButton.click();
    }

    @And("^I click on Cart button$")
    public void iClickOnCartButton() {
        Assert.assertTrue(womenPage.shoppingCart.isDisplayed());
        womenPage.shoppingCart.click();
    }

    @Then("^I will see all products in Cart$")
    public void iWillSeeAllProductsInCart() {
        // Assert.assertEquals(womenPage.cartSummary.equals("2 Products"));
    }

    @And("^I choose any filter in Catalog, except Availability$")
    public void iChooseAnyFilterInCatalogExceptAvailability() {
        Assert.assertTrue(womenPage.dressesFilter.isDisplayed());
        womenPage.dressesFilter.click();

    }

    @Then("^I will see products with correct filter$")
    public void iWillSeeProductsWithCorrectFilter() {
        // Assert.assertEquals(womenPage.productCount.equals("Showing 1 - 5 of 5 items"));
    }

    @And("^I choose Availability filter in Catalog$")
    public void iChooseAvailabilityFilterInCatalog() {
        Assert.assertTrue(womenPage.availabilityFilter.isDisplayed());
        womenPage.availabilityFilter.click();
    }

    @Then("^I will see less number of products then filter shows$")
    public void iWillSeeLessNumberOfProductsThenFilterShows() {
        // Assert.assertEquals(womenPage.productCount.equals("Showing 1 - 3 of 3 items"));
    }

    @And("^I click Add to Compare button$")
    public void iClickAddToCompareButton() {
        Assert.assertTrue(womenPage.addToCompare.isDisplayed());
        womenPage.addToCompare.click();

    }

    @And("^I click Compare button$")
    public void iClickCompareButton() {
        Assert.assertTrue(womenPage.compareButton.isDisplayed());
        womenPage.compareButton.click();
    }

    @Then("^I can see compared one product$")
    public void iCanSeeComparedOneProduct() {
        Assert.assertTrue(womenPage.comparedOneProduct.isDisplayed());
    }

    @And("^I choose any three products$")
    public void iChooseAnyThreeProducts() {

    }

    @Then("^I can see compared three products$")
    public void iCanSeeComparedThreeProducts() {

    }

    @And("^I click on More button of any product$")
    public void iClickOnMoreButtonOfAnyProduct() {
        Assert.assertTrue(womenPage.anyProduct.isDisplayed());
        womenPage.anyProduct.click();
    }

    @And("^I click View larger button$")
    public void iClickViewLargerButton() {
        Assert.assertTrue(womenPage.viewLarger.isDisplayed());
        womenPage.viewLarger.click();
    }

    @Then("^I can see larger photo, but I can't zoom it enough$")
    public void iCanSeeLargerPhotoButICanTZoomItEnough() {
        Assert.assertTrue(womenPage.largerPhoto.isDisplayed());
    }

    @And("^I click <; > keys$")
    public void iClickKeys() {
        driver.findElement(By.id("view_scroll_left")).sendKeys(Keys.ARROW_LEFT);
        driver.findElement(By.id("view_scroll_right")).sendKeys(Keys.ARROW_RIGHT);
    }

    @Then("^I can't switch between photos$")
    public void iCanTSwitchBetweenPhotos() {

    }

    @And("^I click <; > buttons$")
    public void iClickButtons() {
        Assert.assertTrue(womenPage.rightArrow.isDisplayed());
        womenPage.rightArrow.click();
        Assert.assertTrue(womenPage.leftArrow.isDisplayed());
        womenPage.leftArrow.click();
    }
}
