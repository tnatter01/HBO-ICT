import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application());
    }

    public void run() {
        SaxionApp.print("Vul hier je kilometerstand in:");
        int kilometerstand = SaxionApp.readInt();
        SaxionApp.print("Vul hier je automerk in:");
        String automerk = SaxionApp.readString();

        if(kilometerstand <=1000000 || automerk == "Volvo"){
            SaxionApp.printLine("Je hebt geen onderhoud nodig", Color.GREEN);
        } else{
            SaxionApp.printLine("Deze auto heeft onderhoud nodig", Color.RED);

        }

    }
}
