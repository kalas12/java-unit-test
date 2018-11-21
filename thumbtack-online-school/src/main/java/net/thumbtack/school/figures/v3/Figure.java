package net.thumbtack.school.figures.v3;

import net.thumbtack.school.area.HasArea;
import net.thumbtack.school.colors.Color;
import net.thumbtack.school.colors.ColorException;
import net.thumbtack.school.colors.Colored;

import java.io.Serializable;
import java.util.Objects;

import static net.thumbtack.school.colors.ColorErrorCode.NULL_COLOR;
import static net.thumbtack.school.colors.ColorErrorCode.WRONG_COLOR_STRING;

public abstract class Figure implements Colored,HasArea,Serializable{
    Color color;

    public void setColor (Color color) throws ColorException{
        if (color == null) {
            throw new ColorException(NULL_COLOR);
        }
        this.color = color;
    }
    public Color getColor (){
        return color;
    }

    abstract void moveRel(int dx, int dy);

    abstract double getPerimeter();
    abstract boolean isInside(int x, int y);
    abstract boolean isInside(Point2D point2D);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Figure)) return false;
        Figure figure = (Figure) o;
        return color == figure.color;
    }

    @Override
    public int hashCode() {

        return Objects.hash(color);
    }

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
}
