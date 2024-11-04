package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.LandingPage;

public class FirstTestClass extends BaseTest {

    @Test(description="This method validates the sign up functionality")
    public void signUp() {
        LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);

    }

}
