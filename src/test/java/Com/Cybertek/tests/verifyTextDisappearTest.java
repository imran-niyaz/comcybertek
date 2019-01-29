package Com.Cybertek.tests;

import Com.Cybertek.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class verifyTextDisappearTest extends TestBase {



    @Test
    public void verify1(){

        driver.get("https://www.w3schools.com/howto/howto_js_toggle_hide_show.asp");

        WebElement  text = driver.findElement(By.id("myDIV"));

        System.out.println(text.getText());

        Assert.assertTrue(text.isDisplayed());

        WebElement button = driver.findElement(By.xpath("//button[.='Toggle Hide and Show']"));

        button.click();

        Assert.assertFalse(text.isDisplayed());
    }

    @Test
    public void verify2(){


        driver.get("https://www.w3schools.com/jquery/tryit.asp?filename=tryjquery_html_remove");

        driver.switchTo().frame("iframeResult");

        WebElement text = driver.findElement(By.xpath("//body/p"));
        System.out.println(text.getText());

        WebElement button = driver.findElement(By.xpath("//body/button"));
        button.click();

        Assert.assertFalse(text.isDisplayed());

    }

    public boolean elementDisplayed(By by){

       try{

           driver.findElement(by).isDisplayed();
           return true;

       }catch(NoSuchElementException e){
           return false;
       }
    }
}
