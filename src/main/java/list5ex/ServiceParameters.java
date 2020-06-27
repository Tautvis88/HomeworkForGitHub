package list5ex;

import java.util.ArrayList;
import java.util.List;

public class ServiceParameters {

    private static int horizontalLineLength = 13;
    private static int verticalLineLength = 5;
    private static final List<Character> ASTERISK = new ArrayList<>();
    static {
        ASTERISK.add('*');
    }

    public int getHorizontalLineLength() {
        return horizontalLineLength;
    }

    public void setHorizontalLineLength(int horizontalLineLength) {
        ServiceParameters.horizontalLineLength = horizontalLineLength;
    }

    public int getVerticalLineLength() {
        return verticalLineLength;
    }

    public void setVerticalLineLength(int verticalLineLength) {
        ServiceParameters.verticalLineLength = verticalLineLength;
    }

    public List<Character> getAsterisk() {
        return ASTERISK;
    }

}
