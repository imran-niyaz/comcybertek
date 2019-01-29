package Com.Cybertek.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Different_Annotations_2 {

    @Test
    public void testOne(){
        System.out.println("This is test one ");
    }

    @Test
    public void testTwo(){
        System.out.println("This is test two");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("This is After Method");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("This is after class");
    }
}