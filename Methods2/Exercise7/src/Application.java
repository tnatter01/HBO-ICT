import nl.saxion.app.SaxionApp;
import java.awt.Color;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 1024, 768);
    }

    public void run() {

        SaxionApp.print("Please enter the x coordinate of the bottomleft corner of the house: ");
        int x = SaxionApp.readInt();

        SaxionApp.print("Please enter the y coordinate of the bottomleft corner of the house: ");
        int y = SaxionApp.readInt();

        SaxionApp.print("Please enter the width of the house: ");
        int width = SaxionApp.readInt();

        SaxionApp.print("Please enter the height of the house: ");
        int height = SaxionApp.readInt();

        SaxionApp.turnFillOff();
        SaxionApp.clear();

        SaxionApp.drawRectangle(x, (y-height), width, height);
        SaxionApp.drawLine(x, (y-height), (x+(width/2)),(y-(height))-(height/2));
        SaxionApp.drawLine((x+(width/2)),(y-(height))-(height/2), (x+width), (y-height));

    }

}
