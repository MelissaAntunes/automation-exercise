package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginSignUpPage {

    private WebDriver driver;

    private By newUserSignUpLabel = By.xpath("//div[@class='signup-form']/h2");

    private By signUpNameField = By.cssSelector("input[data-qa='signup-name']");
    private By signUpEmailField = By.cssSelector("input[data-qa='signup-email']");
    private By signUpButton = By.cssSelector("button[data-qa='signup-button']");

    private By loginEmailField = By.cssSelector("input[data-qa='login-email']");
    private By loginPasswordField = By.cssSelector("input[data-qa='login-password']");
    private By loginButton = By.cssSelector("button[data-qa='login-button']");

    public LoginSignUpPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setSignUpNameField(String name) {
        driver.findElement(signUpNameField).sendKeys(name);
    }

    public void setSignUpEmailField(String email) {
        driver.findElement(signUpEmailField).sendKeys(email);
    }

    public SignUpPage clickSignUpButton() {
        driver.findElement(signUpButton).click();
        return new SignUpPage(driver);
    }

    public void setLoginEmailField(String email) {
        driver.findElement(loginEmailField).sendKeys(email);
    }

    public void setLoginPasswordField(String password) {
        driver.findElement(loginPasswordField).sendKeys(password);
    }

    public HomePage clickLoginButton() {
        driver.findElement(loginButton).click();
        return new HomePage(driver);
    }

    public boolean isNewUserSignUpLabelDisplayed() {
        return driver.findElement(newUserSignUpLabel).isDisplayed();
    }

    public void signUp(String name, String email) {
        setSignUpNameField(name);
        setSignUpEmailField(email);
        clickSignUpButton();
    }

    public void login(String email, String password) {
        setLoginEmailField(email);
        setLoginPasswordField(password);
        clickLoginButton();
    }
}
