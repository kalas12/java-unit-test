package net.thumbtack.school.colors;

public enum ColorErrorCode {
    WRONG_COLOR_STRING("There is no such color!") ,
    NULL_COLOR("Did not specify a color!");

    private String errorString;

    private ColorErrorCode (String errorString){
        this.errorString = errorString;
    }

    public String getErrorString(){
        return errorString;
    }
}
