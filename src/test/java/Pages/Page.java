package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public class Page {

    WebDriver driver;

    public Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(id = "small-searchterms")
    public WebElement searchTextBox;

    @FindBy(css = "form[id=\"small-search-box-form\"]>button[type=\"submit\"]")
    public WebElement searchButton;

    @FindBy(id = "q")
    public WebElement searchKeyword;

    @FindBy(id = "customerCurrency")
    public WebElement currencyDropDox;

    @FindBy(css = "div[class=\"prices\"]>span")
    public WebElement priceOfItem;

    @FindBy(css = "div[class=\"page-title\"]")
    public WebElement pageTitle;

    @FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li[3]/ul/li[1]/a")
    public WebElement shoesTab;

    @FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li[3]/a")
    public WebElement apparelTab;

    @FindBy(id = "attribute-option-15")
    public WebElement redColor;


    @FindBy(css = "button[class=\"button-1 add-to-cart-button\"]")
    public WebElement addToCartButton;

    @FindBy(css = "div[class=\"add-to-wishlist\"]>button[class=\"button-2 add-to-wishlist-button\"]")
    public WebElement wishlistButton;

    @FindBy(xpath = "//*[@id=\"bar-notification\"]/div/p")
    public WebElement barNotification;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[2]/div/div[2]/div[3]/div[2]/button[2]")
    public WebElement appleCompareListButton;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/div[3]/div[2]/button[2]")
    public WebElement HTCCompareListButton;

    @FindBy(xpath = "/html/body/div[6]/div[4]/div[1]/div[2]/ul/li[5]/a")
    public WebElement compareProductsListTab;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div/div/div[2]/div[3]/div[2]/button[1]")
    public WebElement firstItemSearchedAdd;

    @FindBy(xpath = "/html/body/div[6]/div[4]/div[1]/div[3]/ul/li[4]/a")
    public WebElement shoppingCartTab;

    @FindBy(xpath = "//*[@id=\"termsofservice\"]")
    public WebElement termsCheckBox;

    @FindBy(xpath = "//*[@id=\"checkout\"]")
    public WebElement checkoutButton;



}
