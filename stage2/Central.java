import java.util.ArrayList;

public class Central {
    public Central(){
        zone0 = new ArrayList<Sensor>();
        zone1 = new ArrayList<Sensor>();
        zone2 = new ArrayList<Sensor>();
        //isArmed = false;
        siren = null;
    }
    /*public void arm() {
        isArmed = true;
    }
    public void disarm() {
        isArmed = false;
    } */
    public void setSiren(Siren s) {
        siren = s;
    }
    public void addNewSensor(Sensor s,int n){
        if(n == 0){
            zone0.add(s);
            //System.out.println("Se agrgo un sensor en la zona 0");
        }else{
            zone1.add(s);
            //System.out.println("se agrego un sensor en la zona 1");
        }
    }
    public void checkZone() {
        for (int i=0; i<zone0.size(); i++) {
            if(zone0.get(i).getState()==SwitchState.OPEN){
                System.out.println("hay un sensor abierto en la zona0");
                siren.play();
            }else{
                System.out.println("hay un sensor cerrado en la zona0");
            }
        }
        for (Sensor sensor : zone1) {
            if(sensor.getState() == SwitchState.OPEN){
                System.out.println("hay un sensor abierto en la zona1");
                siren.play();
            }else{
                System.out.println("hay un sensor cerrado en la zona1");
            }
        }
        for (Sensor sensor : zone2) {
            if(sensor.getState() == SwitchState.OPEN){
                System.out.println("hay un sensor abierto en la zona2");
                siren.play();
            }else{
                System.out.println("hay un sensor cerrado en la zona2");
            }
        }
    }
    public String getHeader(){
        return "Central";
    }
    //public int getState(){
        //return isArmed?1:0;
    //}
    private ArrayList<Sensor> zone0;
    private ArrayList<Sensor> zone1;
    private ArrayList<Sensor> zone2;
    //private boolean isArmed;
    private Siren siren;
}
