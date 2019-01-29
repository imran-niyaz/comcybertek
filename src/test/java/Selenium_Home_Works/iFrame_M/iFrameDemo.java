package Selenium_Home_Works.iFrame_M;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class iFrameDemo {

    @Test
    public void test(){
        WebDriverManager.chromedriver().setup();
        WebDriver  driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/tinymce");
        driver.manage().timeouts().pageLoadTimeout(6, TimeUnit.SECONDS);

        WebElement iframe = driver.findElement(By.id("mce_0_ifr"));
        driver.switchTo().frame(iframe);

        driver.findElement(By.tagName("body")).
                sendKeys("ddeee ddddeddd dd");

        driver.switchTo().parentFrame();
      //  driver.switchTo().defaultContent();

        driver.findElement(By.linkText("Elemental Selenium")).click();

    }
}
