import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 500, 500);
    }

    public void run() {
        //Set fill to a random color for the next drawing
        SaxionApp.setFill(SaxionApp.getRandomColor());
        //Draw a circle on the canvas
        SaxionApp.drawCircle(100, 100, 50);
        //Set fill to a random color for the next drawing
        SaxionApp.setFill(SaxionApp.getRandomColor());
        //Draw a circle on the canvas
        SaxionApp.drawCircle(400, 100, 50);
        //Set fill to a random color for the next drawing
        SaxionApp.setFill(SaxionApp.getRandomColor());
        //Draw a circle on the canvas
        SaxionApp.drawCircle(250, 250, 50);
        //Set  fill to a random color for the next drawing
        SaxionApp.setFill(SaxionApp.getRandomColor());
        //Draw a circle on the canvas
        SaxionApp.drawCircle(100, 400, 50);
        //Set fill to a random color for the next drawing
        SaxionApp.setFill(SaxionApp.getRandomColor());
        //Draw a circle on the canvas
        SaxionApp.drawCircle(400, 400, 50);
    }

}
