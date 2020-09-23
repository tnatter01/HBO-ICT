import nl.saxion.app.SaxionApp;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application());
    }

    public void run() {
        // Size of each cell
        int size = 50;

        // Resize the frame to fit - We'll leave 2 "squares" on the left, right, top and bottom as padding..
        // (So the regular 3x3 field becomes a 7x7 field when drawn)
        SaxionApp.resize(7*size, 7*size);

        // 2 horizontal lines
        SaxionApp.drawLine(2*size, 2*size, 5*size, 2*size);
        SaxionApp.drawLine(2*size, 3*size, 5*size, 3*size);

        // 2 vertical lines
        SaxionApp.drawLine(3*size, 1*size, 3*size, 4*size);
        SaxionApp.drawLine(4*size, 1*size, 4*size, 4*size);

        // 9 variables for the characters to print, one for each position
        // most variables in this list are not used (yet). So they are grey.
        // most variables in this list are initialized with an empty string, which is a good way to initialize.
        String pos1 = "X";
        String pos2 = "";
        String pos3 = "";
        String pos4 = "";
        String pos5 = "O";
        String pos6 = "";
        String pos7 = "";
        String pos8 = "";
        String pos9 = "X";

        // Disable border
        SaxionApp.setBorderSize(0);

        // 3 marks, crosses and noughts, on locations 1,5 and 9.
        SaxionApp.drawBorderedText(pos1, (int)(size*2.4), (int)(size*1.4), 20);
        SaxionApp.drawBorderedText(pos5, (int)(size*3.4), (int)(size*2.4), 20);
        SaxionApp.drawBorderedText(pos9, (int)(size*4.4), (int)(size*3.4), 20);

        SaxionApp.saveImage("Exercise6/sample_output.png");
    }

}
