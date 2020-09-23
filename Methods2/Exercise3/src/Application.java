import nl.saxion.app.SaxionApp;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application());
    }

    public void run() {

        SaxionApp.print("Enter any value: " );
        int value = SaxionApp.readInt();

        SaxionApp.print("Multiplied value: " + (value*1000000));
    }



}
