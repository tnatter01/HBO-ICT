import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 500, 500);
    }

    public void run() {
        SaxionApp.setBackgroundColor(Color.WHITE);
        SaxionApp.setBorderColor(Color.BLACK);

        SaxionApp.drawLine(100, 400, 100, 200);
        SaxionApp.pause();

        SaxionApp.drawLine(100, 200, 200, 100);
        SaxionApp.pause();

        SaxionApp.drawLine(200, 100, 300, 200);
        SaxionApp.pause();

        SaxionApp.drawLine(300, 200, 100, 200);
        SaxionApp.pause();

        SaxionApp.drawLine(100, 200, 300, 400);
        SaxionApp.pause();

        SaxionApp.drawLine(300, 400, 300, 200);
        SaxionApp.pause();

        SaxionApp.drawLine(300, 200, 100, 400);
        SaxionApp.pause();

        SaxionApp.drawLine(100, 400, 300, 400);

        SaxionApp.saveImage("Exercise5/sample_output.png");
    }

}
