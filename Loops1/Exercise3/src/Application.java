import nl.saxion.app.SaxionApp;

import java.util.Random;
import java.util.Scanner;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application());
    }

    public void run() {

        SaxionApp.print("Aantal worpen: ");
        int aantalWorpen = SaxionApp.readInt();

        for(int i=1;i<=aantalWorpen;i++){
            SaxionApp.printLine(i + "e worp: " + SaxionApp.getRandomValueBetween(1,7));
        }

    }

}
