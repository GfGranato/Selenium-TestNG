package core;

public class BaseTest {
    static WebDriver driver;
    static WebDriverWait wait;
    static ConfigFileReader fileReader = new ConfigFileReader();

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