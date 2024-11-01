package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage {

    public final WebDriver webdriver;

    public LandingPage(WebDriver webdriver) {
        this.webdriver = webdriver;
    }

    @FindBy(id = "theButtonId")
    WebElement theButton;
}