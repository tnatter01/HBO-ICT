import nl.saxion.app.SaxionApp;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application());
    }

    public void run() {
        int minimumSize = 50;
        int maximumSize = 90;

        SaxionApp.print("Please, what size between 50 and 90 do you want for your game: ");
        int size = SaxionApp.readInt();

        // if user entered a value too low or loo high, the size is adjusted to either the minimum or the maximum
        if (size < minimumSize){
            size = minimumSize;
        }
        if (size > maximumSize){
            size = maximumSize;
        }

        // 9 variables for the characters to print, one for each position
        // first we initialize all positions with the numner
        String pos1 = "1";
        String pos2 = "2";
        String pos3 = "3";
        String pos4 = "4";
        String pos5 = "5";
        String pos6 = "6";
        String pos7 = "7";
        String pos8 = "8";
        String pos9 = "9";



        // The variable moveX defines where the first X will be placed
        // ask player X the first move
        // printed over two lines in case the screen is small
        SaxionApp.print("Player X, ");
        SaxionApp.print("what's your first move (1-9 and 0 for exit): ");
        int moveX = SaxionApp.readInt();

        SaxionApp.saveImage("Exercise9/sample_output1.png");

        while(moveX != 0) {
            SaxionApp.clear();

            if (moveX == 1) {
                pos1 = "X";
            } else if (moveX == 2) {
                pos2 = "X";
            } else if (moveX == 3) {
                pos3 = "X";
            } else if (moveX == 4) {
                pos4 = "X";
            } else if (moveX == 5) {
                pos5 = "X";
            } else if (moveX == 6) {
                pos6 = "X";
            } else if (moveX == 7) {
                pos7 = "X";
            } else if (moveX == 8) {
                pos8 = "X";
            } else if (moveX == 9) {
                pos9 = "X";
            } else {
                SaxionApp.printLine("Sorry, I didn't understand that input.");
            }

            // bordersize was set to 0, but we need a border to make te lines more visible
            SaxionApp.setBorderSize(2);

            // 2 horizontal lines
            SaxionApp.drawLine(2 * size, 2 * size, 5 * size, 2 * size);
            SaxionApp.drawLine(2 * size, 3 * size, 5 * size, 3 * size);

            // 2 vertical lines
            SaxionApp.drawLine(3 * size, 1 * size, 3 * size, 4 * size);
            SaxionApp.drawLine(4 * size, 1 * size, 4 * size, 4 * size);

            // bordersize 0 makes the text easier to read
            SaxionApp.setBorderSize(0);

            // Update of the board after one move of playerX
            SaxionApp.drawBorderedText(pos1, (int) (size * 2.4), (int) (size * 1.4), 20);
            SaxionApp.drawBorderedText(pos2, (int) (size * 3.4), (int) (size * 1.4), 20);
            SaxionApp.drawBorderedText(pos3, (int) (size * 4.4), (int) (size * 1.4), 20);
            SaxionApp.drawBorderedText(pos4, (int) (size * 2.4), (int) (size * 2.4), 20);
            SaxionApp.drawBorderedText(pos5, (int) (size * 3.4), (int) (size * 2.4), 20);
            SaxionApp.drawBorderedText(pos6, (int) (size * 4.4), (int) (size * 2.4), 20);
            SaxionApp.drawBorderedText(pos7, (int) (size * 2.4), (int) (size * 3.4), 20);
            SaxionApp.drawBorderedText(pos8, (int) (size * 3.4), (int) (size * 3.4), 20);
            SaxionApp.drawBorderedText(pos9, (int) (size * 4.4), (int) (size * 3.4), 20);

            // ask player X the first move
            // printen on two lines in case the window is small
            SaxionApp.print("Player X, ");
            SaxionApp.print("what's your next move (1-9 and 0 for exit): ");
            moveX = SaxionApp.readInt();

            SaxionApp.saveImage("Exercise9/sample_output2.png");
        }

        SaxionApp.clear();
        SaxionApp.printLine("OK, bye bye!");
        SaxionApp.saveImage("Exercise9/sample_output3.png");


    }

    public void drawBoard(int size, String pos1, String pos2, String pos3,String pos4,String pos5,String pos6,String pos7,String pos8,String pos9){

        SaxionApp.clear();

        // Resize the frame to fit - We'll leave 2 "squares" on the left, right, top and bottom as padding..
        // (So the regular 3x3 field becomes a 7x7 field when drawn)
        SaxionApp.resize(7*size, 7*size);

        // 2 horizontal lines
        SaxionApp.drawLine(2*size, 2*size, 5*size, 2*size);
        SaxionApp.drawLine(2*size, 3*size, 5*size, 3*size);

        // 2 vertical lines
        SaxionApp.drawLine(3*size, 1*size, 3*size, 4*size);
        SaxionApp.drawLine(4*size, 1*size, 4*size, 4*size);

        // bordersize 0 makes the text easier to read
        SaxionApp.setBorderSize(0);

        // An empty board, no moves yet
        SaxionApp.drawBorderedText(pos1, (int)(size*2.4), (int)(size*1.4), 20);
        SaxionApp.drawBorderedText(pos2, (int)(size*3.4), (int)(size*1.4), 20);
        SaxionApp.drawBorderedText(pos3, (int)(size*4.4), (int)(size*1.4), 20);
        SaxionApp.drawBorderedText(pos4, (int)(size*2.4), (int)(size*2.4), 20);
        SaxionApp.drawBorderedText(pos5, (int)(size*3.4), (int)(size*2.4), 20);
        SaxionApp.drawBorderedText(pos6, (int)(size*4.4), (int)(size*2.4), 20);
        SaxionApp.drawBorderedText(pos7, (int)(size*2.4), (int)(size*3.4), 20);
        SaxionApp.drawBorderedText(pos8, (int)(size*3.4), (int)(size*3.4), 20);
        SaxionApp.drawBorderedText(pos9, (int)(size*4.4), (int)(size*3.4), 20);
    }

}
