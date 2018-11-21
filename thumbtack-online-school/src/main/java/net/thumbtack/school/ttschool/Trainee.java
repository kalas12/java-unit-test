package net.thumbtack.school.ttschool;

import java.util.Objects;

import static net.thumbtack.school.ttschool.TrainingErrorCode.TRAINEE_WRONG_FIRSTNAME;
import static net.thumbtack.school.ttschool.TrainingErrorCode.TRAINEE_WRONG_LASTNAME;
import static net.thumbtack.school.ttschool.TrainingErrorCode.TRAINEE_WRONG_RATING;

public class Trainee {
   private String firstName;
   private String lastName;
   private int rating;

   public Trainee(String firstName, String lastName, int rating) throws TrainingException {
        setFirstName(firstName);
        setLastName(lastName);
        setRating(rating);
   }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) throws TrainingException {
        this.firstName = firstName;
        if (firstName==null || firstName==""){
            throw new TrainingException(TRAINEE_WRONG_FIRSTNAME);

        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) throws TrainingException {
        this.lastName = lastName;
        if (lastName==null || lastName==""){
            throw new TrainingException(TRAINEE_WRONG_LASTNAME);

        }
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) throws TrainingException{
        this.rating = rating;
        if (rating==0 || rating>5){
            throw new TrainingException(TRAINEE_WRONG_RATING);

        }
    }

    public String  getFullName (){
       return (getFirstName()+" "+getLastName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Trainee)) return false;
        Trainee trainee = (Trainee) o;
        return rating == trainee.rating &&
                Objects.equals(firstName, trainee.firstName) &&
                Objects.equals(lastName, trainee.lastName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(firstName, lastName, rating);
    }
}
