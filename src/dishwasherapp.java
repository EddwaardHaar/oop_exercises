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

    public void tunOnOff(boolean onOff){

        if (onOff == true){
            this.isOn = true;
        }else if(onOff == false){
            this.isOn = false;
        }

    }

    public void setProgramme(int answer) {
        this.programme = answer;
        System.out.println("Programme n." + answer + " is ready");

    }

    public void printData(){

        System.out.println("You can chooose from 3 different programmes: (1,2,3)");
    }

}
