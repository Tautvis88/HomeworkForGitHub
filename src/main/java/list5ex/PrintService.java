package list5ex;

public class PrintService {

    public void printSelections() {
        System.out.println("1 - Add ROW");
        System.out.println("2 - Add COLUMN");
        System.out.println("3 - Remove ROW");
        System.out.println("4 - Remove COLUMN");
        System.out.println("5 - Exit");
    }

    public void printTheTask(char taskCharacter) {
        switch (taskCharacter) {
            case 'a':
                String taskA = "a. Use the list to draw a horizontal line.";
                System.out.println(Color.YELLOW + taskA + Color.RESET);
                break;
            case 'b':
                String taskB = "b. Draw a vertical line";
                System.out.println(Color.YELLOW + taskB + Color.RESET);
                break;
            case 'c':
                String taskC = "c. Draw a square full of asterisks.";
                System.out.println(Color.YELLOW + taskC + Color.RESET);
                break;
            case 'd':
                String taskD = "d. * Inside the loop, allow the user to select \"add\"/\"delete\" \"row\"/\"column\"" +
                        " - display the effect after each selection.";
                System.out.println(Color.YELLOW + taskD + Color.RESET);
                break;
            default:
                System.out.println("Tokios užduoties nėra.");
                break;
        }
    }
}
