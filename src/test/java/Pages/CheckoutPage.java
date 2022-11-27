package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
    WebDriver driver;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"BillingNewAddress_CountryId\"]")
    public WebElement countryDropDownButton;

    @FindBy(xpath = "//*[@id=\"BillingNewAddress_City\"]")
    public WebElement city;

    @FindBy(xpath = "//*[@id=\"BillingNewAddress_Address1\"]")
    public WebElement address1;

    @FindBy(xpath = "//*[@id=\"BillingNewAddress_Address2\"]")
    public WebElement address2;

    @FindBy(xpath = "//*[@id=\"BillingNewAddress_ZipPostalCode\"]")
    public WebElement zipCode;

    @FindBy(xpath = "//*[@id=\"BillingNewAddress_PhoneNumber\"]")
    public WebElement phoneNumber;

    @FindBy(xpath = "//*[@id=\"BillingNewAddress_FaxNumber\"]")
    public WebElement faxNumber;

    @FindBy(xpath = "//*[@id=\"billing-buttons-container\"]/button[4]")
    public WebElement continueButton;

    @FindBy(xpath = "//*[@id=\"shipping-method-buttons-container\"]/button")
    public WebElement shippingButton;

    @FindBy(xpath = "//*[@id=\"payment-method-buttons-container\"]/button")
    public WebElement paymentButton;

    @FindBy(xpath = "//*[@id=\"payment-info-buttons-container\"]/button")
    public WebElement paymentInfoButton;

    @FindBy(xpath = "//*[@id=\"confirm-order-buttons-container\"]/button")
    public WebElement confirmButton;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div/div[1]/strong")
    public WebElement titleMessage;


}
