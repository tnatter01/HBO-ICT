import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application());
    }

    public void run() {

        //Variabelen voor de hoogte van de pyramide en de grootte van de blokken
        int pyramidHeight = 10;
        int blockSize = 25; // pixels

        //Variabelen benodigd voor het tekenen van de pyramide
        int k = 0;
        int x = blockSize*pyramidHeight - blockSize;
        int y = 0;

        //Maak de pyramide geel, en maakt de rand om de blokken 1 breed en zwart
        SaxionApp.setFill(Color.YELLOW);
        SaxionApp.setBorderSize(1);
        SaxionApp.setBorderColor(Color.black);

        //for loop die herhaalt tot i gelijk is aan de gevraagde lengte van de pyramide
        for(int i = 1; i <= pyramidHeight; ++i, k = 0) {

            //while loop die de blokken tekent
            while(k != 2 * i - 1) {
                SaxionApp.drawRectangle(x,y,blockSize,blockSize);
                ++k;
                x = x + blockSize;
            }

            //verandert de variabelen voor de volgende rij blokken die getekent moeten worden
            x = x - k*blockSize - blockSize;
            y = y + blockSize;

        }

        //resize het scherm aangepast naar de pyramide
        SaxionApp.resize(blockSize*(pyramidHeight*2-1),pyramidHeight*blockSize);

        //Haalt de statusbalk onderin weg (maakt hem 100% doorzichtig)
        SaxionApp.showMessage("",new Color(0,0,0,1));


    }
}
