import com.sun.security.jgss.GSSUtil;

public class Main {
    public static void main(String[] args) {

        TouchMonitor touchMonitor = new TouchMonitor("Samsung");
        touchMonitor.setTouchXY(100,150);
        touchMonitor.printData();
    }
}

class Monitor{
    public boolean isOn;
    public String brand;

    //default constructor
    public Monitor(){
        isOn = false;
        brand = "";
    }

    public Monitor(String brandName){
        isOn = false;
        brand = brandName;
    }

    public Monitor(String brandName, boolean isMonitorOn){
        brand = brandName;
        isOn = isMonitorOn;
    }

    public void start(){
        isOn = true;
    }

    public void shutDown(){
        isOn = false;
    }

    public void printData(){
        System.out.println("Monitor");
        System.out.println("Brand: " + brand);
        if (isOn){
            System.out.println("Monitor is on.");
        }
        else{
            System.out.println("Monitor is off");
        }
    }

}

class TouchMonitor extends Monitor{

    private int touchX,touchY;



    public TouchMonitor(){
        isOn = false;
        brand = "";
        touchX = 0;
        touchY = 0;
    }

    public TouchMonitor(String brand){
        isOn = false;
        this.brand = brand;
        touchX = 0;
        touchY = 0;
    }

    public void setTouchXY(int x, int y){
         touchY = y;
         touchX = x;
    }

    @Override
    public void printData(){
        super.printData();
        System.out.println("TouchX: " + touchX + " TouchY: " + touchY);
    }
}

