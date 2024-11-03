package core;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        super();
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(fileReader.getImplicityWait()));
    }
}