import nl.saxion.app.SaxionApp;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 1024, 768);
    }

    public void run() {

        SaxionApp.print("Value: ");
        int value = SaxionApp.readInt();
        String print = "#";

        for(int i=1;i<=value;i++) {
        SaxionApp.printLine(print);

        print = print.concat("#");
        }

        }

}
