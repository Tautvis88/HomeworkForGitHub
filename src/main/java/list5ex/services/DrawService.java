package list5ex.services;

import list5ex.model.ShapeParameters;

public class DrawService {

    private ShapeParameters serviceParameters = new ShapeParameters();

    public void drawHorizontalLine() {
        for (int i = 0; i < serviceParameters.getHorizontalLineLength(); i++) {
            System.out.print(serviceParameters.getAsterisk().get(0));
        }
        System.out.println();
    }

    public void drawVerticalLine() {
        for (int i = 0; i < serviceParameters.getVerticalLineLength(); i++) {
            System.out.println(serviceParameters.getAsterisk().get(0));
        }
    }

    public void drawSquare() {
        for (int i = 0; i < serviceParameters.getVerticalLineLength(); i++) {
            drawHorizontalLine();
        }
    }
}
