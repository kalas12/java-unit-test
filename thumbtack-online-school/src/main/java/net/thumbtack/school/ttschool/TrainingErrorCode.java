package net.thumbtack.school.ttschool;

public enum TrainingErrorCode {
    TRAINEE_WRONG_FIRSTNAME(" ") ,
    TRAINEE_WRONG_LASTNAME(" "),
    TRAINEE_WRONG_RATING(" ");


    private String errorString;

    private TrainingErrorCode (String errorString){
        this.errorString = errorString;
    }

    public String getErrorString(){
        return errorString;
    }
}
