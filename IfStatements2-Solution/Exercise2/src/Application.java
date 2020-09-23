import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application());
    }

    public void run() {
        SaxionApp.print("What is the brand of the car? ");
        String brand = SaxionApp.readString();

        SaxionApp.print("How many kilometers has the car driven? ");
        int kilometers = SaxionApp.readInt();

        if (brand.equalsIgnoreCase("volvo") || kilometers < 100000) {
            SaxionApp.print("All good! No maintenance needed!", Color.GREEN);
            SaxionApp.saveImage("Exercise2/sample_output.png");
        } else {
            SaxionApp.print("Maintenance needed!", Color.RED);
            SaxionApp.saveImage("Exercise2/sample_output2.png");
        }
    }

}
