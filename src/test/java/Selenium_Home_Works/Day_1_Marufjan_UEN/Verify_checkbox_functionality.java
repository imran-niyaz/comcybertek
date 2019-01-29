package Selenium_Home_Works.Day_1_Marufjan_UEN;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_checkbox_functionality {


    public static void main(String[] args) {



        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.Google.com");

        driver.findElement(By.name("q")).sendKeys("http://the-internet.herokuapp.com/checkboxes"+ Keys.ENTER);

        WebElement press = driver.findElement(By.className("LC20lb"));
        press.click();

        WebElement FirstCheckBox = driver.findElement(By.xpath("//*[@type='checkbox']"));

        if(!FirstCheckBox.isSelected()){
            System.out.println("Passed -- 1");
        }else{
            System.out.println("Failed");
        }

        FirstCheckBox.click();

        if(FirstCheckBox.isSelected()){
            System.out.println("Passed -- 2");
        }else{
            System.out.println("Failed");
        }

        WebElement SecondCheckBox = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]"));
        SecondCheckBox.click();

        if(!SecondCheckBox.isSelected()){
            System.out.println("Passed -- 3");
        }else{
            System.out.println("Failed");
        }










    }



}
