package net.thumbtack.school.colors;

import static net.thumbtack.school.colors.ColorErrorCode.NULL_COLOR;
import static net.thumbtack.school.colors.ColorErrorCode.WRONG_COLOR_STRING;

public interface Colored {
    void setColor(Color color) throws ColorException;

    Color getColor();

    void setColor(String colorString) throws ColorException ;

}