import nl.saxion.app.SaxionApp;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 1024, 768);
    }

    public void run() {
        drawStar(100, 100, SaxionApp.getRandomValueBetween(50, 250));
        drawStar(450, 50, SaxionApp.getRandomValueBetween(50, 250));
        drawStar(750, 200, SaxionApp.getRandomValueBetween(50, 250));
        drawStar(350, 300, SaxionApp.getRandomValueBetween(50, 250));
        drawStar(50, 550, SaxionApp.getRandomValueBetween(50, 250));
        drawStar(450, 500, SaxionApp.getRandomValueBetween(50, 250));
        drawStar(700, 450, SaxionApp.getRandomValueBetween(50, 250));
        drawStar(50, 300, SaxionApp.getRandomValueBetween(50, 250));

        SaxionApp.saveImage("Exercise3/sample_output.png");
    }

    public void drawStar(int x, int y, int size) {
        int oneThird = size / 3;
        int oneSixth = size / 6;

        SaxionApp.drawLine(x, y + oneThird, x + oneThird, y + oneThird);
        SaxionApp.drawLine(x + oneThird, y+oneThird, x  + oneThird + oneSixth, y);
        SaxionApp.drawLine(x + oneThird + oneSixth, y, x + 2 * oneThird, y + oneThird);
        SaxionApp.drawLine(x + 2*oneThird, y+oneThird, x + 3*oneThird, y+oneThird);
        SaxionApp.drawLine(x + 3*oneThird, y+oneThird, x + 2*oneThird, y + oneThird + oneSixth);
        SaxionApp.drawLine(x + 2*oneThird, y + oneThird + oneSixth, x + size, y + size);
        SaxionApp.drawLine(x + size, y + size, x + oneThird + oneSixth, y + 2*oneThird);
        SaxionApp.drawLine(x + oneThird + oneSixth, y + 2*oneThird, x, y+size);
        SaxionApp.drawLine(x, y+size, x + oneThird, y + oneThird + oneSixth);
        SaxionApp.drawLine(x + oneThird, y + oneThird + oneSixth, x, y+oneThird);
    }

}
