package Project01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class task_19thOct {

    @Test
    public void createAccount()
    {
        WebDriver driver=new EdgeDriver();
        driver.get("https://awesomeqa.com/ui/index.php?route=account/register");

        WebElement firstName=driver.findElement(By.id("input-firstname"));
        firstName.sendKeys("Priyansh");

        WebElement lastName=driver.findElement(By.id("input-lastname"));
        lastName.sendKeys("Testing");

        WebElement email=driver.findElement(By.id("input-email"));
                email.sendKeys("akcdsnqr@xyz.com");

        WebElement telephone=driver.findElement(By.id("input-telephone"));
        telephone.sendKeys("9876543210");

        WebElement password=driver.findElement(By.id("input-password"));
        password.sendKeys("123456");

        WebElement confmpass=driver.findElement(By.id("input-confirm"));
        confmpass.sendKeys("123456");

        WebElement newsletter=driver.findElement(By.name("newsletter"));
        newsletter.click();

        WebElement policyterm=driver.findElement(By.name("agree"));
        policyterm.click();

        List<WebElement> continuebutton=driver.findElements(By.tagName("input"));
        System.out.println(continuebutton.size());
       continuebutton.get(13).click();

        WebElement accountCreatedText=driver.findElement(By.xpath("//*[@id='content']/h1"));
        //Assert.assertTrue(accountCreatedText.getText().equalsIgnoreCase("Your Account Has Been Created!"));
        String textOfAccountCreated=accountCreatedText.getText();
        if
        (textOfAccountCreated.equalsIgnoreCase("Your Account Has Been Created!"))
        {  Assert.assertTrue(true);
        }else {
            Assert.assertTrue(false);
        }

        WebElement submit=driver.findElement(By.xpath("//div/a"));
        submit.click();

        String homePageTitle=driver.getTitle();
        Assert.assertEquals("Your Store",homePageTitle);


    }}

