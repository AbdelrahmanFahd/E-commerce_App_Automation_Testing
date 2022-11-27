package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Hooks {
    public static WebDriver driver;

    public static void homePage() {
        driver.navigate().to("https://demo.nopcommerce.com/");
    }

    public static void logout() {
        driver.findElement(By.className("ico-logout")).click();
    }

    @Before
    public void openBrowser()   {
        // 1: Bridge between test scripts and browsers
        String chromePath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);

        // 2: New Object of WebDriver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        homePage();
    }

    @After
    public  void closeBrowser() {
        driver.quit();
    }

}
