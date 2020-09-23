import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 500, 500);
    }

    public void run() {
        drawStar();

        SaxionApp.saveImage("Exercise1/sample_output.png");
    }

    public void drawStar() {
        // Let's use some variables as this will make later assignments easier!
        int x = 0;
        int y = 0;
        int size = 500;

        int oneThird = size / 3; // Based on the drawing, we need to know what "a third" is.
        int oneSixth = size / 6; // And what a sixth of the size is..

        SaxionApp.drawLine(x, y + oneThird, x + oneThird, y + oneThird);
        SaxionApp.drawLine(x + oneThird, y+oneThird, x  + oneThird + oneSixth, y);
        SaxionApp.drawLine(x + oneThird + oneSixth, y, x + 2 * oneThird, y + oneThird);
        SaxionApp.drawLine(x + 2*oneThird, y+oneThird, x + 3*oneThird, y+oneThird);
        SaxionApp.drawLine(x + 3*oneThird, y+oneThird, x + 2*oneThird, y + oneThird + oneSixth);
        SaxionApp.drawLine(x + 2*oneThird, y + oneThird + oneSixth, x + size, y + size);
        SaxionApp.drawLine(x + size, y + size, x + oneThird + oneSixth, y + 2*oneThird);
        SaxionApp.drawLine(x + oneThird + oneSixth, y + 2*oneThird, x, y+size);
        SaxionApp.drawLine(x, y+size, x + oneThird, y + oneThird + oneSixth);
        SaxionApp.drawLine(x + oneThird, y + oneThird + oneSixth, x, y+oneThird);
    }

}
