package Selenium_Home_Works.iFrame_M;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class TabExample {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/windows");
    }

    /*
   @AfterMethod
    public void cleanUp() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
    */

/*
    @Test
    public void changeTab(){

        WebElement clickHere = driver.findElement(By.xpath("//*[@id=\"content\"]/div/a"));
        clickHere.click();


    }
    */

    @Test
    public void changeTab02() {

        System.out.println(driver.getWindowHandles().size());

        driver.findElement(By.linkText("Click Here")).click();

        System.out.println(driver.getWindowHandles());

        System.out.println(driver.getWindowHandles().size());
        // change to the new tab
        // Assert.assertEquals(driver.getTitle(),"New Window");

        Set<String> WindowHandles = driver.getWindowHandles();

        System.out.println("********************");

        for (String handle : WindowHandles) {

            System.out.println(handle);
            //switching tabs
            driver.switchTo().window(handle);
            //
            System.out.println(driver.getTitle());


            if (driver.getTitle().equals("New Window")) {
                break;
            }
        }

        Assert.assertEquals(driver.getTitle(), "New Window");


    }


    @Test
    public void changeTab2() {


        driver.get("https://www.w3schools.com/html/");

        driver.findElement(By.partialLinkText("Try it Yourself")).click();


        for(String Handle : driver.getWindowHandles()){
          //  System.out.println(Handle);
            driver.switchTo().window(Handle);

            if(driver.getTitle().equals("Tryit Editer v3.6")){
                break;
            }
        }
        Assert.assertTrue(driver.getCurrentUrl().contains("default"));

        System.out.println(driver.getWindowHandles().size());//2
        driver.close();

        System.out.println(driver.getWindowHandles().size());//1

    }
}