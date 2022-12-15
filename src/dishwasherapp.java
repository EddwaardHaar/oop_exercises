import  java.util.Scanner;

public class dishwasherapp {
    public static void main(String[] args) {

        Dishwasher dishwasher = new Dishwasher();
        dishwasher.setProgramme(1);


    }
}

class Dishwasher{

    private boolean isOn = false;

    public void setProgramme(int answer) {

        System.out.println("Programme n." + answer + " is ready");

    }

    public void tunOnOff(){

    }

    public void printData(){

        System.out.println("You can chooose from 3 different programmes: (1,2,3)");
    }

}
