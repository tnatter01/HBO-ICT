import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 350, 350);
    }

    public void run() {
        SaxionApp.setBackgroundColor(Color.WHITE);
        SaxionApp.setFill(Color.WHITE);
        SaxionApp.setBorderColor(Color.BLACK);

        SaxionApp.drawRectangle(50, 150, 150, 50);
        SaxionApp.drawRectangle(80, 180, 20, 20);

        SaxionApp.drawLine(50, 150, 125, 125);
        SaxionApp.drawLine(200, 150, 125, 125);

        SaxionApp.saveImage("Exercise3/sample_output.png");

    }

}
