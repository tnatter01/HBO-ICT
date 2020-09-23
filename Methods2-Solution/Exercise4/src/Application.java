import nl.saxion.app.SaxionApp;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 640, 200);
    }

    public void run() {
        int diceValue = SaxionApp.getRandomValueBetween(1, 7);

        SaxionApp.printLine("The dice shows: " + diceValue);

        SaxionApp.saveImage("Exercise4/sample_output.png");
    }

}
