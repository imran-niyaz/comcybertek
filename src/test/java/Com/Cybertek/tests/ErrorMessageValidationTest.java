package Com.Cybertek.tests;

import Com.Cybertek.pages.HomePage;
import Com.Cybertek.pages.ListingPage;
import Com.Cybertek.pages.PrestaShopHomePage;
import Com.Cybertek.utilities.ConfigurationReader;
import Com.Cybertek.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ErrorMessageValidationTest extends TestBase {


    HomePage homePage = new HomePage();
    /*
    1. go to website http://automationpractice.com/index.php
    2. try to login with wrong email
    3. verify error message Invalid email address.
     */

    @Test
    public void wrongEmailTest(){

        driver.get(ConfigurationReader.getProperty("url"));

        homePage.username.sendKeys("admin");
        homePage.password.sendKeys("test");
        homePage.loginButton.click();

        String expectedError = "Invalid Login or Password.";
        String actualError = homePage.errorMessage.getText();

        Assert.assertEquals(actualError,expectedError);
    }

    @Test
    public void wrongPasswordTest(){

        driver.get(ConfigurationReader.getProperty("url"));
        homePage.username.sendKeys("Tester");
        homePage.password.sendKeys("wrong password");
        homePage.loginButton.click();


        String expectedError = "Invalid Login or Password.";
        String actualError = homePage.errorMessage.getText();

        Assert.assertEquals(actualError,expectedError);

    }

    @Test
    public void blankUserName(){

        homePage.open();
        homePage.login("","test");

        String expectedError = "Invalid Login or Password.";
        String actualError = homePage.errorMessage.getText();

        Assert.assertEquals(actualError,expectedError);
    }


    // this is just a method which does not do anything
    @Test
    public void test(){
        ListingPage nilesLane = new ListingPage();

        ListingPage palmetLane = new ListingPage();

        PrestaShopHomePage PrestaShopHomePage = new PrestaShopHomePage();

        WebElement tshirt = PrestaShopHomePage.product("t-shirt");

        WebElement dress = PrestaShopHomePage.product("dress");
    }



}
