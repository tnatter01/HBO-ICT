import nl.saxion.app.SaxionApp;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application());
    }

    public void run() {

        SaxionApp.print("Enter a first value: ");
        int eerste = SaxionApp.readInt();

        SaxionApp.print("Enter a second value: ");
        int tweede = SaxionApp.readInt();

        SaxionApp.printLine(eerste + " + " + tweede + " = " + (eerste+tweede));
        SaxionApp.printLine(eerste + " - " + tweede + " = " + (eerste-tweede));
        SaxionApp.printLine(eerste + " * " + tweede + " = " + (eerste*tweede));
        SaxionApp.printLine(eerste + " / " + tweede + " = " + (eerste/tweede));
        SaxionApp.printLine(eerste + " % " + tweede + " = " + (eerste%tweede));
    }

}
