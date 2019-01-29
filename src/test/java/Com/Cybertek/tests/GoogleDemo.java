package Com.Cybertek.tests;


import Com.Cybertek.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleDemo extends TestBase {



    @Test
    public void googleTest(){
        driver.get("https://google.com");

        driver.findElement(By.name("q")).sendKeys("selenium cookbook"+ Keys.ENTER);

        Assert.assertTrue(driver.getTitle().contains("selenium cookbook"));
    }

}
