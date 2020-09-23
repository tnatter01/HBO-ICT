import nl.saxion.app.SaxionApp;
import java.awt.Color;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 1024, 768);
    }

    public void run() {
        SaxionApp.print("Please enter the X coordinate of the bottom-left corner of the house: ");
        int xCoordinate = SaxionApp.readInt();

        SaxionApp.print("Please enter the Y coordinate of the bottom-left corner of the of the house: ");
        int yCoordinate = SaxionApp.readInt();

        SaxionApp.print("Please enter the width of the house (ex. roof): ");
        int width = SaxionApp.readInt();

        SaxionApp.print("Please enter the height of the house (ex. roof): ");
        int height = SaxionApp.readInt();

        SaxionApp.saveImage("Exercise7/sample_output.png");
        SaxionApp.pause();

        SaxionApp.clear();
        SaxionApp.setBorderColor(Color.WHITE);

        int roofHeight = (int) (height * 0.5);

        SaxionApp.drawLine(xCoordinate, yCoordinate, xCoordinate+width, yCoordinate); // Bottom floor
        SaxionApp.drawLine(xCoordinate, yCoordinate, xCoordinate, yCoordinate-height); // Left wall
        SaxionApp.drawLine(xCoordinate+width, yCoordinate, xCoordinate+width, yCoordinate-height); // Right wall
        SaxionApp.drawLine(xCoordinate, yCoordinate-height, xCoordinate+width, yCoordinate-height); // Top floor

        SaxionApp.drawLine(xCoordinate, yCoordinate-height, xCoordinate + (width/2), yCoordinate-height-roofHeight);
        SaxionApp.drawLine(xCoordinate+width, yCoordinate-height, xCoordinate + (width/2), yCoordinate-height-roofHeight);

        SaxionApp.saveImage("Exercise7/sample_output2.png");
    }

}
