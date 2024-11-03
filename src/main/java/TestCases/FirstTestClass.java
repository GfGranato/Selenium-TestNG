package TestCases;


public class FirstTestClass extends BaseTest {

    @Test(description="This method validates the sign up functionality")
    public void signUp() {
        LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);

    }

}
