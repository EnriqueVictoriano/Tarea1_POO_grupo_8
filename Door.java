public class Door {
    public Door () {
        //....
        magneticSensor = new MagneticSensor();
        state = State.CLOSE;
    }
    {
        id = nextId++;
    }
    public void open() {
        ...
        //magneticSensor.moveMagnetAwayFromSwitch();

    }
    public void close() {
        ...
    }
    public String getHeader(){
        return "d"+id;
    }
    public int getState(){
        ...
    }

    private MagneticSensor magneticSensor;
    private State state;
    private final int id;
    private static int nextId;
    static {
        nextId = 0;
    }
}
