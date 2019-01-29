package Com.Cybertek.tests;

import Com.Cybertek.pages.HomePage;
import Com.Cybertek.utilities.ConfigurationReader;
import Com.Cybertek.utilities.TestBase;
import org.testng.annotations.Test;

public class LoginTestWithProperties extends TestBase {


    @Test
    public void readPropertyTest(){

       driver.get(ConfigurationReader.getProperty("url"));

        HomePage homePage = new HomePage();

        String username = ConfigurationReader.getProperty("username");
        String password = ConfigurationReader.getProperty("password");
        homePage.login(username,password);


    }


}
