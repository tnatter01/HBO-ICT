import nl.saxion.app.SaxionApp;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 1024, 768);
    }

    public void run() {

        drawStar(0,100);
        drawStar(200,200);

    }

    public void drawStar(int x, int y) {

        //x=0
        //y=100
        SaxionApp.drawLine(x, y, x+50, y);
        SaxionApp.drawLine(x+50, y,x+75,y-50);
        SaxionApp.drawLine(x+75,y-50, x+100, y);
        SaxionApp.drawLine(x+100, y, x+150, y);
        SaxionApp.drawLine(x+150, y, x+100, y+35);
        SaxionApp.drawLine(x+100, y+35, x+150,y+100);
        SaxionApp.drawLine(x+150,y+100, x+75, y+50);
        SaxionApp.drawLine(x+75, y+50, x, y+100);
        SaxionApp.drawLine( x, y+100, x+50, y+25);
        SaxionApp.drawLine( x+50,y+25, x,y);

    }

}
