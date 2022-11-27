package StepDefinitions;


import Pages.CheckoutPage;
import Pages.LoginPage;
import Pages.Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import java.util.Random;


public class CompleteOrderCartStepDefinitions {

    Page page;

    LoginPage loginPage;

    CheckoutPage checkoutPagePage;

    @Given("^User Login with \"(.*)\" and \"(.*)\"$")
    public void loginUser(String email, String password) throws InterruptedException {
        loginPage = new LoginPage(Hooks.driver);
        page = new Page(Hooks.driver);

        loginPage.loginTab.click();
        loginPage.email.sendKeys(email);
        loginPage.password.sendKeys(password);
        loginPage.loginButton.click();
        Thread.sleep(1000);
    }

    @When("^User search for \"(.*)\" , \"(.*)\" and add them to CART$")
    public void searchForItems(String firstItem, String secondItem) throws InterruptedException {
        Actions actions = new Actions(Hooks.driver);

        page.searchTextBox.sendKeys(firstItem);
        page.searchButton.click();
        JavascriptExecutor js = (JavascriptExecutor) Hooks.driver;
        js.executeScript("\"window.scrollBy(0,350)\"");
        page.firstItemSearchedAdd.click();
        Thread.sleep(2000);

        actions.sendKeys(Keys.PAGE_UP);
        page.searchTextBox.sendKeys(secondItem);

        page.searchButton.click();
        actions.sendKeys(Keys.PAGE_DOWN);
        page.firstItemSearchedAdd.click();
        Thread.sleep(2000);


    }

    @And("User Click on Shopping cart")
    public void clickOnShoppingCart() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) Hooks.driver;
        js.executeScript("\"window.scrollBy(0,1000)\"");
        Thread.sleep(1000);

        page.shoppingCartTab.click();

    }

    @And("User Accept terms and Click on CheckOut Button")
    public void clickCheckOut() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) Hooks.driver;
        js.executeScript("\"window.scrollBy(0,500)\"");
        Thread.sleep(1000);
        page.termsCheckBox.click();
        page.checkoutButton.click();

    }

    @And("User Click Fill Address and Click Continue")
    public void fillAddress() throws InterruptedException {
        checkoutPagePage = new CheckoutPage(Hooks.driver);
        JavascriptExecutor js = (JavascriptExecutor) Hooks.driver;
        js.executeScript("\"window.scrollBy(0,250)\"");
        Thread.sleep(1000);

        Select countrySelect = new Select(checkoutPagePage.countryDropDownButton);
        Random randomIndex = new Random();
        countrySelect.selectByIndex(randomIndex.nextInt(20) + 1);

        // Fill data
        checkoutPagePage.city.sendKeys("Cairo");
        checkoutPagePage.address1.sendKeys("Nasr City");
        checkoutPagePage.address2.sendKeys("Helwan");
        checkoutPagePage.zipCode.sendKeys("1253");
        checkoutPagePage.phoneNumber.sendKeys("+025554885");
        checkoutPagePage.faxNumber.sendKeys("459856");

        checkoutPagePage.continueButton.click();
        Thread.sleep(1000);

    }

    @And("User Click Continue Button on Shipping method")
    public void clickShippingContinueButton() {
        checkoutPagePage.shippingButton.click();

    }

    @And("User Click Continue Button on payment method")
    public void clickPaymentButton() throws InterruptedException {
        Thread.sleep(1000);
        checkoutPagePage.paymentButton.click();
        Thread.sleep(1000);

    }

    @And("User Click Continue Button on payment information")
    public void clickPaymentInfoButton() {
        checkoutPagePage.paymentInfoButton.click();

    }

    @And("User Click Confirm Button")
    public void clickConfirmButton() throws InterruptedException {
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) Hooks.driver;
        js.executeScript("\"window.scrollBy(0,500)\"");
        Thread.sleep(2000);

        checkoutPagePage.confirmButton.click();
        Thread.sleep(1000);
    }

    @Then("User could ordered successfully")
    public void orderAssertion() throws InterruptedException {
        Thread.sleep(3000);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(checkoutPagePage.titleMessage.getText().contains("Your order has been successfully processed!"));
        softAssert.assertAll();

    }


}
