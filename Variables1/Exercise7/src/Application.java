import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application());
    }

    public void run() {
        // Size of each cell
        int size = 30;

        // Resize the board
        SaxionApp.resize(12*size, 16*size);

        // Colors in the image
        SaxionApp.setBackgroundColor(Color.WHITE);
        Color generatedColor = SaxionApp.createColor(95, 36, 12);;
        SaxionApp.setFill(generatedColor);

        // Disable border
        SaxionApp.turnBorderOff();

        // You take it from here! Remember that you can take a *pause* after each step!
        SaxionApp.drawRectangle(100,100,50,100);
        SaxionApp.pause();
        SaxionApp.drawRectangle(100,100,75,125);
        SaxionApp.pause();
        SaxionApp.drawRectangle(100,100,100,150);
        SaxionApp.pause();
        SaxionApp.drawRectangle(100,100,125,175);

    }

}
