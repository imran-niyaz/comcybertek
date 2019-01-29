package Com.Cybertek.tests;

import Com.Cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWaitExample {

    @Test
    public void test(){
        Driver.getDriver().get("https://the-internet.herokuapp.com/dynamic_controls");

        Driver.getDriver().findElement(By.xpath("//form[@id='input-example']//button")).click();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='text']")));

        Driver.getDriver().findElement(By.xpath("//input[@type='text']")).sendKeys("Hello world");


    }
}
