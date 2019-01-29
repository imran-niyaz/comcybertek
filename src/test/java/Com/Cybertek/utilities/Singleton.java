package Com.Cybertek.utilities;

public class Singleton {

    private static String str;

    private Singleton(){}

    public static String get(){

        if(str == null){
            System.out.println("Adding value");
            str = "fgaagaesrgawva";
        }
        return str;

    }
}
