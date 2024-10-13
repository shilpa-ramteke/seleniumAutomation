package Project01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practice01 {

    @Test
    public void Test01()
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://sdet.live");
        driver.quit();

    }
}
