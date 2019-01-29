package Com.Cybertek.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Demo {

    @Test
    public void testOne(){
        System.out.println("Hello World");

        String expected = "a";
        String actual = "B";

        if(expected.equals(actual)){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }
        // this is how we test in TestNG.
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("this is before method");
    }


    @Test
    public void testTwo(){
        System.out.println("this is test two");
    }


}
