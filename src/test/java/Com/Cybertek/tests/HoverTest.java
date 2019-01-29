package Com.Cybertek.tests;

import Com.Cybertek.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HoverTest extends TestBase {

    @Test
    public void test(){

        driver.get("https://www.amazon.com/");

        WebElement signIn = driver.findElement(By.xpath("//span[.='Hello. Sign in']"));

        actions.moveToElement(signIn).perform();

        driver.findElement(By.xpath("//span[.='Your Hearts']"));

        System.out.println(driver.getTitle());

       Assert.assertTrue(driver.getTitle().contains("Shopping"));


    }


    @Test
    public void test2(){

        driver.get("https://www.amazon.com/");

        WebElement help = driver.findElement(By.xpath("//a[@class='nav_a'][contains(text(),'Help')]"));

        actions.moveToElement(help).perform();

    }

}
