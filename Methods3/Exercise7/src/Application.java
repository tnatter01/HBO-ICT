import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 500, 500);
    }

    public void run() {

        SaxionApp.printLine("Please enther a phase to check:");
        String check = SaxionApp.readString();
        
        if(check.equals(reverseString(check))){
            SaxionApp.printLine(check + " is a palindrome");
        } else{
            SaxionApp.printLine(check + " is not a palindrome");

        }

    }

    public String reverseString(String input) {

        String output = "";
        for(int i=input.length()-1; i>=0; i--){
//            System.out.println(input.charAt(i));
            output += input.charAt(i);
        }

        return output;
    }

}
