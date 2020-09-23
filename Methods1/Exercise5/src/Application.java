import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 500, 500);
    }

    public void run() {

        //Set background color to white
        SaxionApp.setBackgroundColor(Color.white);
        //Set the border color (of the lines being drawed) to black
        SaxionApp.setBorderColor(Color.black);

        //Draw all the lines to make a house
        SaxionApp.drawLine(50, 300, 50, 100);
        SaxionApp.pause();

        SaxionApp.drawLine(50, 100, 150, 25);
        SaxionApp.pause();

        SaxionApp.drawLine(150, 25, 250, 100);
        SaxionApp.pause();

        SaxionApp.drawLine(250, 100, 50, 100);
        SaxionApp.pause();

        SaxionApp.drawLine(50, 100, 250, 300);
        SaxionApp.pause();

        SaxionApp.drawLine(250, 300, 250, 100);
        SaxionApp.pause();

        SaxionApp.drawLine(250, 100, 50, 300);
        SaxionApp.pause();

        SaxionApp.drawLine(50, 300, 250, 300);
        SaxionApp.pause();

        //Save image as house.png
        SaxionApp.saveImage("house.png");
    }

}
