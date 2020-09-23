import nl.saxion.app.SaxionApp;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 640, 480);
    }

    public void run() {
        // Define the table that you want to use here
        int table = 5;

        // Print the multiplication table
        SaxionApp.printLine("This is the multiplication table for number " + table + ":");
        SaxionApp.printLine(1 + " * " + table + " = " + table);
        SaxionApp.printLine(2 + " * " + table + " = " + 2 * table);
        SaxionApp.printLine(3 + " * " + table + " = " + 3 * table);
        SaxionApp.printLine(4 + " * " + table + " = " + 4 * table);
        SaxionApp.printLine(5 + " * " + table + " = " + 5 * table);
        SaxionApp.printLine(6 + " * " + table + " = " + 6 * table);
        SaxionApp.printLine(7 + " * " + table + " = " + 7 * table);
        SaxionApp.printLine(8 + " * " + table + " = " + 8 * table);
        SaxionApp.printLine(9 + " * " + table + " = " + 9 * table);
        SaxionApp.printLine(10 + " * " + table + " = " + 10 * table);

        SaxionApp.saveImage("Exercise2/sample_output.png");
    }

}
