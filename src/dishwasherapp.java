import  java.util.Scanner;

public class dishwasherapp {
    public static void main(String[] args) {

        Dishwasher dishwasher = new Dishwasher();
        dishwasher.setProgramme(1);


    }
}

class Dishwasher{

    private boolean isOn;
    private int programme;

    public void setProgramme(int programme) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("You can chooose from 3 different programmes: (1,2,3)");
        String answer = myObj.nextLine();
        int choice = Integer.valueOf(answer);
        System.out.println("Programme n." + choice + " is ready");

    }

    public void tunOnOff(){

    }

    public void printData(){

    }

}
