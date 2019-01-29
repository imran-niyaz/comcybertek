package Com.Cybertek.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MoreDependenciesTest {

    @Test
    public void openBrowser(){
        System.out.println("opening the beowser");
    }


    @Test(dependsOnMethods = "openBrowser")
    public void login(){
        System.out.println("log in");
        Assert.assertTrue(false);
    }


    @Test(dependsOnMethods = "login")
    public void logOut(){
        System.out.println("log out");
    }

}
