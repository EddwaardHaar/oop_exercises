public class CodeRunner2 {
    public static void main(String[] args) {


        /* task1,2
        Dimmer dimmer = new Dimmer();
        dimmer.setBrightness(80);
        dimmer.printInfo();*/

        System.out.println(Utils.areaCalc(5,10));

    }
}





class LightSwitch{


    public boolean lightOn;


    public LightSwitch(){
        lightOn = false;
    }
    public LightSwitch(boolean lightOn) {
        this.lightOn = lightOn;
    }
    public void printInfo(){
        if (lightOn == true){
            System.out.println("Lights are on.");
        } else if (lightOn == false) {
            System.out.println("Lights are off.");
        }
    }

}

class Dimmer extends LightSwitch{
    public int brightness;

    public Dimmer(){
        brightness = brightness;
    }

    public Dimmer(int brightness) {
        this.brightness = brightness;
    }

    public void setBrightness(int brightness){
        this.brightness = brightness;
        if (brightness == 0){
            lightOn = false;
            System.out.println("Brightness is " + brightness + ".");
        }else{
            lightOn = true;
            //System.out.println("Brightness is " + brightness + ".");
        }
    }

    @Override
    public void printInfo(){
        if (brightness > 0) {
            System.out.println("Brightness is " + brightness + ".");
        }else{
            super.printInfo();
        }
    }

}
