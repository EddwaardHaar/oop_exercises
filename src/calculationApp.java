
import java.util.Scanner;
import java.text.DecimalFormat;

public class calculationApp {
    public static void main(String[] args) {


        if (ans.equals("r")){
            System.out.println("enter length");
            int len = myObj.nextInt();
            System.out.println("enter width");
            int wid = myObj.nextInt();
            Calculation.calcArea(len,wid);
        } else if (ans.equals("c")) {Scanner myObj = new Scanner(System.in);
            System.out.println("Calculate the are of a rectangle or circle (r/c)");
            String ans = myObj.nextLine();
            System.out.println("enter radius");
            int rad = myObj.nextInt();
            Calculation.calcArea(rad);
        }

    }
}

class Calculation{


    public static void calcArea(int width, int length){
        System.out.println(width * length);
    }

    public static void calcArea(int radius){
        System.out.println(3.14*(radius*radius));
    }


}