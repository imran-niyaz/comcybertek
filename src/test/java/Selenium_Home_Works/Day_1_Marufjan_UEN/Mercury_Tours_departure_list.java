package Selenium_Home_Works.Day_1_Marufjan_UEN;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class Mercury_Tours_departure_list {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.Google.com");

        driver.findElement(By.name("q")).sendKeys("http://www.newtours.demoaut.com/"+ Keys.ENTER);

        WebElement press = driver.findElement(By.className("LC20lb"));
        press.click();

        WebElement userName = driver.findElement(By.name("userName"));
        userName.sendKeys("tutorial");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("tutorial");

        WebElement enter = driver.findElement(By.name("login"));
        enter.click();

        WebElement depart = driver.findElement(By.xpath("//*[@value='Acapulco']"));

        if(depart.getText().equals("Acapulco")){
            System.out.println("Passed -- 1");
        }else{
            System.out.println("Failed -- 1");
        }

        WebElement ListOfLocations = depart.findElement(By.xpath("//*[@name='fromPort']"));

        List<WebElement> allOptions = driver.findElements(By.tagName("option"));




        for(int i=0; i < allOptions.size(); i++){

            Assert.assertEquals(allOptions.get(i),ListOfLocations.getAttribute(""));
        }



    }
}
