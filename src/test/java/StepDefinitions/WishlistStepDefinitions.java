package StepDefinitions;


import Pages.Page;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.asserts.SoftAssert;


public class WishlistStepDefinitions {

    Page page;


    @When("Click on ADD TO Wishlist")
    public void clickOnAddToWishListButton() throws InterruptedException {
        page=new Page(Hooks.driver);

        JavascriptExecutor js = (JavascriptExecutor) Hooks.driver;
        js.executeScript("window.scrollBy(0,500)");

        page.wishlistButton.click();
        Thread.sleep(2000);
    }

    @Then("The product is added to the user's Wishlist successfully")
    public void wishListAssertion() {

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(page.barNotification.getText().contains("The product has been added to your"));
        softAssert.assertAll();

    }

}
