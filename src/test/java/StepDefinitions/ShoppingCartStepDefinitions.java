package StepDefinitions;


import Pages.Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import java.util.Random;


public class ShoppingCartStepDefinitions {

    Page page;


    Random random = new Random();
    int indexOfProductElement = random.nextInt(2) + 2;

    WebElement productElement() {
        String productElement = String.format("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[%d]/div/div[1]/a/img"
                , indexOfProductElement);

        return Hooks.driver.findElement(By.xpath(productElement));
    }

    @Given("Scroll down and choose a random product")
    public void chooseRandomProduct() throws InterruptedException {
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) Hooks.driver;
        js.executeScript("window.scrollBy(0,1350)");

    }

    @And("Click on product")
    public void clickOnSearchButton() throws InterruptedException {
        page = new Page(Hooks.driver);
        Thread.sleep(1000);
        productElement().click();
        Thread.sleep(1000);
    }

    @When("Click on ADD TO CART button")
    public void clickOnAddToCartButton() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) Hooks.driver;
        js.executeScript("window.scrollBy(0,500)");

        page.addToCartButton.click();
        Thread.sleep(2000);
    }

    @Then("The product is added to the user's shopping cart successfully")
    public void searchAssertion() {

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(page.barNotification.getText().contains("The product has been added to your"));
        softAssert.assertAll();

    }

}
