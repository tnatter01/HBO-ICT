import nl.saxion.app.SaxionApp;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application());
    }

    public void run() {
        SaxionApp.print("Enter any value: ");
        int someValue = SaxionApp.readInt();

        SaxionApp.printLine();

        SaxionApp.printLine("Multiplied value: " + someValue * 1000000);

        SaxionApp.saveImage("Exercise3/sample_output.png");
    }

}
