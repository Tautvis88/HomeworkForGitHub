package list5ex.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShapeParameters {

    private static int horizontalLineLength = 13;
    private static int verticalLineLength = 5;
    private static final List<Character> ASTERISK = Arrays.asList('*');

    public int getHorizontalLineLength() {
        return horizontalLineLength;
    }

    public void setHorizontalLineLength(int horizontalLineLength) {
        this.horizontalLineLength = horizontalLineLength;
    }

    public int getVerticalLineLength() {
        return verticalLineLength;
    }

    public void setVerticalLineLength(int verticalLineLength) {
        this.verticalLineLength = verticalLineLength;
    }

    public List<Character> getAsterisk() {
        return ASTERISK;
    }

}
