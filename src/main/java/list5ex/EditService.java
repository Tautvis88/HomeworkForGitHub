package list5ex;

public class EditService {

    private DrawService drawService = new DrawService();
    private ServiceParameters serviceParameters = new ServiceParameters();
    private SelectionService selectionService = new SelectionService();

    public void editSquare() {
        while (true) {
            int selection = selectionService.selectAction();
            switch (selection) {
                case 1:
                    addRow();
                    break;
                case 2:
                    addColumn();
                    break;
                case 3:
                    removeRow();
                    break;
                case 4:
                    removeColumn();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println(Color.RED + "Tokio pasirinkimo nėra." + Color.RESET);
                    break;
            }
        }
    }

    private void addRow() {
        int verticalLineLength = serviceParameters.getVerticalLineLength();
        int maxNumberOfRows = 10;
        if (verticalLineLength < maxNumberOfRows) {
            serviceParameters.setVerticalLineLength(++verticalLineLength);
            drawService.drawSquare();
        } else {
            System.out.println(Color.RED + "You have reached the maximum number of rows " + maxNumberOfRows +
                                           " - you can't add anymore.");
            drawService.drawSquare();
            System.out.print(Color.RESET);
        }
    }

    private void addColumn() {
        int horizontalLineLength = serviceParameters.getHorizontalLineLength();
        int maxNumberOfColumns = 20;
        if (horizontalLineLength < maxNumberOfColumns) {
            serviceParameters.setHorizontalLineLength(++horizontalLineLength);
            drawService.drawSquare();
        } else {
            System.out.println(Color.RED + "You have reached the maximum number of columns " + maxNumberOfColumns +
                                           " - you can't add anymore.");
            drawService.drawSquare();
            System.out.print(Color.RESET);
        }
    }

    private void removeRow() {
        int verticalLineLength = serviceParameters.getVerticalLineLength();
        if (verticalLineLength > 1) {
            serviceParameters.setVerticalLineLength(--verticalLineLength);
            drawService.drawSquare();
        } else {
            System.out.println(Color.RED + "Can't remove the last row.");
            drawService.drawSquare();
            System.out.print(Color.RESET);
        }
    }

    private void removeColumn() {
        int horizontalLineLength = serviceParameters.getHorizontalLineLength();
        if (horizontalLineLength > 1) {
            serviceParameters.setHorizontalLineLength(--horizontalLineLength);
            drawService.drawSquare();
        } else {
            System.out.println(Color.RED + "Can't remove the last column.");
            drawService.drawSquare();
            System.out.print(Color.RESET);
        }
    }
}
