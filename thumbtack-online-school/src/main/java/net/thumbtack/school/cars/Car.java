package net.thumbtack.school.cars;

import net.thumbtack.school.colors.Color;
import net.thumbtack.school.colors.ColorException;
import net.thumbtack.school.colors.Colored;

import static net.thumbtack.school.colors.ColorErrorCode.NULL_COLOR;
import static net.thumbtack.school.colors.ColorErrorCode.WRONG_COLOR_STRING;

public class Car implements Colored {
    private String model;
    private int weight;
    private int maxSpeed;
    private Color color;

    public Car (String model, int weight, int maxSpeed, Color color) throws ColorException {
        this.setModel(model);
        this.setWeight(weight);
        this.setMaxSpeed(maxSpeed);
        this.setColor(color);
    }

    public Car (String model, int weight, int maxSpeed, String color) throws ColorException {
        this.setModel(model);
        this.setWeight(weight);
        this.setMaxSpeed(maxSpeed);
        this.setColor(color);
    }

    public void setColor (Color color)throws ColorException{
        if (color == null) {
            throw new ColorException(NULL_COLOR);
        }
        this.color = color;
    }
    public Color getColor (){
        return color;
    }

    @Override
    public void setColor(String colorString) throws ColorException {
        if (colorString == null) {
            throw new ColorException(NULL_COLOR);
        }
        switch (colorString) {
            case "RED":
                setColor(Color.RED);
                break;
            case "GREEN":
                setColor(Color.GREEN);
                break;
            case "BLUE":
                setColor(Color.BLUE);
                break;
            default:
                throw new ColorException(WRONG_COLOR_STRING);
        }
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
