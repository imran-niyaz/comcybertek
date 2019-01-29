package Selenium_Home_Works.Day_1_Marufjan_UEN;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mercury_Tours_radio_button_functionality {

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

        WebElement tripType = driver.findElement(By.name("tripType"));

        if(tripType.isSelected()){
            System.out.println("Passed -- 1");
        }else{
            System.out.println("Failed -- 1");
        }

        WebElement oneWay = driver.findElement(By.xpath("//*[@type='radio'  and @value='oneway']"));

        if(!oneWay.isSelected()){
            System.out.println("Passed -- 2");
        }else{
            System.out.println("Failed -- 2");
        }

        oneWay.click();

        if(!tripType.isSelected()){
            System.out.println("Passed -- 3");
        }else{
            System.out.println("Failed -- 3");
        }


        if(oneWay.isSelected()){
            System.out.println("Passed -- 4");
        }else{
            System.out.println("Failed -- 4");
        }





    }
}
