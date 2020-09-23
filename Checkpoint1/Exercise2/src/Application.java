import nl.saxion.app.SaxionApp;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 640, 400);
    }

    public void run() {

        SaxionApp.print("Amount of tosses?");
        int amountOfTosses = SaxionApp.readInt();

        //Declaratie van integers voor het tellen van aantal worpen per getal
        //Staat erbuiten omdat na het completen van de for loop alle variabelen worden gewist
        int aantal1 = 0;
        int aantal2 = 0;
        int aantal3 = 0;
        int aantal4 = 0;
        int aantal5 = 0;
        int aantal6 = 0;

        int totaalGegooid = 0;

        //for loop die net zo lang doorgaat tot het gevraagde aantal worpen is gegooid
        for(int i=0;amountOfTosses>i;i++){
            //genereer random getal tussen 1 en 7 (1 t/m 6)
            int worp = SaxionApp.getRandomValueBetween(1,7);

            //bereken totaal gegooide worpen
            totaalGegooid = totaalGegooid+worp;

            //tel de aantal per worp op
            switch (worp){
                case 1:
                    aantal1++;
                    break;
                case 2:
                    aantal2++;
                    break;
                case 3:
                    aantal3++;
                    break;
                case 4:
                    aantal4++;
                    break;
                case 5:
                    aantal5++;
                    break;
                case 6:
                    aantal6++;
                    break;
            }
        }

        //Print alle variabelen uit met het aantal worpen
        SaxionApp.printLine("Ones:" + aantal1);
        SaxionApp.printLine("Twos:" + aantal2);
        SaxionApp.printLine("Threes:" + aantal3);
        SaxionApp.printLine("Fours:" + aantal4);
        SaxionApp.printLine("Fives:" + aantal5);
        SaxionApp.printLine("Sixes:" + aantal6);

        //Bereken het gemiddelde
        double average = (double)totaalGegooid/amountOfTosses;

        //Print het gemiddelde uit
        SaxionApp.printLine("\n\nAverage: " + average);
    }

}
