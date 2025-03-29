package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeleteAccountPage {

    private WebDriver driver;

    private By accountDeletedLabel = By.cssSelector("b");
    private By continueButton = By.cssSelector("a[data-qa='continue-button']");

    public DeleteAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isAccountDeletedDisplayed() {
        return driver.findElement(accountDeletedLabel).isDisplayed();
    }

    public HomePage clickContinueButton() {
        driver.findElement(continueButton).click();
        return new HomePage(driver);
    }
}
