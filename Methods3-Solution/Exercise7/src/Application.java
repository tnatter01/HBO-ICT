import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 500, 500);
    }

    public void run() {
        SaxionApp.print("Please enter a phrase to check: ");
        String input = SaxionApp.readString();

        SaxionApp.print(input, Color.ORANGE);
        if (isPalindrome(input)) {
            SaxionApp.printLine(" is a palindrome!", Color.GREEN);
            SaxionApp.saveImage("Exercise7/sample_output.png");
        } else {
            SaxionApp.print(" is ");
            SaxionApp.print("NOT", Color.RED);
            SaxionApp.printLine(" a palindrome!");
            SaxionApp.saveImage("Exercise7/sample_output2.png");
        }
    }

    public boolean isPalindrome(String input) {
        return input.equals(reverseString(input));
    }

    public String reverseString(String input) {
        String result = "";

        int letterCounter = input.length() - 1; // charAt works with indices starting at 0 to length()-1

        while(letterCounter >= 0) {
            result += input.charAt(letterCounter);

            letterCounter--;
        }

        return result;
    }

}
