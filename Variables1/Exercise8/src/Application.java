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
        SaxionApp.turnBorderOff();

        // Update the fill color
        Color createdColor = SaxionApp.createColor(redness, 0, 0);
        SaxionApp.setFill(createdColor);

        // Draw the circle - If you don't want this, replace it!
        SaxionApp.drawCircle(320, 240, 200);
        SaxionApp.pause();
        // Increment the redness value 3 more times and redraw the image..
        redness = 150;
        // Update the fill color
        createdColor = SaxionApp.createColor(redness, 0, 0);
        SaxionApp.setFill(createdColor);
        // Draw the circle
        SaxionApp.drawCircle(320, 240, 200);
        SaxionApp.pause();
        // Increment the redness value 3 more times and redraw the image..
        redness = 200;
        // Update the fill color
        createdColor = SaxionApp.createColor(redness, 0, 0);
        SaxionApp.setFill(createdColor);
        // Draw the circle
        SaxionApp.drawCircle(320, 240, 200);
        SaxionApp.pause();
        // Increment the redness value 3 more times and redraw the image..
        redness = 250;
        // Update the fill color
        createdColor = SaxionApp.createColor(redness, 0, 0);
        SaxionApp.setFill(createdColor);
        // Draw the circle
        SaxionApp.drawCircle(320, 240, 200);
    }

}
