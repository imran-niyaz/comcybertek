package Selenium_Home_Works.Day_1_Marufjan_UEN;

import org.testng.annotations.Test;

public class TestRandom {


//    public static void main(String[] args) {
//        Random randomObject = new Random();
// class used to created random stuff
//        int random =  randomObject.nextInt(2);
// nextInt  actually creates a random number
//        System.out.println(random);
//    }


    String message;
    @Test(priority = 0)
    public void t800(){
        message = "I'm back";
        System.out.println(message);
    }


    @Test (priority = 1)
    public void t1000(){
        System.out.println(message);
    }


}
