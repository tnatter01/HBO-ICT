import nl.saxion.app.SaxionApp;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 1024, 200);
    }

    public void run() {
        SaxionApp.printLine("This screen is not used! Check for output at the bottom of your screen!");

        // Set counter to starting value (50)
        int counter = 50;

        // As long as counter > 0
        while(counter > 0) {
            // Print the value of counter
            System.out.println(counter);

            // Decrease the value of counter with one
            counter--;
        }
    }

}
