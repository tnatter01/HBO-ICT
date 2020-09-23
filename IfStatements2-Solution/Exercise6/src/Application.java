import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application());
    }

    public void run() {
        SaxionApp.printLine("Enter the age of the player: ");
        int age = SaxionApp.readInt();

        SaxionApp.printLine("Enter the position of the player (striker / midfielder / defender): ");
        String position = SaxionApp.readString();

        if ((age <= 20 && position.equalsIgnoreCase("striker")) || (age <= 23 && position.equalsIgnoreCase("midfielder")) || (age >= 30 && position.equalsIgnoreCase("defender"))) {
            SaxionApp.print("Suitable player!", Color.GREEN);
        } else {
            SaxionApp.print("Nope... Next!", Color.RED);
        }
    }
}
