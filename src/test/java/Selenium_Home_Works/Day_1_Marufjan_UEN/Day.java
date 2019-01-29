package Selenium_Home_Works.Day_1_Marufjan_UEN;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Day {

    WebDriver driver;

    @Test
    public void test() throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");

        int fridayCount = 0;

        while(fridayCount < 3){
            Random randomObject = new Random();
            int random = randomObject.nextInt(8);

            switch(random){
                case 1:
                 WebElement monday = driver.findElement(By.id("gwt-debug-cwCheckBox-Monday-input"));
                 monday.click();
                 Thread.sleep(200);
                    System.out.println("Monday");
                    monday.click();
                    Thread.sleep(200);
                    break;

                case 2:
                   WebElement tuesday = driver.findElement(By.id("gwt-debug-cwCheckBox-Tuesday-input"));
                   tuesday.click();
                    Thread.sleep(200);
                    System.out.println("Tuesday");
                    tuesday.click();
                    Thread.sleep(200);
                    break;

                case 3:
                  WebElement wendesday =  driver.findElement(By.id("gwt-debug-cwCheckBox-Wednesday-input"));
                    wendesday.click();
                    Thread.sleep(200);
                    System.out.println("Wednesday");
                    wendesday.click();
                    Thread.sleep(200);
                    break;

                case 4:
                  WebElement thursday =  driver.findElement(By.id("gwt-debug-cwCheckBox-Thursday-input"));
                    thursday.click();
                    Thread.sleep(200);
                    System.out.println("Thursday");
                    thursday.click();
                    Thread.sleep(200);
                    break;

                case 5:
                  WebElement friday =  driver.findElement(By.id("gwt-debug-cwCheckBox-Friday-input"));
                    friday.click();
                    Thread.sleep(200);
                    System.out.println("Friday");
                    friday.click();
                    Thread.sleep(200);
                    fridayCount++;
                    break;

                case 6:
                  WebElement saturday =  driver.findElement(By.id("gwt-debug-cwCheckBox-Saturday-input"));
                    saturday.click();
                    Thread.sleep(200);
                    System.out.println("Saturday");
                    saturday.click();
                    Thread.sleep(200);
                    break;

                case 7:
                    WebElement sunday = driver.findElement(By.id("gwt-debug-cwCheckBox-Sunday-input"));
                    sunday.click();
                    Thread.sleep(200);
                    System.out.println("Sunday");
                    sunday.click();
                    Thread.sleep(200);
                    break;

            }
        }

        driver.quit();
        

    }


}
