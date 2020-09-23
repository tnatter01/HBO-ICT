import nl.saxion.app.SaxionApp;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 1024, 200);
    }

    public void run() {
        SaxionApp.printLine("This screen is not used! Check for output at the bottom of your screen!");

        // Set counter to starting value (1)
        int counter = 1;

        // As long as counter <= 100
        while(counter <= 100) {
            // Print the value of counter
            System.out.println(counter);

            // Increase the value of counter with one
            counter++;
        }
    }

}
