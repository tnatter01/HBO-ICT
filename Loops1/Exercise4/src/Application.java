import nl.saxion.app.SaxionApp;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 1000, 500);
    }

    public void run() {
        SaxionApp.print("Value: ");
        int value = SaxionApp.readInt();

        for(int i=1;i<=value;i++){
            SaxionApp.print(String.format("%3d ",i));
            if(i%25 == 0){
                SaxionApp.printLine(" ");
            }
        }
        // The line below is an example on how to format an integer value (named "counter" in this case)
        // using the String.format(..) method into a 3-character based String. Each value formatted this way
        // will *always* use 3 characters, regardless of the actual value. So you can have Strings like "  1", " 22" and "114". (Note the white spaces!)
        // String lineToPrint = String.format("%3d", counter);


    }

}
