package StepDefinitions;


import Pages.Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.asserts.SoftAssert;


public class CompareListCartStepDefinitions {

    Page page;


    @Given("Scroll down and choose Apple MacBook and HTC One M8")
    public void chooseProducts() throws InterruptedException {
        page = new Page(Hooks.driver);
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) Hooks.driver;
        js.executeScript("window.scrollBy(0,1350)");

    }

    @When("Click on ADD TO Compare list")
    public void clickOnAddToCompareListButton() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) Hooks.driver;
        js.executeScript("window.scrollBy(0,250)");

        page.appleCompareListButton.click();
        Thread.sleep(2000);
        page.HTCCompareListButton.click();
        Thread.sleep(2000);
    }

    @Then("The product is added to the user's Compare list successfully")
    public void compareListAssertion() {

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(page.barNotification.getText().contains("The product has been added to your"));
        softAssert.assertAll();

    }

    @And("Go to Compare products list")
    public void compareList() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) Hooks.driver;
        js.executeScript("window.scrollBy(0,350)");
        Thread.sleep(1000);
        page.compareProductsListTab.click();
        Thread.sleep(2000);}

}
