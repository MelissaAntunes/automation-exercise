package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage {

    private WebDriver driver;

    // Account information
    private By accountInfoLabel = By.cssSelector("html > body > section > div > div > div > div:nth-of-type(1) > h2 > b");
    private By titleRadioButton = By.cssSelector("#id_gender2");
    private By passwordField = By.cssSelector("input[data-qa='password']");
    private By birthDayDropDown = By.cssSelector("select[data-qa='days']");
    private By birthMonthDropDown = By.cssSelector("select[data-qa='months']");
    private By birthYearDropDown = By.cssSelector("select[data-qa='years']");
    private By newsletterCheckbox = By.cssSelector("#newsletter");
    private By specialOffersCheckbox = By.cssSelector("#optin");

    // Address information
    private By firstNameField = By.cssSelector("input[data-qa^='first']");
    private By lastNameField = By.cssSelector("input[data-qa^='last']");
    private By companyField = By.cssSelector("input[data-qa='company']");
    private By addressField = By.cssSelector("input[data-qa='address']");
    private By address2Field = By.cssSelector("input[data-qa='address2']");
    private By countryField = By.cssSelector("select[data-qa='country']");
    private By stateField = By.cssSelector("input[data-qa='state']");
    private By cityField = By.cssSelector("input[data-qa='city']");
    private By zipCodeField = By.cssSelector("input[data-qa='zipcode']");
    private By mobileNumberField = By.cssSelector("input[data-qa='mobile_number']");
    private By createAccountButton = By.cssSelector("button[data-qa='create-account']");

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isAccountInfoDisplayed() {
        return driver.findElement(accountInfoLabel).isDisplayed();
    }

    // Account information
    public void setTitleRadioButton() {
        driver.findElement(titleRadioButton).click();
    }

    public void setPasswordField(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void selectBirthDayDropDown(String option) {
        Select birthDay = new Select(driver.findElement(birthDayDropDown));
        birthDay.selectByValue(option);
    }

    public void selectBirthMonthDropDown(String option) {
        Select birthMonth = new Select(driver.findElement(birthMonthDropDown));
        birthMonth.selectByValue(option);
    }

    public void selectBirthYearDropDown(String option) {
        Select birthYear = new Select(driver.findElement(birthYearDropDown));
        birthYear.selectByValue(option);
    }

    public void setNewsletterCheckbox() {
        driver.findElement(newsletterCheckbox).click();
    }

    public void setSpecialOffersCheckbox() {
        driver.findElement(specialOffersCheckbox).click();
    }

    // Address information
    public void setFirstNameField(String firstName) {
        driver.findElement(firstNameField).sendKeys(firstName);
    }

    public void setLastNameField(String lastName) {
        driver.findElement(lastNameField).sendKeys(lastName);
    }

    public void setCompanyField(String company) {
        driver.findElement(companyField).sendKeys(company);
    }

    public void setAddressField(String address) {
        driver.findElement(addressField).sendKeys(address);
    }

    public void setAddress2Field(String address2) {
        driver.findElement(address2Field).sendKeys(address2);
    }

    public void selectCountryField(String option) {
        Select country = new Select(driver.findElement(countryField));
        country.selectByValue(option);
    }

    public void setStateField(String state) {
        driver.findElement(stateField).sendKeys(state);
    }

    public void setCityField(String city) {
        driver.findElement(cityField).sendKeys(city);
    }

    public void setZipCodeField(String zipCode) {
        driver.findElement(zipCodeField).sendKeys(zipCode);
    }

    public void setMobileNumberField(String mobileNumber) {
        driver.findElement(mobileNumberField).sendKeys(mobileNumber);
    }

    public AccountCreatedPage clickCreateAccountButton() {
        driver.findElement(createAccountButton).click();
        return new AccountCreatedPage(driver);
    }

    public void fillAccountInfo(String password, String birthDay, String birthMonth,
                                String birthYear, String firstName, String lastName,
                                String company, String address, String address2,
                                String country, String state, String city,
                                String zipCode, String mobileNumber) {
        setTitleRadioButton();
        setPasswordField(password);
        selectBirthDayDropDown(birthDay);
        selectBirthMonthDropDown(birthMonth);
        selectBirthYearDropDown(birthYear);
        setNewsletterCheckbox();
        setSpecialOffersCheckbox();
        setFirstNameField(firstName);
        setLastNameField(lastName);
        setCompanyField(company);
        setAddressField(address);
        setAddress2Field(address2);
        selectCountryField(country);
        setStateField(state);
        setCityField(city);
        setZipCodeField(zipCode);
        setMobileNumberField(mobileNumber);
        clickCreateAccountButton();

    }





}
