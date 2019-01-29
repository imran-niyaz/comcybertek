package Com.Cybertek.tests;

import Com.Cybertek.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DragAndDrop extends TestBase {


    @Test
    public void test() throws InterruptedException {

        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droptarget"));

       // actions.dragAndDrop(source,target).perform();
        // Thread.sleep(3000);
      // actions.clickAndHold(source).moveToElement(target).release().build().perform();

        actions.clickAndHold(source).perform();
        Thread.sleep(3000);
        actions.moveToElement(target).release().perform();
        Thread.sleep(3000);

    }

}
