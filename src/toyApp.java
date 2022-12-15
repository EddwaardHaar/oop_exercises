public class toyApp {
    public static void main(String[] args) {

        Toy toy1 = new Toy("Shity toy", 10);
        toy1.printData();

        ToyCar toy2 = new ToyCar("Ford",120);
        toy2.printData();
    }
}

class Toy{
    String name;
    int weight;

    public Toy(){
        name = "";
        weight = 0;
    }

    public Toy(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    public void printData(){
        System.out.println("Name of Toy: " + name);
        System.out.println("Weight: " + weight);
    }
}

class ToyCar extends Toy{
    String model;
    int speed;

    public ToyCar(){
        this.model = "";
        this.speed = 0;
    }
    public ToyCar(String model, int speed){
        this.model =  model;
        this.speed = speed;
    }

    public void turnOn(){
        System.out.println("Rolling");
    }

    @Override
    public void printData(){
        super.printData();
        System.out.println("model: " + model + "speed: " + speed);
    }

}

class Barbie extends Toy{
    private String hair;
    int lvlBitch;

    public String getHair() {
        return hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public int getLvlBitch() {
        return lvlBitch;
    }

    public void setLvlBitch(int lvlBitch) {
        this.lvlBitch = lvlBitch;
    }


    public Barbie(){
        this.hair = "";
        this.lvlBitch = 0;
    }

    public Barbie(String hair, int LvlBitch){
        this.hair = hair;
        this.lvlBitch = lvlBitch;
    }


}