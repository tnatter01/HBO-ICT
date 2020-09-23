import nl.saxion.app.SaxionApp;

import java.util.Random;
import java.util.Scanner;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application());
    }

    public void run() {
        SaxionApp.print("Amount of tosses? ");
        int amountOfTosses = SaxionApp.readInt();

        int counter = 0;
        while (counter < amountOfTosses) {
            // Generate a random value from 1..6
            int randomValue = SaxionApp.getRandomValueBetween(1,7);
            SaxionApp.printLine("Roll " + (counter + 1) + " : " + randomValue);
            counter = counter + 1;
        }

        SaxionApp.saveImage("Exercise3/sample_output.png");
    }

}
