import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application());
    }

    public void run() {
        SaxionApp.print("What is the name of the place? ");
        String name = SaxionApp.readString();

        SaxionApp.printLine("Does the place have an (old) city wall? [y/n] ");
        boolean hasCityWall = SaxionApp.readChar() == 'y';

        SaxionApp.printLine("Did the place get city rights at one point in history? [y/n] ");
        boolean hasCityRights = SaxionApp.readChar() == 'y';

        if (name.equals("Enschede") || name.equals("Deventer") || (hasCityWall && hasCityRights)) {
            SaxionApp.print(name + " is a city!", Color.GREEN);
            SaxionApp.saveImage("Exercise5/sample_output.png");
        } else {
            SaxionApp.print(name + " is NOT a city!", Color.RED);
            SaxionApp.saveImage("Exercise5/sample_output2.png");
        }
    }

}
