package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setup() {
        openBrowser(baseUrl);
    }

    @Test
    public void UserShouldNavigateToRegisterPageSuccessfully() {
        // click on the ‘Register’ link
        driver.findElement(By.linkText("Register")).click();
        //verify the text "Register"
        String expectedMessage = "Register";
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[contains(text(), 'Register')]"));
        String actualMessage = actualTextElement.getText();
        Assert.assertEquals("Register text found", expectedMessage, actualMessage);
        ;
    }

    @Test
    public void userShouldRegisterAccountSuccessfully() {
        // click on Register link
        driver.findElement(By.linkText("Register")).click();

        //select gender radio button
        driver.findElement(By.id("gender-male")).click();

        //enter firstname
        driver.findElement(By.id("FirstName")).sendKeys("has");

        //enter last name
        driver.findElement(By.id("LastName")).sendKeys("Shah");

        //Select Day Month Year
        driver.findElement(By.name("DateOfBirthDay")).sendKeys("28");
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("February");
        driver.findElement(By.name("DateOfBirthYear")).sendKeys("1980");

        //Enter email address
        driver.findElement(By.id("Email")).sendKeys("admin12@gmail.com");

        //Enter Password
        driver.findElement(By.id("Password")).sendKeys("abcl23");

        //confirm password
        driver.findElement(By.name("ConfirmPassword")).sendKeys("abcl23");

        //click on register button
        driver.findElement(By.xpath("//button[@class = 'button-1 register-next-step-button']")).click();

        //verify the text 'Your registration completed
        String expectedMessage = "Your registration completed";
        WebElement actualTextElement = driver.findElement(By.xpath("//div[text() ='Your registration completed']"));
        String actualMessage = actualTextElement.getText();
        Assert.assertEquals("Verify registration completed displayed", expectedMessage, actualMessage);

    }

    public void closeBrowser() {
        driver.quit();
    }
}
