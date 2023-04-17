package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setup() {
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToComputerPageSuccessfully(){
        //click on the ‘Computers’ Tab
        driver.findElement(By.xpath("(//a[text()= 'Computers '])[1]")).click();
        String expectedMessage = "Computers";
        //Verify the text ‘Computers’
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[text()= 'Computers']"));
        String actualMessage  = actualTextElement.getText();
        Assert.assertEquals("Verify computers text displayed", expectedMessage, actualMessage);
    }
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
        //click on the ‘Electronics’ Tab
        driver.findElement(By.xpath("//a[text()= 'Electronics ']")).click();
        String expectedMessage = "Electronics";
        //Verify the text ‘Electronics’
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[text()= 'Electronics']"));
        String actualMessage  = actualTextElement.getText();
        Assert.assertEquals("Verify electronics text displayed", expectedMessage, actualMessage);
    }
    @Test
    public void userShouldNavigateToApparelPageSuccessfully(){
        // click on the ‘Apparel’ Tab

        driver.findElement(By.xpath("//a[text() = 'Apparel ']")).click();
        String expectedMessage = "Apparel";
        //Verify the text ‘Apparel’
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[text() = 'Apparel']"));
        String actualMessage  = actualTextElement.getText();
        Assert.assertEquals("Verify apparel text displayed", expectedMessage, actualMessage);
    }
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){
        // click on the 'Digital downloads' tab
        driver.findElement(By.xpath("(//a[text()= 'Digital downloads '])[1]")).click();
        String expectedMessage = "Digital downloads";
        //Verify the text ‘Digital downloads’
        WebElement actualTextElement = driver.findElement(By.xpath("(//h1[text()= 'Digital downloads'])"));
        String actualMessage  = actualTextElement.getText();
        Assert.assertEquals("Verify digital download text displayed", expectedMessage, actualMessage);

    }
    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){
        // click on the 'Books' tab
        driver.findElement(By.xpath("(//a[text()= 'Books '])[1]")).click();
        String expectedMessage = "Books";
        //Verify the text ‘Digital downloads’
        WebElement actualTextElement = driver.findElement(By.xpath("(//h1[text()= 'Books'])"));
        String actualMessage  = actualTextElement.getText();
        Assert.assertEquals("Verify books text displayed", expectedMessage, actualMessage);

    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
        // click on the ‘Jewelry’ Tab
        driver.findElement(By.xpath("(//a[text()= 'Jewelry '])[1]")).click();
        String expectedMessage = "Jewelry";
        //Verify the text ‘Jewelry’
        WebElement actualTextElement = driver.findElement(By.xpath("(//h1[text()= 'Jewelry'])"));
        String actualMessage  = actualTextElement.getText();
        Assert.assertEquals("Verify jewelry text displayed", expectedMessage, actualMessage);
    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){
      // click on the ‘Gift Cards’ Tab
        driver.findElement(By.xpath("(//a[text()= 'Gift Cards '])[1]")).click();
        String expectedMessage = "Gift Cards";

        // Verify the text ‘Gift Cards’
        WebElement actualTextElement = driver.findElement(By.xpath("(//h1[text()= 'Gift Cards'])"));
        String actualMessage = actualTextElement.getText();
        Assert.assertEquals("Verify gift cards text displayed " , expectedMessage, actualMessage);

    }
    public void closeBrowser() {
        driver.quit();

    }
}
