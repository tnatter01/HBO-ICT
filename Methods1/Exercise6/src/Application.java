import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 350, 350);
    }

    public void run() {
        // 2 horizontal lines
        SaxionApp.drawLine(50, 150, 200, 150);
        SaxionApp.drawLine(50, 200, 200, 200);
        // 2 vertical lines
        SaxionApp.drawLine(100, 100, 100, 250);
        SaxionApp.drawLine(150, 100, 150, 250);
        // [Optional] Remove the bord   er from the texts

        SaxionApp.setBorderSize(0);
        // 3 marks, crosses and noughts, on locations 1,5 and 9.

        SaxionApp.drawBorderedText("x", 60, 100, 50);
        SaxionApp.drawBorderedText("o", 110, 150, 50);
        SaxionApp.drawBorderedText("x", 160, 200, 50);

        SaxionApp.saveImage("Exercise6/sample_output.png");
    }

}
