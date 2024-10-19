package Project01;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task01_13Oct {

    @Test
    public static void testmethod01()
    {
        EdgeDriver driver=new EdgeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com");
        String URL=driver.getCurrentUrl();
        String ActualTitle=driver.getTitle();
        boolean pagesource=driver.getPageSource().contains("CURA Healthcare Service");
        Assert.assertEquals(URL,"https://katalon-demo-cura.herokuapp.com/");
        Assert.assertEquals(ActualTitle,"CURA Healthcare Service");
        Assert.assertTrue(pagesource);

    }
}
