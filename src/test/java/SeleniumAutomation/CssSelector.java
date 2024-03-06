package SeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CssSelector {
    public WebDriver driver;
    @Test
    public void singleCssSelector() throws InterruptedException
    {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[type='text']")).sendKeys("khushbu123testid@gmail.com");
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("rajwiney21");
        driver.findElement(By.cssSelector("button[type='submit']")).submit();
    }
    @Test
    public void multipleCssSelector() throws InterruptedException
    {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input[type='text'][placeholder='First name']")).sendKeys("Khushbu");

    }
}
