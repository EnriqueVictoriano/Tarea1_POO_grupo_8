import java.io.File;
import java.net.URL;

public class Siren {
    public Siren (/*String soundFileName*/){
       /* try {
            dir = new File(soundFileName).toURI().toURL();
        }
        catch (Exception exc){
            exc.printStackTrace(System.out);
        }*/
    }
    public void play(){
        /*...
        //aWave= new AePlayWave(dir);
        aWave.start();*/
        System.out.println("Sirena sonando");
        isSounding = true;
    }
    public void stop(){
        //...
        //aWave.stopSounding();
        System.out.println("Sirena silenciada");
        isSounding = false;
    }
    public String getHeader() {
        return "Siren";
    }
    public int getState() {
        if(isSounding == true){
            return 0;
        }else{
            return 1;
        }

    }
   // private URL dir;
    private boolean isSounding;
   // private AePlayWave aWave;
}
