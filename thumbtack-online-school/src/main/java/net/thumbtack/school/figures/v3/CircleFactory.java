package net.thumbtack.school.figures.v3;

import net.thumbtack.school.colors.Color;
import net.thumbtack.school.colors.ColorException;

public class CircleFactory {
    static int count = 0;

    public static Circle createCircle(Point2D center, int radius, Color color) throws ColorException{
        count++;
        return (new Circle(center, radius,color));
    }

    public static Circle createCircle(Point2D center, int radius, String color) throws ColorException {
        count++;
        return (new Circle(center, radius,color));
    }

    public static int getCircleCount() {
        return count;
    }

    public static void reset() {
        count = 0;
    }
}
