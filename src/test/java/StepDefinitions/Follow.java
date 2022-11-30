package StepDefinitions;

import Pages.Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.asserts.SoftAssert;

public class Follow {

    Page page;

    @Given("Scroll down to the bottom")
    public void home() throws InterruptedException {
        page = new Page(Hooks.driver);
        JavascriptExecutor js = (JavascriptExecutor) Hooks.driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        Thread.sleep(1000);
    }

    @When("User click on Facebook button")
    public void clickOnFacebookButton() {

        page.facebookButton.click();
    }

    @When("User click on Twitter button")
    public void clickOnTwitterButton() {

        page.twitterButton.click();
    }

    @When("User click on Youtube button")
    public void clickOnYoutubeButton() {

        page.youtubeButton.click();
    }

    @When("User click on RSS button")
    public void clickOnRssButton() {

        page.rssButton.click();
    }

    @Then("User navigate to Facebook websites")
    public void facebookAssertion() throws InterruptedException {
        Thread.sleep(2000);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(Hooks.driver.getCurrentUrl().contains("www.facebook.com/nopCommerce"));
        softAssert.assertAll();
    }

    @Then("User navigate to Twitter websites")
    public void twitterAssertion() throws InterruptedException {
        Thread.sleep(2000);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(Hooks.driver.getCurrentUrl().contains("twitter.com/nopCommerce"));
        softAssert.assertAll();
    }

    @Then("User navigate to Youtube websites")
    public void youtubeAssertion() throws InterruptedException {
        Thread.sleep(2000);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(Hooks.driver.getCurrentUrl().contains("www.youtube.com/user/nopCommerce"));
        softAssert.assertAll();

    }

    @Then("User navigate to RSS websites")
    public void rssAssertion() throws InterruptedException {
        Thread.sleep(2000);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(Hooks.driver.getCurrentUrl().contains("rss"));
        softAssert.assertAll();

    }
}
