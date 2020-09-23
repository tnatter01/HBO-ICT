import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 1024, 768);
    }

    public void run() {
        int value = readIntBetweenBounds(1, 50);

        SaxionApp.printLine("The entered value is " + value, Color.GREEN);

        SaxionApp.saveImage("Exercise9/sample_output.png");
    }

    public int readIntBetweenBounds(int lowerBound, int upperBound) {
        SaxionApp.print("Please enter a value between " + lowerBound + " and " + upperBound + ": ");
        int result = SaxionApp.readInt();

        while(result < lowerBound || result > upperBound) {
            SaxionApp.printLine("That value is not in the valid range!", Color.RED);
            SaxionApp.print("Please enter a value between " + lowerBound + " and " + upperBound + ": ");
            result = SaxionApp.readInt();
        }

        return result;
    }
}
