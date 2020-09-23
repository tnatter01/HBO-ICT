import nl.saxion.app.SaxionApp;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 640, 480);
    }

    public void run() {
        // Define the table that you want to use here
        int table = 5;

        // Print the multiplication table

        for(int i=0;i<=10;i++){

            int Uitkomst = table * i;
            SaxionApp.printLine(i + " * " + table + " = " + Uitkomst);
        }
        // Your code goes here!
    }

}
