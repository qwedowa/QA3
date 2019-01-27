package com.Intive.Patronage.tests.pages;

import org.omg.PortableInterceptor.HOLDING;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class WomenPage {
    private WebDriver driver;
    private static String AUTOMATIONPRACT_URL = "http://automationpractice.com";
    public void openAutomationPracticePage() {
        driver.get(AUTOMATIONPRACT_URL);}

    private static String WOMEN_URL = "http://automationpractice.com/index.php?id_category=3&controller=category";
    public void openWomenCategory() {
        driver.get(WOMEN_URL);
    }

    @FindBy(how = How.ID, using = "email")
    public WebElement emailAddress;

    @FindBy(how = How.ID, using = "passwd")
    public WebElement password;

    @FindBy(how = How.ID, using = "SubmitLogin")
    public WebElement submitLoginSign;

    @FindBy(how = How.CLASS_NAME, using = "button lnk_view btn btn-default")
    public WebElement anyProduct;

    @FindBy(how = How.ID, using = "new_comment_tab_btn")
    public WebElement addReview;

    @FindBy(how = How.ID, using = "comment_title")
    public WebElement reviewTitle;

    @FindBy(how = How.ID, using = "submitNewMessage")
    public WebElement sendReview;

    @FindBy(how = How.ID, using = "content")
    public WebElement reviewComment;

    @FindBy(how = How.CLASS_NAME, using = "fancybox-inner")
    public WebElement addedReview;

    @FindBy(how = How.ID, using = "add_to_cart")
    public WebElement addToCart;

    @FindBy(how = How.CLASS_NAME, using = "button ajax_add_to_cart_button btn btn-default")
    public WebElement addToCartButton;

    @FindBy(how = How.CLASS_NAME, using = "shopping_cart")
    public WebElement shoppingCart;

    @FindBy(how = How.ID,using = "summary_products_quantity")
    public WebElement cartSummary;

    @FindBy(how = How.ID,using = "layered_category_8")
    public WebElement dressesFilter;

    @FindBy(how = How.CLASS_NAME, using = "product-count")
    public WebElement productCount;

    @FindBy(how = How.ID, using = "layered_quantity_1")
    public WebElement availabilityFilter;

    @FindBy(how = How.CLASS_NAME, using = "add_to_compare")
    public WebElement addToCompare;

    @FindBy(how = How.CLASS_NAME, using = "btn btn-default button button-medium bt_compare bt_compare")
    public WebElement compareButton;

    @FindBy(how = How.CLASS_NAME,using = "products_block table-responsive")
    public WebElement comparedOneProduct;

    @FindBy(how = How.CLASS_NAME,using = "span_link no-print")
    public WebElement viewLarger;

    @FindBy(how = How.CLASS_NAME,using = "fancybox-skin")
    public WebElement largerPhoto;

    @FindBy(how = How.ID,using = "view_scroll_right")
    public WebElement rightArrow;

    @FindBy(how = How.ID,using = "view_scroll_left")
    public WebElement leftArrow;



        public WomenPage(final WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
