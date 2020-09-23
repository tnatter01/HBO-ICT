import nl.saxion.app.SaxionApp;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 300, 200);
    }

    public void run() {
        String lastName = "Hageraats";
        String firstName = "Esther";

        SaxionApp.printLine("Hi " + firstName + " " + lastName);
        SaxionApp.printLine("Welcome to Saxion!");

        SaxionApp.saveImage("Exercise1/sample_output.png");
    }

}
