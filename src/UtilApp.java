import java.util.Scanner;

public class UtilApp {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Width?");
        int width = myObj.nextInt();
        System.out.println("Length?");
        int length = myObj.nextInt();

        System.out.println("Area is " + Utils.areaCalc(width,length));
    }
}

class Utils{

    public static void printTitle(){
        System.out.println("*******" +
                "\n* OOP *" +
                "\n*******");
    }

    public static int areaCalc(int width, int length) {
        return width * length;
    }


}