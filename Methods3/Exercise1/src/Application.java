import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 500, 500);
    }



    public void run() {

            drawStar();

    }

    public void drawStar() {

        SaxionApp.drawLine(0, 100, 50, 100);
        SaxionApp.drawLine(50, 100,75,50);
        SaxionApp.drawLine(75,50, 100, 100);
        SaxionApp.drawLine(100, 100, 150, 100);
        SaxionApp.drawLine(150, 100, 100, 135);
        SaxionApp.drawLine(100, 135, 150,200);
        SaxionApp.drawLine(150,200, 75, 150);
        SaxionApp.drawLine(75, 150, 0, 200);
        SaxionApp.drawLine( 0, 200, 50, 135);
        SaxionApp.drawLine( 50,135, 0,100);

    }

}
