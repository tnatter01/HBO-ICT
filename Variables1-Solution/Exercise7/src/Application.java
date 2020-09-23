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
        Color generatedColor = SaxionApp.createColor(95, 36, 12);
        SaxionApp.setFill(generatedColor);

        // Disable border
        SaxionApp.setBorderSize(0);

        SaxionApp.drawRectangle(100, 150, 2*size, 4*size);
        SaxionApp.saveImage("Exercise7/sample_output.png");

        SaxionApp.pause();

        SaxionApp.drawRectangle(100, 150, 3*size, 5*size);
        SaxionApp.saveImage("Exercise7/sample_output2.png");

        SaxionApp.pause();

        SaxionApp.drawRectangle(100, 150, 4*size, 6*size);
        SaxionApp.saveImage("Exercise7/sample_output3.png");

        SaxionApp.pause();

        SaxionApp.drawRectangle(100, 150, 5*size, 7*size);
        SaxionApp.saveImage("Exercise7/sample_output4.png");
    }

}
