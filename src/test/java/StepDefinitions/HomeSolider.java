package StepDefinitions;

import Pages.Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.asserts.SoftAssert;

public class HomeSolider {

    Page page;

    @Given("Scroll down")
    public void home() throws InterruptedException {
        page = new Page(Hooks.driver);
        JavascriptExecutor js = (JavascriptExecutor) Hooks.driver;
        js.executeScript("window.scrollBy(0,50)");
        Thread.sleep(1000);
    }

    @When("User click on Nokia banner Controller")
    public void clickOnFacebookButton() {

        page.nokiaSlider.click();
    }

    @When("User click on Iphone banner Controller")
    public void clickOnTwitterButton() {

        page.appleSlider.click();
    }

    @Then("User can switch to Nokia banner")
    public void facebookAssertion() throws InterruptedException {
        Thread.sleep(3000);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(page.sliderImage.getAttribute("src").contains("banner_1.jpg"));
        softAssert.assertAll();
    }

    @Then("User can switch to Iphone banner")
    public void twitterAssertion() throws InterruptedException {
        Thread.sleep(3000);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(page.sliderImage.getAttribute("src").contains("banner_2.jpg"));
        softAssert.assertAll();
    }

}
