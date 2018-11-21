package net.thumbtack.school.ttschool;

public class TrainingException extends Exception {
    TrainingErrorCode TrainingErrorCode;

    public TrainingException (TrainingErrorCode TrainingErrorCode){
        this.TrainingErrorCode = TrainingErrorCode;
    }

    public TrainingErrorCode getErrorCode(){
        return TrainingErrorCode;
    }
}
