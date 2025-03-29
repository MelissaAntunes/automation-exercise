package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;
import pages.LoginSignUpPage;
import pages.SignUpPage;

public class BaseTest {

    public WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        driver = new ChromeDriver();
        driver.get("https://www.automationexercise.com/");
        driver.manage().window().maximize();

        String title = driver.getTitle();
        if (title.equals("Automation Exercise")) {
            System.out.println("Home page is visible");
        } else {
            System.out.println("Home page is not visible");
        }

    }

    @AfterClass
    public void tearDown() {
      driver.quit();
    }
}
