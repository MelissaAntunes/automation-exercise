package sign_up;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginSignUpPage;
import pages.SignUpPage;

public class SignUpTests extends BaseTest {

    @Test
    public void testSuccessfulSignUp() {
        HomePage homePage = new HomePage(driver);
        LoginSignUpPage loginSignUpPage = homePage.goToLoginSignUpLink();

        Assert.assertTrue(loginSignUpPage.verifyIfNewUserSignUpLabelIsVisible(),
                "New user sign up label is not visible");

        loginSignUpPage.signUp("Mariaa", "mariaa123arriba@gmail.com");

        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.fillAccountInfo(
                "123123",
                "1",
                "1",
                "1991",
                "Maria",
                "Maria",
                "Microsoft",
                "aaaaaaa",
                "aaaaaaaa",
                "Canada",
                "Montreal",
                "Laval",
                "1234567890",
                "+55119987653647");
    }

}
