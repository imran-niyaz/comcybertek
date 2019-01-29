package Selenium_Home_Works.iFrame_M;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SwitchOptions {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/tinymce");
    }


    @AfterMethod
    public void leanUp(){
        driver.quit();
    }

    @Test
    public void switchByElement(){
        // locate the iframe
        WebElement iframe = driver.findElement(By.id("mce_0_ifr"));
        driver.switchTo().frame(iframe);
        driver.findElement(By.tagName("body")).
                sendKeys("cdeee dewd deed");
    }


    @Test
    public void switchById(){
        driver.switchTo().frame("mce_0_ifr");
        driver.findElement(By.tagName("body")).
                sendKeys("cdeee dewd deed");
    }


    @Test
    public void switchByIndex(){
        driver.switchTo().frame(0);
        driver.findElement(By.tagName("body")).
                sendKeys("cdeee dewd deed");
    }

/*
    @Test
    public void FramesInsideFrames(){
        driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/tinymce");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        int size = driver.findElements(By.tagName("iframe")).size();
        System.out.println("Total Frames --" + size);

        // prints the total number of frames
        driver.switchTo().frame(0); // Switching the Outer Frame
        System.out.println (driver.findElement(By.xpath("//*[@id=\"mceu_28-body\"]")).getText());

        //Printing the text in outer frame
        size = driver.findElements(By.tagName("iframe")).size();
        // prints the total number of frames inside outer frame

        System.out.println("Total Frames --" + size);
        driver.switchTo().frame(0); // Switching to innerframe
        System.out.println(driver.findElement(By.xpath("//*[@id=\"page-footer\"]/div/div/a")).getText());

        //Printing the text in inner frame
        driver.switchTo().defaultContent();
    }
    */
}
