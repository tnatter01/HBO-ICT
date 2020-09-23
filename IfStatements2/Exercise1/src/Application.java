import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application());
    }

    public void run() {
        SaxionApp.print("Vul hier je leeftijd in:");
        int leeftijd = SaxionApp.readInt();

        if(leeftijd >=18 && leeftijd <=67){
            SaxionApp.printLine("Je bent niet te jong of te oud", Color.GREEN);
        } else{
            SaxionApp.printLine("Je bent te jong of te oud", Color.RED);

        }

    }
}
