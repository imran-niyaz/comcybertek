package Com.Cybertek.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DifferentAnnotations {


    @Test
    public void testOne(){
        System.out.println("This is test one");
    }


    @BeforeMethod
    public void beforeMethod(){
        System.out.println("This is before Method");
    }

    @Test
    public void testTwo(){
        System.out.println("This is test two");
    }
}
