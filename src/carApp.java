import java.util.Scanner;

public class carApp {
    public static void main(String[] args) {

        boolean con = true;

        Car car1 = new Car("Toyota","RAV4",40);
        Scanner myObj = new Scanner(System.in);

        do {

            System.out.println("a=accelerate b=break x=exit");

            String answer = myObj.nextLine();

            if (answer.equals("a")){
                car1.accelerate();
            } else if (answer.equals("b")) {
                car1.brake();
            } else if (answer.equals("x")) {
                break;
            }else{
                System.out.println("Wrong, try again.");
            }


        }while(true);
    }
}

class Car{
    private String brand;

    private String model;
    private int amountOfFuel;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public Car(){
        brand = "";
        model = "";
        amountOfFuel = 0;
        printData();
    }
    public Car(String brandName, String modelName, int fuelValue){
        brand = brandName;
        model = modelName;
        amountOfFuel = fuelValue;
        printData();
    }

    public void brake(){
        System.out.println("Car is breaking");
    }

    public void accelerate(){
        if (amountOfFuel > 0) {
            amountOfFuel = amountOfFuel - 1;
            System.out.println("Car is accelerating");
        }/*else{
            System.out.println("out of gas");
        }*/
    }

    public void refuel(int amount){
        System.out.println("Fuel on the tank: " + amountOfFuel);
        System.out.println("Refuel: " + amount);
        System.out.println("Fuel on the tank after the refuel: " + (amountOfFuel + amount));
    }

    private void printData(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Fuel: " + amountOfFuel);
    }


}