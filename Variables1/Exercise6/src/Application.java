import nl.saxion.app.SaxionApp;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application());
    }

    public void run() {
        // Size of each cell
        int size = 60;

        // Resize the frame to fit - We'll leave 2 "squares" on the left, right, top and bottom as padding..
        // (So the regular 3x3 field becomes a 7x7 field when drawn)
        SaxionApp.resize(7*size, 7*size);

        // 2 horizontal lines - Remember to base this of size now!
        SaxionApp.drawLine(2*size, 2*size, 5*size, 2*size);
        SaxionApp.drawLine(2*size, 3*size, 5*size, 3*size);

        // 2 vertical lines - Use the size variable again!
        SaxionApp.drawLine(3*size, 1*size, 3*size, 4*size);
        SaxionApp.drawLine(4*size, 1*size, 4*size, 4*size);

        // Create 9 variables for the characters to print, one for each position
        // most variables in this list are not used (yet). So they are grey.
        // most variables in this list are initialized with an empty string, which is a good way to initialize.
        char pos1 = 'X';
        char pos2 = '2';
        char pos3 = '3';
        char pos4 = '4';
        char pos5 = 'O';
        char pos6 = '5';
        char pos7 = '6';
        char pos8 = '7';
        char pos9 = 'X';

        // [Optional] Disable border
        SaxionApp.setBorderSize(0);

        // 3 marks, crosses and noughts, on locations 1,5 and 9.
        SaxionApp.drawBorderedText("" + pos1, size*2+20, size*1+20, 20);
        SaxionApp.drawBorderedText("" + pos5, size*3+20, size*2+20, 20);
        SaxionApp.drawBorderedText("" + pos9, size*4+20, size*3+20, 20);

        SaxionApp.saveImage("Exercise5/sample_output.png");
    }

}
