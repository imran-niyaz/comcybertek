package Com.Cybertek.tests;

import Com.Cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SleepAndImplicitWaitExample {

    WebDriver driver;


    @BeforeMethod
    public void setUp(){
      driver = Driver.getDriver();
    }

    @AfterMethod
    public void tearDwon(){
 //       Driver.closeDriver();
    }


    @Test
    public void testSleep() throws InterruptedException {

        driver.get("http://the-internet.herokuapp.com/dynamic_loading/2");

        driver.findElement(By.tagName("button")).click();
        Thread.sleep(10000);

        System.out.println(driver.findElement(By.id("finish")).getText());

        //new Actions(driver).pause(12);

    }

    @Test
    public void implicitWait(){

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://the-internet.herokuapp.com/dynamic_loading/2");

        driver.findElement(By.tagName("button")).click();


        System.out.println(driver.findElement(By.id("finish")).getText());

    }



    @Test
    public void implicitWait2() throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        driver.findElement(By.cssSelector("form#checkbox-example>button")).click();
        Thread.sleep(10000);

        System.out.println(driver.findElement(By.id("message")).getText());

        driver.findElement(By.cssSelector("form#checkbox-example>button")).click();
        Thread.sleep(10000);

        System.out.println(driver.findElement(By.id("checkbox")).isDisplayed());
    }


}
