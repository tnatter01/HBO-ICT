import nl.saxion.app.SaxionApp;
import nl.saxion.app.elements.CanvasElement;

import java.awt.*;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 350, 350);
    }

    public void run() {
        //Change the background color on top of which your content is shown.
        SaxionApp.setBackgroundColor(Color.white);
        //Set the fill color of the objects that are going to be drawn.
        SaxionApp.setFill(Color.white);
        //Set the color of the border.
        SaxionApp.setBorderColor(Color.black);
        //Draw the first rectangle (outside of the house)
        SaxionApp.drawRectangle(20,75, 150,50);
        //Draw the second rectangle (door of the house)
        SaxionApp.drawRectangle(50, 110, 15,15);
        //Draw two lines for the roof
        SaxionApp.drawLine(20, 75, 95, 50);
        SaxionApp.drawLine(95, 50, 170, 75);
    }

}
