package list5ex.services;

import list5ex.model.Color;

import java.util.Scanner;

public class SelectionService {

    private PrintService printService = new PrintService();
    private Scanner scanner = new Scanner(System.in);

    public int selectAction() {
        printService.printSelections();
        System.out.print(Color.YELLOW + "Select action: " + Color.RESET);
        return scanner.nextInt();
    }

}
