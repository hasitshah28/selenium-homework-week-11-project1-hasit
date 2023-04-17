package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setup() {
        openBrowser(baseUrl);
    }

    @Test
    public void UserShouldNavigateToLoginPageSuccessfully() {
        //Find Login link and click on login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        String expectedMessage = "Welcome, Please Sign In!";

        WebElement actualTextElement = driver.findElement(By.xpath("//h1[contains(text(), 'Welcome, Please Sign In!')]"));
        String actualMessage = actualTextElement.getText();
        Assert.assertEquals("Redirected to login page", expectedMessage, actualMessage);

    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();

        //Enter username
        driver.findElement(By.id("Email")).sendKeys("hasitshah80@gmail.com");

        // Enter password
        driver.findElement(By.id("Password")).sendKeys("Liverpool23");

        // Click on Login button
        driver.findElement(By.xpath("//button[@class = 'button-1 login-button']")).click();

        //Verify the ‘Log out’ text is display
        //WebElement logoutLink = driver.findElement(By.linkText("Log out"));
        //logoutLink.click();
        String expectedMessage = "Log out";

        WebElement actualTextElement = driver.findElement(By.xpath("//a[contains(text(), 'Log out')]"));
        String actualMessage = actualTextElement.getText();
        Assert.assertEquals("Verify log out text displayed", expectedMessage, actualMessage);
    }

    @Test
    public void verifyTheErrorMessage() {

        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();

        //Enter username
        driver.findElement(By.id("Email")).sendKeys("hasitshah@gmail.com");

        // Enter password
        driver.findElement(By.id("Password")).sendKeys("Liverpool");

        // Click on Login button
        driver.findElement(By.xpath("//button[@class = 'button-1 login-button']")).click();

        //Verify the error message ‘Login was unsuccessful.
        //Please correct the errors and try again. No customer account found’
        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        WebElement actualTextElement = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']"));
        String actualMessage = actualTextElement.getText();
        Assert.assertEquals("Error message not displayed", expectedMessage, actualMessage);

    }

    public void closeBrowser() {
        driver.quit();
    }
}
