package StepDefinitions;


import Pages.Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import java.util.Random;

public class FilterDefinitions {

    Page page;
    Random random = new Random();

    int randomMenuNumber = random.nextInt(6) + 1;

    WebElement getRandomSubMenuItems() {

        int randomSubMenuNumber = random.nextInt(2) + 1;

        String randomMenuXpath = String.format("/html/body/div[6]/div[2]/ul[1]/li[%d]/ul/li[%d]/a", randomMenuNumber, randomSubMenuNumber);

        return Hooks.driver.findElement(By.xpath(randomMenuXpath));
    }

    WebElement getRandomMenuItems() {


        String randomMenuXpath = String.format("/html/body/div[6]/div[2]/ul[1]/li[%d]/a", randomMenuNumber);

        return Hooks.driver.findElement(By.xpath(randomMenuXpath));
    }


    @Given("Hover the header menu and select random category then hover it")
    public void clickLoginTabAndForgetPassword() throws InterruptedException {

        page = new Page(Hooks.driver);
        Thread.sleep(1000);
        Actions actions = new Actions(Hooks.driver);
        actions.moveToElement(getRandomMenuItems()).build().perform();

        Thread.sleep(2000);
    }

    @When("Click on random sub-category if found")
    public void clickOnSearchButton() throws InterruptedException {
        if (randomMenuNumber <= 3)
            getRandomSubMenuItems().click();
        else
            getRandomMenuItems().click();
        Thread.sleep(2000);
    }

    @Then("User could open sub-category page")
    public void searchAssertion() throws InterruptedException {

        SoftAssert softAssert = new SoftAssert();
        String expectedResult = randomMenuNumber <= 3 ? getRandomSubMenuItems().getText() : getRandomMenuItems().getText();
        softAssert.assertTrue(page.pageTitle.getText().contains(expectedResult));
        softAssert.assertAll();
    }

}
