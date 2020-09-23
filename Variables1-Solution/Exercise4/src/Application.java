import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 350, 350);
    }

    public void run() {
        // Create 9 variables for the characters to print, one for each position
        // most variables in this list are not used (yet). So they are grey.
        // most variables in this list are initialized with an empty string, which is a good way to initialize.
        char pos1 = 'X';
        char pos2 = '2';
        char pos3 = '3';
        char pos4 = '4';
        char pos5 = 'O';
        char pos6 = '5';
        char pos7 = '6';
        char pos8 = '7';
        char pos9 = 'X';

        // 2 horizontal lines
        SaxionApp.drawLine(100, 100, 250, 100);
        SaxionApp.drawLine(100, 150, 250, 150);

        // 2 vertical lines
        SaxionApp.drawLine(150, 50, 150, 200);
        SaxionApp.drawLine(200, 50, 200, 200);

        // [Optional] Disable the border
        SaxionApp.setBorderSize(0);

        // 3 marks, crosses and noughts, on locations 1,5 and 9.
        // You can fill in the numbers if you want to!
        SaxionApp.drawBorderedText("" + pos1, 120, 70, 20);
        SaxionApp.drawBorderedText("" + pos2, 170, 70, 20);
        SaxionApp.drawBorderedText("" + pos3, 220, 70, 20);
        SaxionApp.drawBorderedText("" + pos4, 120, 120, 20);
        SaxionApp.drawBorderedText("" + pos5, 170, 120, 20);
        SaxionApp.drawBorderedText("" + pos6, 220, 120, 20);
        SaxionApp.drawBorderedText("" + pos7, 120, 170, 20);
        SaxionApp.drawBorderedText("" + pos8, 170, 170, 20);
        SaxionApp.drawBorderedText("" + pos9, 220, 170, 20);

        SaxionApp.saveImage("Exercise4/sample_output.png");
    }

}
