package MyWebDriverClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class TC1 {

    public static void main(String[] args) throws InterruptedException {
        BaaB();


    }


    public static void BaaB() throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

       // driver.manage().window().fullscreen();

        driver.get("http://a.testaddressbook.com/sign_in");


        WebElement emaill = driver.findElement(By.id("session_email"));
        emaill.sendKeys("kexesobepu@zsero.com");

        Thread.sleep(3000);

        WebElement passWord = driver.findElement(By.id("session_password"));
        passWord.sendKeys("password");

        Thread.sleep(1500);

        WebElement botton = driver.findElement(By.name("commit"));
        botton.click();
        Thread.sleep(15000);

        WebElement currentUserName = driver.findElement(By.className("navbar-text"));

        if(currentUserName.getText().equals("kexesobepu@zsero.com")){
            System.out.println("Passed | This user name has been displayed");
        }else {
            System.out.println("Failed | This user name has not been displayed");
        }

        if (driver.getTitle().contains("sign in")) {

            System.out.println("Failed ~~ title contains 'Sign in'");
        } else {
            System.out.println("Pass ~~ title does not contain 'Sign in'");
        }

        driver.close();






     /*   System.out.println("---Title--");
        System.out.println(driver.getTitle());
       // System.out.println(">>> Page Source <<<");
       // System.out.println(driver.getPageSource());
        System.out.println("=======Current URL=======");
        System.out.println(driver.getCurrentUrl());
        System.out.println("------Session ID------");
        System.out.println(((ChromeDriver) driver).getSessionId());
      //  System.out.println(((ChromeDriver) driver).getLocalStorage());
        System.out.println(((ChromeDriver) driver).getNetworkConnection());
        System.out.println(((ChromeDriver) driver).getFileDetector());
*/








    }



    

}
