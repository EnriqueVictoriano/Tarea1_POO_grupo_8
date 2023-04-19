import java.util.ArrayList;

public class Central {
    public Central(){
        zone0 = new ArrayList<Sensor>();
        zone1 = new ArrayList<Sensor>();
        zone2 = new ArrayList<Sensor>();
        isArmed = false;
        siren = null;
    }
    public void arm() {
        isArmed = true;
    }
    public void disarm() {
        isArmed = false;
    }
    public void setSiren(Siren s) {
        siren = s;
    }
    public void addNewSensor(Sensor s){
        zone0.add(s);
    }
    public void checkZone() {
        for (Sensor sensor : zone0) {
            if(sensor.getState() == SwitchState.OPEN){
                System.out.println("hay un sensor abierto en la zona0");
            }else{
                System.out.println("hay un sensor cerrado en la zona0");
            }
        }
        for (Sensor sensor : zone1) {
            if(sensor.getState() == SwitchState.OPEN){
                System.out.println("hay un sensor abierto en la zona1");
            }else{
                System.out.println("hay un sensor cerrado en la zona1");
            }
        }
        for (Sensor sensor : zone2) {
            if(sensor.getState() == SwitchState.OPEN){
                System.out.println("hay un sensor abierto en la zona2");
            }else{
                System.out.println("hay un sensor cerrado en la zona2");
            }
        }
    }
    public String getHeader(){
        return "Central";
    }
    public int getState(){
        return isArmed?1:0;
    }
    private ArrayList<Sensor> zone0;
    private ArrayList<Sensor> zone1;
    private ArrayList<Sensor> zone2;
    private boolean isArmed;
    private Siren siren;
}
