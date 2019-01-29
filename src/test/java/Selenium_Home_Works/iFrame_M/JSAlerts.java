package Selenium_Home_Works.iFrame_M;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JSAlerts {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        //driver.get("http://the-internet.herokuapp.com/windows");
    }


    @AfterMethod
    public void cleanUp() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

    @Test
    public void oopsTest(){
        driver.get("https://sweetalert.js.org/");
        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/button")).click();// "(//button[@class='preview'])[1]"

        // switch to alert
        Alert alert = driver.switchTo().alert();

        alert.accept();
    }


    @Test
    public void dismiss(){
        driver.get("http://the-internet.herokuapp.com/javascript_alerts");

        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();

        Alert alert = driver.switchTo().alert();

        alert.dismiss();//clicking cancel button
    }

    @Test
    public void alertText(){
        driver.get("http://the-internet.herokuapp.com/javascript_alerts");

        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();

        Alert alert = driver.switchTo().alert();

        alert.sendKeys("Hello Boy What's Up!");

        alert.accept();

    }

}
