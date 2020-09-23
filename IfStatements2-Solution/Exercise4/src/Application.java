import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application());
    }

    public void run() {
        SaxionApp.printLine("Enter the height of the fridge: ");
        int height = SaxionApp.readInt();

        SaxionApp.printLine("Enter the year of manufacture of the fridge: ");
        int yearOfManufacture = SaxionApp.readInt();

        SaxionApp.printLine("Does the fridge contain greenhouse gases? [y/n] ");
        boolean hasGreenhouseGases = SaxionApp.readChar() == 'y';

        if (height > 150 && yearOfManufacture <= 2010 || hasGreenhouseGases) {
            SaxionApp.print("Please replace this fridge!", Color.RED);
            SaxionApp.saveImage("Exercise4/sample_output.png");
        } else {
            SaxionApp.print("Still good! Please check again next year.", Color.GREEN);
            SaxionApp.saveImage("Exercise4/sample_output2.png");
        }
    }

}