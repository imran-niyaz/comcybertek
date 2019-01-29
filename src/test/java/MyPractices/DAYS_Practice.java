package MyPractices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DAYS_Practice {

    WebDriver driver;

    @BeforeMethod
    public void beforeEachTest(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);


    }

    @Test
    public void Days(){

     driver.get("https://www.google.com");

     WebElement input = driver.findElement(By.name("q"));
     input.sendKeys("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!" + Keys.ENTER);

     WebElement pressWebSite = driver.findElement(By.className("LC20lb"));
     pressWebSite.click();

     if(driver.getTitle().contains("samples")){
         System.out.println("");
        }







    }
}
