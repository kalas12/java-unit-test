package net.thumbtack.school.colors;

import static net.thumbtack.school.colors.ColorErrorCode.NULL_COLOR;
import static net.thumbtack.school.colors.ColorErrorCode.WRONG_COLOR_STRING;

public enum Color {
    RED ,GREEN ,BLUE;

    public static Color colorFromString(String colorString) throws ColorException{
        if (colorString==null){
            throw new ColorException(NULL_COLOR);
        }
        switch (colorString){
            case "RED":
                return RED ;
            case "GREEN":
                return GREEN;
            case "BLUE":
                return BLUE;
            default:
                throw new ColorException(WRONG_COLOR_STRING);
        }
    }


}
