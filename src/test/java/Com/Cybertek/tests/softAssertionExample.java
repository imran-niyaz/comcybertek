package Com.Cybertek.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssertionExample {

    @Test
    public void test1(){

        System.out.println("starting");
        Assert.assertTrue(true);
        System.out.println("Done");
    }

    @Test
    public void tets2(){
        SoftAssert softAssert = new SoftAssert();
        System.out.println("starting");
        softAssert.assertTrue(false);
        System.out.println("Done");
        softAssert.assertAll();

        softAssert.assertEquals(1,1);
        System.out.println("eqaul");
        softAssert.assertAll();
    }


    @Test
    public void test3(){
        SoftAssert softAssert = new SoftAssert();
        System.out.println("starting");
        softAssert.assertTrue(false);
        Assert.assertTrue(false);
        System.out.println("Done");
        softAssert.assertAll();
    }
}
