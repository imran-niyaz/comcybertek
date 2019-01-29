package MyPractices;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.security.Key;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Sports_Firuze {

    WebDriver driver;

    @BeforeMethod
    public void beforeEachTest(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
    }



    @Test
    public void sportsTest(){
        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwRadioButton"+ Keys.ENTER);

        WebElement click1stLink = driver.findElement(By.className("LC20lb"));
        click1stLink.click();


        WebElement clickRadioButton = driver.findElement(By.xpath("//*[@id=\"gwt-debug-mainMenu\"]/div/div/div[1]/div[1]/div[2]/div/div[1]/div[2]/div/div/div[2]"));
        clickRadioButton.click();

        WebElement checkBox = driver.findElement(By.id("gwt-debug-cwRadioButton-sport-Football-input"));

        if (checkBox.isSelected()){
            System.out.println();
            System.out.println("--> This test case has Passed successfully <--");
        }else{
            System.out.println("--> This test case has faied <--");
        }


        Random random = new Random();
        int randomCheckBox = random.nextInt(7);

        switch (randomCheckBox){
            case 1:
            WebElement Baseball = driver.findElement(By.id("gwt-debug-cwRadioButton-sport-Baseball-input"));
                Baseball.click();
                System.out.println("--> Baseball <--");
                break;
            case 2:
                WebElement Basketball = driver.findElement(By.id("gwt-debug-cwRadioButton-sport-Basketball-input"));
                Basketball.click();
                System.out.println("--> Basketball <--");
                break;
            case 3:
                WebElement Football = driver.findElement(By.id("gwt-debug-cwRadioButton-sport-Football-input"));
                Football.click();
                System.out.println("--> Football <--");
                break;
            case 4:
                WebElement Hockey = driver.findElement(By.id("gwt-debug-cwRadioButton-sport-Hockey-input"));
                Hockey.click();
                System.out.println("--> Hockey <--");
                break;
            case 5:
                WebElement Soccer = driver.findElement(By.id("gwt-debug-cwRadioButton-sport-Soccer-input"));
                Soccer.click();
                System.out.println("--> Soccer <--");
                break;
            case 6:
                WebElement Water_Polo = driver.findElement(By.id("gwt-debug-cwRadioButton-sport-WaterPolo-input"));
                Water_Polo.click();
                System.out.println("--> Water_Polo <--");
                break;

                default:
                    System.out.println("--> Error <--");
        }

        if (!checkBox.isSelected()){
            System.out.println();
            System.out.println("--> This test case has Passed successfully <--");
        }else{
            System.out.println("--> This test case has faied <--");
        }



    }
}
