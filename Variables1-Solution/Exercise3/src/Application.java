import nl.saxion.app.SaxionApp;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application());
    }

    public void run() {
        // Define variables m and n
        int n = 17;
        int m = 18;

        // Print the different values - Remember to do this in your head / on paper first!
        SaxionApp.printLine(n / 10 + n % 20);
        SaxionApp.printLine(n % 2 + m % 20);
        SaxionApp.printLine((m + n) / 2);
        SaxionApp.printLine((m + n) / 2.0);
    }

}
