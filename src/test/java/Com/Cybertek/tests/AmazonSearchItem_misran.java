package Com.Cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AmazonSearchItem_misran extends AmazonHelperclass_misran {


    @Test(priority = 1)
    public void amazonSearchItem() throws InterruptedException {

        driver.get("https://www.amazon.com/");

        //we loacte the searchbox and store it in searchBoxElement
        WebElement searchBoxElement = driver.findElement(By.id("twotabsearchtextbox"));
        searchBoxElement.sendKeys("Best Java Book");
        searchBoxElement.submit();
        Thread.sleep(2000);
    }

    @Test(priority = 2)
    public void facebook() throws InterruptedException {

        driver.get("https://www.facebook.com/");

        Thread.sleep(2000);
    }
}
