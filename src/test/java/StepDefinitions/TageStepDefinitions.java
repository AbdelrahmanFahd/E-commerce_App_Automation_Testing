package StepDefinitions;


import Pages.Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import java.util.Random;


public class TageStepDefinitions {

    Page page;

    Random random = new Random();
    int indexOfTagElement = random.nextInt(14) + 1;

    WebElement tagElement() {
        String tagElement = String.format("/html/body/div[6]/div[3]/div/div[1]/div[3]/div[2]/div[1]/ul/li[%d]/a"
                , indexOfTagElement);

        return Hooks.driver.findElement(By.xpath(tagElement));
    }

    @And("User Click on tage")
    public void clickOnSearchButton() throws InterruptedException {
        page = new Page(Hooks.driver);

        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) Hooks.driver;
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(1000);
        tagElement().click();
        Thread.sleep(1000);
    }

    @Then("User Successfully search for product's tage")
    public void tagsAssertion() {

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(page.pageTitle.getText().contains(tagElement().getText()));
        softAssert.assertAll();

    }

}
