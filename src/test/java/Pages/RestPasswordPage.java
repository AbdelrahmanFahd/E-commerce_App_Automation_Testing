package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RestPasswordPage {

    WebDriver driver;

    public RestPasswordPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "ico-login")
    public WebElement loginTab;

    @FindBy(className = "forgot-password")
    public WebElement forgotPasswordButton;

    @FindBy(name = "send-email")
    public WebElement recoverButton;

    @FindBy(id = "Email")
    public WebElement email;

    @FindBy(css = "div[class=\"bar-notification success\"]>p[class=\"content\"]")
    public WebElement notificationMessage;


}
