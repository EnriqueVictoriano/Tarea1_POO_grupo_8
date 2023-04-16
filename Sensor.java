public class Sensor {
    public Sensor(){
        this(SwitchState.OPEN);
    }
    public Sensor(SwitchState s){
        //...
        if(s == SwitchState.OPEN){
            //activar alarma...?
        }
    }
    public SwitchState getState(){
        ....
    }
    protected void setState(SwitchState s) {
        ...
    }
    public String toString(){
        if (state== SwitchState.CLOSE)
            return "1";
        else
            return "0";
    }
    private SwitchState state;
}
