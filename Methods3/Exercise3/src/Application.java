import nl.saxion.app.SaxionApp;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 1024, 768);
    }

    public void run() {

        drawStar(0,100, 100);
        drawStar(200,200, 150);

    }

    public void drawStar(int x, int y, int size) {

        //x=0
        //y=100
        int eenDerde = size / 3;
        int eenZesde = eenDerde / 2;
        int a = eenZesde/100*140;
        SaxionApp.drawLine(x, y, x+eenDerde, y);
        SaxionApp.drawLine(x+eenDerde, y,x+(eenDerde+eenZesde),y-eenDerde);
        SaxionApp.drawLine(x+(eenDerde+eenZesde),y-eenDerde, x+(2*eenDerde), y);
        SaxionApp.drawLine(x+(2*eenDerde), y, x+(3*eenDerde), y);
        SaxionApp.drawLine(x+(3*eenDerde), y, x+(2*eenDerde), y+eenZesde);
        SaxionApp.drawLine(x+(2*eenDerde), y+eenZesde, x+(3*eenDerde),y+(2*eenDerde));
        SaxionApp.drawLine(x+(3*eenDerde),y+(2*eenDerde), x+(eenDerde+eenZesde), y+eenDerde);
        SaxionApp.drawLine(x+(eenDerde+eenZesde), y+eenDerde, x, y+(2*eenDerde));
        SaxionApp.drawLine( x, y+(2*eenDerde), x+eenDerde, y+eenZesde);
        SaxionApp.drawLine( x+eenDerde,y+eenZesde, x,y);

    }

}
