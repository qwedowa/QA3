package com.Intive.Patronage.tests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage {
    private WebDriver driver;


    @FindBy(how = How.ID, using = "submitMessage")
    public WebElement submitButtonContactUs;

    @FindBy(how = How.CLASS_NAME, using = "alert-danger")
    public WebElement alertPopUp;

    @FindBy(how = How.ID, using = "id_contact")
    public WebElement idContact;

    @FindBy(how = How.ID, using = "email")
    public WebElement email;

    @FindBy (how = How.ID, using = "id_order")
    public WebElement order;

    @FindBy (how = How.ID, using = "id_product")
    public WebElement idProduct;

    @FindBy (how = How.ID, using = "message")
    public WebElement message;

    @FindBy(how = How.CLASS_NAME, using = "alert-success")
    public WebElement alertSuccess;

    public ContactUsPage(final WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
