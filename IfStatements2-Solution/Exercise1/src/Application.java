import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application());
    }

    public void run() {
        SaxionApp.print("Please enter your age: ");
        int age = SaxionApp.readInt();

        if (age > 18 && age < 67) {
            SaxionApp.print("You are an adult but not ready for your pension yet!", Color.GREEN);
            SaxionApp.saveImage("Exercise1/sample_output2.png");
        } else {
            SaxionApp.print("You are either too young or too old...", Color.RED);
            SaxionApp.saveImage("Exercise1/sample_output.png");
        }
    }
}
