package StepDefinitions;


import Pages.Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class CurrencySwitchDefinitions {

    Page page;
    Select currencyBox;
    String currency;

    @Given("Look for products currency")
    public void clickLoginTabAndForgetPassword() throws InterruptedException {

        page = new Page(Hooks.driver);
        Thread.sleep(1000);
        currency = page.priceOfItem.getText().contains("€") ? "Euro" : "US Dollar";

        currencyBox = new Select(page.currencyDropDox);

        JavascriptExecutor js = (JavascriptExecutor) Hooks.driver;
        js.executeScript("window.scrollBy(0,1350)");
        Thread.sleep(1000);
    }

    @When("User Change Currency")
    public void clickOnSearchButton() throws InterruptedException {
        Thread.sleep(1000);
        currencyBox.selectByVisibleText(currency.equals("Euro") ? "US Dollar" : "Euro");

    }

    @Then("User could find the selected currency")
    public void searchAssertion() throws InterruptedException {
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) Hooks.driver;
        js.executeScript("window.scrollBy(0,1350)");
        SoftAssert softAssert = new SoftAssert();
        String currencyItems = currency.equals("Euro")?"$":"€";
        softAssert.assertTrue(page.priceOfItem.getText().contains(currencyItems));
        Thread.sleep(2000);
        softAssert.assertAll();
    }

}
