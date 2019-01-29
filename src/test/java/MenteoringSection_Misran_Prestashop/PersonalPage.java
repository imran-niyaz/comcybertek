package MenteoringSection_Misran_Prestashop;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class PersonalPage extends TestBase{

    @FindBy(xpath = "//span[contains(text(),'My personal information')]")
    WebElement myPersonalInfoBtn;

    public void verifyPersoalPage() {

        myPersonalInfoBtn.click();

        String actualTitle = driver.getTitle();

        Assert.assertTrue(actualTitle.contains("Identity"));

    }
}
