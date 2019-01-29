package MenteoringSection_Misran_Prestashop;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends TestBase{

    @FindBy(xpath = "//input[@id='email']")
    WebElement email;

    @FindBy(xpath = "//input[@id='passwd']")
    WebElement password;

    @FindBy(xpath = "//button[@id='SubmitLogin']//span")
    WebElement singinBtn;


    public void login() {

        driver.get("http://automationpractice.com/index.php");
        email.sendKeys(Credentials.getUserName());
        password.sendKeys(Credentials.getPassword());
        singinBtn.click();



    }


}
