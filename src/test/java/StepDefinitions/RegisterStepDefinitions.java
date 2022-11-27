package StepDefinitions;

import Pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class RegisterStepDefinitions {

    RegisterPage registerPage;

    @Given("Click on Register Button")
    public void open_browser() throws InterruptedException {

        registerPage = new RegisterPage(Hooks.driver);
        registerPage.registerTab.click();
        Thread.sleep(1000);

    }


    @When("User Choose any Gender")
    public void pickGender() throws InterruptedException {
        registerPage.gender.click();
        Thread.sleep(1000);
    }

    @And("User enter First name and Last name")
    public void firsAndLastName() {
        registerPage.firstName.sendKeys("Test");
        registerPage.lastName.sendKeys("Test");
    }

    @And("User Select Date of Birth: Select [Day, Month, Year]")
    public void DateOfBirth() {
        registerPage.dayOfBirth.sendKeys("8");
        registerPage.MonthOfBirth.sendKeys("A");
        registerPage.yearOfBirth.sendKeys("1998");
    }

    @And("^User enter email: \"(.*)\"$")
    public void enterEmail(String email) {
        registerPage.email.sendKeys(email);
    }

    @And("User enter Company name")
    public void enterCompanyName() {
        registerPage.company.sendKeys("IEEE");

    }

    @And("^User Enter Password and Confirm: \"(.*)\"$")
    public void enterPassword(String password) {
        registerPage.password.sendKeys(password);
        registerPage.confirmPassword.sendKeys(password);
    }

    @And("Click on REGISTER Button")
    public void registerButton() throws InterruptedException {
        Thread.sleep(1000);
        registerPage.registerButton.click();
    }

    @Then("User could register successfully")
    public void RegistrationAssertion() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(registerPage.result.getText().contains("Your registration completed"));
        softAssert.assertAll();

    }

    @And("Click on Continue Button")
    public void clickContinue() throws InterruptedException {
        Thread.sleep(1000);
        registerPage.continueButton.click();
        Thread.sleep(1000);

    }

}
