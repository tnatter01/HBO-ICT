import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 500, 500);
    }

    public void run() {
        //Zet de tekst "Hello world!" op het scherm met een enter erachter
        SaxionApp.printLine("Hello World!");
    }

}
