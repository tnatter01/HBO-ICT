import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 500, 500);
    }

    public void run() {
        SaxionApp.printLine("Calculate your BMI!", Color.ORANGE);

        SaxionApp.print("Please enter your length in metres: ");
        double length = SaxionApp.readDouble();

        SaxionApp.print("Please enter your weight in kilograms: ");
        int weight = SaxionApp.readInt();

        double bmi = calculateBmi(length, weight);

        // Draw conclusion based on the BMI
        SaxionApp.printLine("Your BMI: " + bmi);

        if(bmi < 15) {
            SaxionApp.printLine("You are severely underweight!", Color.RED);
        } else if(bmi < 18.5) {
            SaxionApp.printLine("You are underweight!", Color.ORANGE);
            SaxionApp.saveImage("Exercise5/sample_output.png");
        } else if(bmi < 25) {
            SaxionApp.printLine("You have a health weight!", Color.GREEN);
            SaxionApp.saveImage("Exercise5/sample_output2.png");
        } else if(bmi < 35) {
            SaxionApp.printLine("You are moderately obese!", Color.ORANGE);
        } else {
            SaxionApp.printLine("You are (very) severly obese!", Color.RED);
        }
    }

    // Implement the calculateBMI method
    public double calculateBmi(double length, int weight) {
        return weight / Math.pow(length, 2);
    }

}
