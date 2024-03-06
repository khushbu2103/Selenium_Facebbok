import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class TakeScreenShot {
    public WebDriver driver;
    @Test
    public void take_Screenshot() throws InterruptedException, IOException
    {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        TakesScreenshot ts = (TakesScreenshot)driver;
        File SFile = ts.getScreenshotAs(OutputType.FILE);
        File DFile = new File("C:\\Users\\LENOVO\\IdeaProjects\\Selenium\\ScreenShot\\"+"Facebook.png");
        FileHandler.copy(SFile, DFile);

    }
}
