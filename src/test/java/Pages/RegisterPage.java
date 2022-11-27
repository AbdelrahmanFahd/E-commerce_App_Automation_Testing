package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

    WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "ico-register")
    public WebElement registerTab;

    @FindBy(className = "ico-logout")
    public WebElement logoutTab;

    @FindBy(css = "input[type=\"radio\"]")
    public WebElement gender;

    @FindBy(id = "FirstName")
    public WebElement firstName;

    @FindBy(id = "LastName")
    public WebElement lastName;

    @FindBy(name = "DateOfBirthDay")
    public WebElement dayOfBirth;

    @FindBy(name = "DateOfBirthMonth")
    public WebElement MonthOfBirth;

    @FindBy(name = "DateOfBirthYear")
    public WebElement yearOfBirth;

    @FindBy(id = "Email")
    public WebElement email;

    @FindBy(id = "Company")
    public WebElement company;

    @FindBy(id = "Password")
    public WebElement password;

    @FindBy(id = "ConfirmPassword")
    public WebElement confirmPassword;

    @FindBy(id = "register-button")
    public WebElement registerButton;

    @FindBy(css = "div[class=\"result\"]")
    public WebElement result;

    @FindBy(css = "a[class=\"button-1 register-continue-button\"]")
    public WebElement continueButton;


}
