package StepDefinitions;


import Pages.Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;



public class SelectCategoriesDefinitions {

    Page page;

    @Given("Click on Apparel Menu then on Shoes")
    public void clickLoginTabAndForgetPassword() throws InterruptedException {

        page = new Page(Hooks.driver);
        Thread.sleep(1000);
        Actions actions = new Actions(Hooks.driver);
        actions.moveToElement(page.apparelTab).build().perform();
        Thread.sleep(1000);
        page.shoesTab.click();

    }

    @When("User choose Filter with red")
    public void clickOnSearchButton() throws InterruptedException {
        Thread.sleep(1000);
        page.redColor.click();
        Thread.sleep(2000);
    }

    @Then("User successfully filter results")
    public void filterAssertion() {}

}
