
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PortfolioTests {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // Make sure chromedriver is installed and added to PATH
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://vcard-react.vercel.app/");
    }

    @Test
    public void verifyHomePageTitle() {
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Portfolio") || title.contains("vCard"));
    }

    @Test
    public void navigateToAboutPage() throws InterruptedException {
        WebElement aboutLink = driver.findElement(By.linkText("About"));
        aboutLink.click();
        Thread.sleep(1000); // simple wait for demo
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.toLowerCase().contains("about"));
    }

    @Test
    public void verifyContactFormFields() throws InterruptedException {
        WebElement contactLink = driver.findElement(By.linkText("Contact"));
        contactLink.click();
        Thread.sleep(1000);

        WebElement nameInput = driver.findElement(By.name("name"));
        WebElement emailInput = driver.findElement(By.name("email"));
        WebElement messageInput = driver.findElement(By.name("message"));

        Assert.assertTrue(nameInput.isDisplayed());
        Assert.assertTrue(emailInput.isDisplayed());
        Assert.assertTrue(messageInput.isDisplayed());
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
