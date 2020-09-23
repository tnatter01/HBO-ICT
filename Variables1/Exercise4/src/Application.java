import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 350, 350);
    }

    public void run() {

        String een = "";
        String twee = "";
        String drie = "";
        String vier = "";
        String vijf = "";
        String zes = "";
        String zeven = "";
        String acht = "";
        String negen = "";

        een = "X";
        vijf = "0";
        negen = "X";
        // 2 horizontal lines
        SaxionApp.drawLine(100, 100, 250, 100);
        SaxionApp.drawLine(100, 150, 250, 150);

        // 2 vertical lines
        SaxionApp.drawLine(150, 50, 150, 200);
        SaxionApp.drawLine(200, 50, 200, 200);

        // Remove the border from the texts
        SaxionApp.setBorderSize(0);

        // 3 marks, crosses and noughts, on locations 1,5 and 9.
        SaxionApp.drawBorderedText(een, 120, 70, 20);
        SaxionApp.drawBorderedText(vijf, 170, 120, 20);
        SaxionApp.drawBorderedText(negen, 220, 170, 20);

        SaxionApp.saveImage("Exercise6/sample_output.png");
    }

}
