public class Window {
    public Window() {
        magneticSensor = new MagneticSensor();
        state = State.CLOSE;
    }
    {
        id = nextId++;
    }
    public void open() {
        ...
    }
    public void close() {
        ...
    }
    public String getHeader(){
        return "w"+id;
    }
    public int getState(){
        ...
    }
    private MagneticSensor magneticSensor;
    private State state;
    private final int id;
    private static int nextId=0;
}
