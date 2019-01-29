package Com.Cybertek.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependenciesTest {

   /* @Test
    public void logIn(){
        System.out.println("Log in");
        Assert.assertTrue(true);
    }

    @Test(dependsOnMethods = "logIn")
    public void buySth(){
        System.out.println("buy buy BABY");
    }

    @Test(priority = 5)
    public void homePage(){
        System.out.println("Home Page");
    }
*/

    @Test
    public void login(){
        System.out.println("login");
        Assert.assertTrue(false);
    }

    @Test(dependsOnMethods = "login")
    public void zbuySth(){
        System.out.println("buy buy baby");
    }

    @Test(priority = 5)
    public void homePage(){
        System.out.println("home page");
    }


}
