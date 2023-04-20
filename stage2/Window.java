public class Window {
    public Window() {
        magneticSensor = new MagneticSensor();
        state = State.CLOSE;
    }
    {
        id = nextId++;
    }
    public void open() {
        state= State.OPEN;
        //...
    }
    public void close() {
        state = State.CLOSE;
        //...
    }
    public String getHeader(){
        return "w"+id;
    }
    public int getState(){
        if(state== State.OPEN){
            return 0;
        } else {
            return 1;
        }
    }
    public Sensor getSensor(){
        return magneticSensor;
        
    }
    private MagneticSensor magneticSensor;
    private State state;
    private final int id;
    private static int nextId=0;
}
