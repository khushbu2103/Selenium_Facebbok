package SeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class XPath {
    public WebDriver driver;
    @Test
    public void singleAndMultipleAttribute() throws InterruptedException
    {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
        email.sendKeys("khushbu123testid@gmail.com");
        WebElement password = driver.findElement(By.xpath("//input[@name='pass'][@type='password']"));
        password.sendKeys("rajwiney21");
        WebElement login = driver.findElement(By.xpath("//button[@name='login'][@type='submit']"));
        login.submit();
    }
    @Test
    public void textElementXPath()
    {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        WebElement text =  driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
        int x = text.getLocation().getX();
        int y = text.getLocation().getY();
        System.out.println(x);
        System.out.println(y);
    }
}
