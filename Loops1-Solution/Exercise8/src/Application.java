import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application());
    }

    public void run() {
        int fieldLength = 25;

        SaxionApp.resize(fieldLength * 50 + 50, 300);
        SaxionApp.setBackgroundColor(Color.WHITE); // The image is black.. so a white background is useful to see what is going on.
        SaxionApp.setFill(SaxionApp.createColor(124, 252, 0)); // Grass green!

        int positionHorseOne = 1;

        while(positionHorseOne < fieldLength) {
            SaxionApp.clear();

            int currentPosition = 1;
            while (currentPosition < fieldLength) {
                SaxionApp.drawRectangle(currentPosition * 50, 95, 50, 5);

                if (currentPosition == positionHorseOne) {
                    SaxionApp.drawImage("Exercise8/horse_rider.png", currentPosition * 50, 50, 50, 50);
                }

                currentPosition++;
            }

            SaxionApp.pause();
            positionHorseOne += SaxionApp.getRandomValueBetween(1, 4);

        }

        SaxionApp.drawImage("Exercise8/finish_line.png", (fieldLength / 2) * 50, 150, 100, 100);

        SaxionApp.saveImage("Exercise8/sample_output.png");
    }

}
