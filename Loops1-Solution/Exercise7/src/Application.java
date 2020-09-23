import nl.saxion.app.SaxionApp;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 1024, 768);
    }

    public void run() {
       SaxionApp.print("Height? ");
       int pyramidHeight = SaxionApp.readInt();

       SaxionApp.printLine();

       int nrOfHashes = 1;
       int nrOfWhiteSpaces = pyramidHeight - 1;

       int currentRow = 0;
       while(currentRow < pyramidHeight) {

           int whiteSpaceCounter = 0;
           while(whiteSpaceCounter < nrOfWhiteSpaces) {
               SaxionApp.print(" ");
               whiteSpaceCounter++;
           }

           int hashCounter = 0;

           while(hashCounter < nrOfHashes) {
               SaxionApp.print("#");
               hashCounter++;
           }

           SaxionApp.printLine();

           currentRow++;
           nrOfHashes++;
           nrOfWhiteSpaces--;
       }

       SaxionApp.saveImage("Exercise7/sample_output2.png");
    }

}
