package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountCreatedPage {

    private WebDriver driver;

    private By accountCreatedLabel = By.cssSelector("b");
    private By continueButton = By.cssSelector("a[data-qa='continue-button']");

    public AccountCreatedPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isAccountCreatedDisplayed() {
        return driver.findElement(accountCreatedLabel).isDisplayed();
    }

    public HomePage clickContinueButton() {
        driver.findElement(continueButton).click();
        return new HomePage(driver);
    }
}
