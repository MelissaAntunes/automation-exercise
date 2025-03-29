package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    // Not logged in
    private By loginSignUpLink = By.xpath("//a[@href='/login']");

    // Logged in
    private By loggedInAsLabel = By.xpath("//a[.//b]");
    private By deleteAccountButton = By.xpath("//a[@href='/delete_account']");



    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginSignUpPage goToLoginSignUpLink() {
        driver.findElement(loginSignUpLink).click();
        return new LoginSignUpPage(driver);
    }

    public boolean isLoggedInAsUsernameDisplayed() {
        return driver.findElement(loggedInAsLabel).isDisplayed();
    }

    public DeleteAccountPage clickDeleteAccountButton() {
        driver.findElement(deleteAccountButton).click();
        return new DeleteAccountPage(driver);
    }

}
