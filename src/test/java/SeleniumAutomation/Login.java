package SeleniumAutomation;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import javax.xml.xpath.XPath;
import java.io.File;
import java.io.IOException;

public class Login {
public WebDriver driver;
@Test
public void fb_Login()
{
    driver = new ChromeDriver();
    driver.get("https://www.facebook.com/");
    driver.manage().window().maximize();
    String title = driver.getTitle();
    System.out.println(title);
    String url = driver.getCurrentUrl();
    System.out.println(url);
    String source = driver.getPageSource();
    System.out.println(source);
    driver.navigate().to("https://www.flipkart.com/");
    driver.navigate().back();
    driver.navigate().forward();
    driver.navigate().refresh();
}
@Test
public void findElement() throws InterruptedException, IOException
{
    driver = new ChromeDriver();
    driver.get("https://www.facebook.com/");
    Thread.sleep(2000);
    WebElement element = driver.findElement(By.name("email"));
    element.sendKeys("kjh@gmail.com");
    Thread.sleep(5000);
    element.clear();
    element.sendKeys("khushi");
    driver.findElement(By.name("login")).submit();
}
//Assignment
    @Test
    public void fb_Registeration() throws InterruptedException
    {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("firstname")).sendKeys("Khushbu");
        driver.findElement(By.name("lastname")).sendKeys("soni");
        driver.findElement(By.name("reg_email__")).sendKeys("khushbu123testid@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("khushbu123testid@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("rajwiney21");
        driver.findElement(By.name("birthday_day")).sendKeys("21");
        driver.findElement(By.name("birthday_month")).sendKeys("jan");
        driver.findElement(By.name("birthday_year")).sendKeys("1996");
        WebElement radioGender = driver.findElement(By.xpath("//label[text()='Female']"));
        radioGender.click();
        Thread.sleep(3000);
        driver.findElement(By.name("websubmit")).click();
    }
    @Test
    public void fb_LoginPage() throws InterruptedException
    {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.findElement(By.name("email")).sendKeys("khushbu123testid@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("rajwiney21");
        driver.findElement(By.name("login")).submit();
    }
}
