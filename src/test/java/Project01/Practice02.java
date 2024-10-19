package Project01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Practice02 {

    WebDriver driver = new EdgeDriver();
       WebDriver driver2 = new ChromeDriver();
        WebDriver driver3 = new FirefoxDriver();
        WebDriver driver4 = new InternetExplorerDriver();
        WebDriver driver5 = new SafariDriver();


   // SearchContext(I) (2) -> WebDriver(I)( 10) -> RemoteWebDriver(C) (15) -> ChromiumDriver(C) 25 -> EdgeDriver(C) (45)
    // SearchContext(I) -> WebDriver(I) -> RemoteWebDriver(C) -> ChromiumDriver(C) -> ChromeDriver(C)

    //SearchContext - Interface - findElement, and findElements - GGF
    // WebDriver - Interface - some incomplete functions - GF
    // RemoteWebDriver - Class- It also has some functions - F
    // ChromeDriver, FirefoxDriver, EdgeDriver, SafariDriver, InternetExplorerDriver  Class - S

    // Scenarios
    // 1. Do want to run on  Chrome or Edge?
    //ChromeDriver driver = new ChromeDriver(); ~1%

    // 2  Do you want to run on Chrome then change to Edge ?
    // WebDriver driver = new ChromeDriver();
    // driver = new EdgeDriver(); 97% -


    // 3. do you want to run on multiple browsers, aws machine, ? 2%
    // RemoteWebDriver driver (with GRID) - Advance (Last 2 Sessions)







}
