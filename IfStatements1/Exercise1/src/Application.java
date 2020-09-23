import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 640, 200 );
    }

    public void run() {

        SaxionApp.print("Vul je leeftijd in: ");
        int leeftijd = SaxionApp.readInt();

        if(leeftijd <=17){
            SaxionApp.print("Jij mag nog geen alcohol kopen", Color.red);
        } else{
            SaxionApp.print("Jij mag alcohol kopen", Color.green);

        }

    }

}
