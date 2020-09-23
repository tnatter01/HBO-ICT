import nl.saxion.app.SaxionApp;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 1000, 500);
    }

    public void run() {
        SaxionApp.print("What is the maximum value to count to? ");
        int maxValue = SaxionApp.readInt();
        int counter = 1;

        while(counter < maxValue) {
            // Print the value of counter
            String lineToPrint = String.format("%3d", counter) + " ";

            if(counter % 25 == 0) {
                SaxionApp.printLine(lineToPrint);
            } else {
                SaxionApp.print(lineToPrint);
            }

            counter = counter + 1; // Or counter++ for short..
        }

        SaxionApp.saveImage("Exercise4/sample_output.png");
    }

}
