package StepDefinitions;


import Pages.LoginPage;
import Pages.RestPasswordPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

public class RestPasswordStepDefinitions {

    RestPasswordPage restPasswordPage;

    @Given("Click on Login Tab and ForgetPassword button")
    public void clickLoginTabAndForgetPassword () throws InterruptedException {

        restPasswordPage = new RestPasswordPage(Hooks.driver);
        restPasswordPage.loginTab.click();
        Thread.sleep(1000);
        restPasswordPage.forgotPasswordButton.click();
    }


    @When("^User Enter: \"(.*)\"$")
    public void enterEmail(String email) {
        restPasswordPage.email.sendKeys(email);

    }

    @And("Click on RECOVER Button")
    public void recoverButton() {
        restPasswordPage.recoverButton.click();
    }

    @Then("User receive Message to his email Successfully")
    public void loginAssertion() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(restPasswordPage.notificationMessage.getText().contains("Email with instructions has been sent to you."));
        softAssert.assertAll();
        Thread.sleep(1000);
    }


}
