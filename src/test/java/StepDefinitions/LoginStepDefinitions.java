package StepDefinitions;


import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

public class LoginStepDefinitions {

    LoginPage loginPage;

    @Given("Click on Login Tab")
    public void open_browser() throws InterruptedException {

        loginPage = new LoginPage(Hooks.driver);
        loginPage.loginTab.click();
        Thread.sleep(1000);
    }


    @When("^User Enter \"(.*)\" and \"(.*)\"$")
    public void enterDate(String email, String password) {
        loginPage.email.sendKeys(email);
        loginPage.password.sendKeys(password);
    }

    @And("Click on login Button")
    public void clickLoginButton() throws InterruptedException {
        loginPage.loginButton.click();
        Thread.sleep(1000);
    }

    @Then("User could login Successfully")
    public void loginAssertion() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/"));
        softAssert.assertTrue(loginPage.myAccountTab.isDisplayed());
        softAssert.assertAll();
    }


}
