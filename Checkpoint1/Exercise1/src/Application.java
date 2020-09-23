import nl.saxion.app.SaxionApp;
import nl.saxion.app.Pen;

import java.awt.*;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application());
    }

    public void run() {

        //Zet tekst op het scherm
        SaxionApp.printLine("The computer is selecting a random value between 0 and 100!\n\n");

        //Kiest een willekeurig getal en slaat het als variabele op (int omdat het een getal is)
        int randomValue = SaxionApp.getRandomValueBetween(0,100);

        //Maakt de variabele voor de ingevoerde waarde (int omdat het een getal is)
        int chosenValue = 0;

        //Loop die doorgaat totdat het ingevoerde getal gelijk is aan het willekeurige getal
        //Telt elke execution een ronde erbij op
        for (int round=1;chosenValue!=randomValue;round++){

            //Zet de tekst met de huidige ronde op het scherm
            SaxionApp.printLine("****** Round " + round + " ******\n\n");
            //Zet tekst op het scherm en leest de ingevulde waarde en zet deze in de variabele
            SaxionApp.print("Choose a value: ");
            chosenValue = SaxionApp.readInt();

            //if statement om te kijken of het willekeurige getal hoger is dan het ingevulde getal
            if(randomValue > chosenValue){
                SaxionApp.printLine("Incorrect guess! Your chosen value is too low!", Color.RED);

                //if statement om te kijken of het willekeurige getal lager is dan het ingevulde getal
            }else if(randomValue < chosenValue){
                    SaxionApp.printLine("Incorrect guess! Your chosen value is too high!", Color.RED);

                    //Als bovenstaande allebei onjuist is, is het getal dus geraden en laat het een bericht zien op het scherm
            }else{
                SaxionApp.printLine("You have guessed the number! Good job :D", Color.GREEN);
            }
        }

    }

}
