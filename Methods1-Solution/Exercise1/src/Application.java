import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 200, 200);
    }

    public void run() {
        SaxionApp.printLine("Hello World!");

        SaxionApp.saveImage("Exercise1/sample_output.png");
    }

}
