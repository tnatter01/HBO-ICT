import nl.saxion.app.SaxionApp;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application());
    }

    public void run() {
        SaxionApp.print("Enter a first value: ");
        int firstValue = SaxionApp.readInt();

        SaxionApp.print("Enter a second value: ");
        int secondValue = SaxionApp.readInt();

        SaxionApp.printLine();

        SaxionApp.printLine(firstValue + " + " + secondValue + " = " + (firstValue + secondValue));
        SaxionApp.printLine(firstValue + " - " + secondValue + " = " + (firstValue - secondValue));
        SaxionApp.printLine(firstValue + " * " + secondValue + " = " + (firstValue * secondValue));
        SaxionApp.printLine(firstValue + " / " + secondValue + " = " + (firstValue / secondValue));
        SaxionApp.printLine(firstValue + " % " + secondValue + " = " + (firstValue % secondValue));

        SaxionApp.saveImage("Exercise2/sample_output.png");
    }

}
