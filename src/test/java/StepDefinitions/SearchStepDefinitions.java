package StepDefinitions;


import Pages.Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.asserts.SoftAssert;

public class SearchStepDefinitions {

    Page page;

    String searchWord;

    @Given("^Type \"(.*)\" on search text box$")
    public void searchItem(String searchKeyword) throws InterruptedException {

        page = new Page(Hooks.driver);
        Thread.sleep(1000);
        page.searchTextBox.sendKeys(searchKeyword);
        searchWord = searchKeyword;
        Thread.sleep(1000);
    }

    @When("Click on Search button")
    public void clickOnSearchButton() {
        page.searchButton.click();
    }

    @Then("User could find Samsung products")
    public void searchAssertion() throws InterruptedException {
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) Hooks.driver;
        js.executeScript("window.scrollBy(0,350)");

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(searchWord, page.searchKeyword.getAttribute("value"));

        Thread.sleep(1000);
        softAssert.assertAll();
    }

}
