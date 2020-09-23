import nl.saxion.app.SaxionApp;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application());
    }

    public void run() {

        SaxionApp.print("Amount due (in cents): ");
        int due = SaxionApp.readInt();

        SaxionApp.print("Amount paid (in cents): ");
        int paid = SaxionApp.readInt();

        int change = (paid - due);
        SaxionApp.printLine("Change: " + change + "euro cents");

        SaxionApp.printLine("100 euro: " + change / 10000);
        change = change % 10000; // Subtract the most amount of 100 euro bills.. (modulo)

        SaxionApp.printLine("50 euro: " + change / 5000);
        change = change % 5000; // Subtract the most amount of 100 euro bills.. (modulo)

        SaxionApp.printLine("20 euro: " + change / 2000);
        change = change % 2000; // Subtract the most amount of 100 euro bills.. (modulo)

        SaxionApp.printLine("10 euro: " + change / 1000);
        change = change % 1000; // Subtract the most amount of 100 euro bills.. (modulo)

        SaxionApp.printLine("5 euro: " + change / 500);
        change = change % 500; // Subtract the most amount of 100 euro bills.. (modulo)

        SaxionApp.printLine("2 euro: " + change / 200);
        change = change % 200; // Subtract the most amount of 100 euro bills.. (modulo)

        SaxionApp.printLine("1 euro: " + change / 100);
        change = change % 100; // Subtract the most amount of 100 euro bills.. (modulo)

        SaxionApp.printLine("50 cents: " + change / 50);
        change = change % 50; // Subtract the most amount of 100 euro bills.. (modulo)

        SaxionApp.printLine("20 cents: " + change / 20);
        change = change % 20; // Subtract the most amount of 100 euro bills.. (modulo)

        SaxionApp.printLine("10 cents: " + change / 10);
        change = change % 10; // Subtract the most amount of 100 euro bills.. (modulo)

        SaxionApp.printLine("5 cents: " + change / 5);
        change = change % 5; // Subtract the most amount of 100 euro bills.. (modulo)
    }

}
