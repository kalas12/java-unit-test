package net.thumbtack.school.colors;

public class ColorException extends Exception {
    ColorErrorCode ColorErrorCode;

    public ColorException (ColorErrorCode ColorErrorCode){
        this.ColorErrorCode = ColorErrorCode;
    }

    public ColorErrorCode getErrorCode(){
        return ColorErrorCode;
    }



}
