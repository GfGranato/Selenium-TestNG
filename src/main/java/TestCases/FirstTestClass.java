package TestCases;

import core.ConfigFileReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import pages.LandingPage;

public class FirstTestClass {

    static WebDriver driver;
    static WebDriverWait wait;
    static ConfigFileReader fileReader = new ConfigFileReader();

    @BeforeClass
    public void testSetup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(fileReader.getImplicityWait()));
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void openBrowser() {
        driver.get(fileReader.getUrl());
        System.out.println("We are currently on the following URL" +driver.getCurrentUrl());
    }

    @Test(description="This method validates the sign up functionality")
    public void signUp() {
        LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);

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
