package Com.Cybertek.tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo {

    @Test
    public void test1(){
        String a = "A";
        String b = "A";

        Assert.assertEquals(a,b);

        System.out.println("Test1 is Done");
        //comparing a to b ,
    }

    @Test
    public void test2(){
        String a = "A";
        String b = "AAA";

        Assert.assertEquals(a,b);

        System.out.println("Test2 is Done");
        //first param is actual and Second param is expected
    }

    @Test
    public void test3(){
        String a = "ADAFD";
        String b = "AAA";

        Assert.assertTrue(b.contains(a));

        Assert.assertTrue(true);

        System.out.println("Test3 is Done");
    }

    @Test
    public void test4(){
        String a = "AAA";
        String b = "AAA aa";

        Assert.assertTrue(b.contains(a),
               b + " should have contained "+ a);
    }


    @Test
    public void test5(){
       boolean isBig = false;
        Assert.assertTrue(isBig == false);
    }
}
