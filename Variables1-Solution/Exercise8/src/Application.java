import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 640, 480);
    }

    public void run() {
        // initialize the color value
        int redness = 100;

        // Disable the border
        SaxionApp.setBorderSize(0);

        // Update the fill color
        Color createdColor = SaxionApp.createColor(redness, 0, 0);
        SaxionApp.setFill(createdColor);

        // Draw the circle
        SaxionApp.drawCircle(320, 240, 200);

        // Save the example
        SaxionApp.saveImage("Exercise8/sample_output.png");

        SaxionApp.pause();

        // Up the redness and redraw the circle
        redness += 50;
        createdColor = SaxionApp.createColor(redness, 0, 0);
        SaxionApp.setFill(createdColor);

        SaxionApp.drawCircle(320, 240, 200);

        // Save the example
        SaxionApp.saveImage("Exercise8/sample_output2.png");

        // Pause for dramatic effect (and to be able to see the result)
        SaxionApp.pause();

        // Repeat
        redness += 50;
        createdColor = SaxionApp.createColor(redness, 0, 0);
        SaxionApp.setFill(createdColor);

        SaxionApp.drawCircle(320, 240, 200);

        // Save the example
        SaxionApp.saveImage("Exercise8/sample_output3.png");

        // Pause one more time
        SaxionApp.pause();

        // Repeat
        redness += 50;
        createdColor = SaxionApp.createColor(redness, 0, 0);
        SaxionApp.setFill(createdColor);

        SaxionApp.drawCircle(320, 240, 200);

        // Save the example
        SaxionApp.saveImage("Exercise8/sample_output4.png");
    }

}
