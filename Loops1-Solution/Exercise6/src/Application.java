import nl.saxion.app.SaxionApp;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application());
    }

    public void run() {
        SaxionApp.print("Input a sentence: ");
        String input = SaxionApp.readString();

        int currentCharacter = input.length()-1;

        while(currentCharacter >= 0) {
            SaxionApp.print(input.charAt(currentCharacter));

            currentCharacter--;
        }

        SaxionApp.saveImage("Exercise6/sample_output.png");
    }

}
