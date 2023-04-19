import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Stage2 {
    public Stage2() {
        doors = new ArrayList<Door>();
        windows = new ArrayList<Window>();
    }
    public void readConfiguration(Scanner in){
        // reading <#_doors> <#_windows> <#_PIRs>
        central = new Central();
        int numDoors = in.nextInt();
        for (int i = 0; i < numDoors; i++)
            doors.add(new Door());
            central...

        int numWindows = in.nextInt();
        for (int i = 0; i < numWindows; i++)
            windows.add(new Window());
            central....
        //...
        in.nextLine();
        String soundFile = in.next();
        siren = new Siren(soundFile);
        central.setSiren(siren);

        in.close();
    }
    public void executeUserInteraction (Scanner in, PrintStream out){
        char command, parameter;
        int step=0;
        boolean done =false;
        printHeader(out);
        while (!done) {
            printState(step++, out);
            command = in.next().charAt(0);
            switch (command) {
                case 'd':
                    parameter = in.next().charAt(0);
                    if (parameter == 'o'){
                        doors.get(0).open();}
                    else
                        doors.get(0).close();
                    break;
                case 'w':
                    //...
                    parameter = in.next().charAt(0);
                    if (parameter == 'o')
                        windows.get(0).open();
                    else
                        windows.get(0).close();
                    break;
                case 'k':
                    parameter = in.next().charAt(0);
                    switch (parameter){
                        case 'a':
                            //todo
                            central.arm();
                            break;
                        case 'p':
                            //perimetro
                            break;
                        case 'd':
                            //desarmar
                            central.disarm();
                            break;
                    }
                case 'x': done=true;
                   // Added to finish the program
            }
            central.checkZone();
        }
    }
    public void printHeader(PrintStream out){
        out.print("Step");
        for (int i=0; i < doors.size(); i++)
            out.print("\t"+doors.get(i).getHeader());
        //.....
        for (int i=0; i < windows.size(); i++)
            out.print("\t"+windows.get(i).getHeader());
        out.println();
    }
    public void printState(int step, PrintStream out){
        out.print(step);
        for (int i=0; i < doors.size(); i++)
            out.print("\t"+doors.get(i).getState());

        for (int i=0; i < windows.size(); i++)
            out.print("\t"+windows.get(i).getState());
        out.println();


    }
    public static void main(String [] args) throws IOException {
        if (args.length != 1) {
            System.out.println("Usage: java Stage1 <configurationFile.txt>");
            System.exit(-1);
        }
        Scanner in = new Scanner(new File(args[0]));
        System.out.println("File: " + args[0]);
        Stage2 stage = new Stage2();
        stage.readConfiguration(in);
        stage.executeUserInteraction(new Scanner(System.in), new PrintStream(new File("output.csv")));
    }

    private ArrayList<Door> doors;
    private ArrayList<Window> windows;
    private Central central;
    private Siren siren;
}
