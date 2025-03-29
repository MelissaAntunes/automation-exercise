package test_case_1;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class RegisterUserTest extends BaseTest {

    @Test
    public void testSignUp() {
        HomePage homePage = new HomePage(driver);
        LoginSignUpPage loginSignUpPage = homePage.goToLoginSignUpLink();
        Assert.assertTrue(loginSignUpPage.isNewUserSignUpLabelDisplayed(),
                "Expected 'New User Signup!' to be visible, but it wasn't.");
        loginSignUpPage.signUp("QA Engineer", "qaengineer321@gmail.com");

        SignUpPage signUpPage = new SignUpPage(driver);
        Assert.assertTrue(signUpPage.isAccountInfoDisplayed(),
                "Expected 'ENTER ACCOUNT INFORMATION' to be visible, but it wasn't.");
        signUpPage.fillAccountInfo(
                "password",
                "1",
                "1",
                "1991",
                "first name",
                "last name",
                "selenium",
                "selenium avenue",
                "selenium avenue 2",
                "Canada",
                "Montreal",
                "Laval",
                "1234567890",
                "+1119987653647");

        AccountCreatedPage accountCreatedPage = new AccountCreatedPage(driver);
        Assert.assertTrue(accountCreatedPage.isAccountCreatedDisplayed(),
                "Expected 'ACCOUNT CREATED' to be visible, but it wasn't.");
        accountCreatedPage.clickContinueButton();

        Assert.assertTrue(homePage.isLoggedInAsUsernameDisplayed(),
                "Expected 'Logged in as username' to be visible, but it wasn't." );
        homePage.clickDeleteAccountButton();

        DeleteAccountPage deleteAccountPage = new DeleteAccountPage(driver);
        Assert.assertTrue(deleteAccountPage.isAccountDeletedDisplayed(),
                "Expected 'ACCOUNT DELETED' to be visible, but it wasn't.");
        deleteAccountPage.clickContinueButton();
    }

}
