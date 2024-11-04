package TestCases;

import core.ConfigFileReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    static WebDriver driver;
    static WebDriverWait wait;
    public static ConfigFileReader fileReader = new ConfigFileReader();

    @BeforeClass
    public void testSetup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void openBrowser() {
        driver.get(fileReader.getUrl());
        System.out.println("We are currently on the following URL" +driver.getCurrentUrl());
    }

    @AfterMethod
    public void postSignUp() {
        System.out.println(driver.getCurrentUrl());
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}