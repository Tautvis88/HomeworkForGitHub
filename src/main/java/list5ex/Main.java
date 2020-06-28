package list5ex;

/*  5. Create a List that stores the character, e.g. "*".
        a. Use the list to draw a horizontal line.
        b. Draw a vertical line
        c. Draw a square full of asterisks.
        d. * Inside the loop, allow the user to select "add" / "delete" "row" / "column" - display the effect
           after each selection.
 */

import list5ex.services.DrawService;
import list5ex.services.EditService;
import list5ex.services.PrintService;

public class Main {

    public static void main(String[] args) {

        processSquare();
        // processsTriangle();
    }

    private static void processSquare() {

        PrintService printService = new PrintService();
        DrawService drawService = new DrawService();
        EditService editService = new EditService();

        printService.printTheTask('a');
        drawService.drawHorizontalLine();

        printService.printTheTask('b');
        drawService.drawVerticalLine();

        printService.printTheTask('c');
        drawService.drawSquare();

        printService.printTheTask('d');
        editService.editSquare();
    }
}
