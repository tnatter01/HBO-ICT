import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 530, 275);
    }

    public void run() {
        // You should not need to modify this method.
        SaxionApp.setBackgroundColor(Color.white);
        SaxionApp.setBorderSize(5);

        drawHouse(10, 240, 100, 100, Color.red);
        drawHouse(112, 240, 80, 140, Color.blue);
        drawHouse(194, 240, 90, 120, Color.yellow);
        drawHouse(286, 240, 120, 90, Color.cyan);
        drawHouse(408, 240, 70, 110, Color.orange);
        drawHouse(480, 240, 45, 150, Color.green);

        SaxionApp.saveImage("Exercise4/sample_output.png");
    }

    // Implement your drawHouse method here.

    public void drawHouse(int x, int y, int width, int height, Color color) {
        SaxionApp.setBorderColor(color);

        int roofHeight = (int) (height * 0.5);

        SaxionApp.drawLine(x, y, x+width, y); // Bottom floor
        SaxionApp.drawLine(x, y, x, y-height); // Left wall
        SaxionApp.drawLine(x+width, y, x+width, y-height); // Right wall
        SaxionApp.drawLine(x, y-height, x+width, y-height); // Top floor

        SaxionApp.drawLine(x, y-height, x + (width/2), y-height-roofHeight);
        SaxionApp.drawLine(x+width, y-height, x + (width/2), y-height-roofHeight);
    }
}
