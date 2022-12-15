public class elevatorApp {
    public static void main(String[] args) {
        Elevator elevator = new Elevator();
        elevator.goUpDown("up");
        elevator.goUpDown("up");

        elevator.setFloor(6);
        System.out.println(elevator.getFloor());

    }
}

class Elevator{

    private int floor;

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        if (floor > 0 && floor <= 10) {
            this.floor = floor;
        }else{
            System.out.println("Error");
        }
    }
    public Elevator(){
        floor = 0;
    }

    private void printData(){
        System.out.println("Elevator");
        System.out.println("Floor: " + floor);
    }

    public void goUpDown(String direction) {

        if (direction.equals("up")){
            floor++;
        }else{
            floor--;
        }
        printData();
    }
}
