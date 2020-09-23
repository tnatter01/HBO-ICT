import nl.saxion.app.SaxionApp;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 300, 200);
    }

    public void run() {

        String voornaam = "Twan";
        String achternaam = "Natter";

        SaxionApp.printLine("Hi " + voornaam + " " + achternaam);

    }

}
