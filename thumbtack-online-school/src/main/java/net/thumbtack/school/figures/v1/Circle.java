package net.thumbtack.school.figures.v1;

import java.util.Objects;

public class Circle {
    private Point2D center;
    private int radius;

    public Circle(Point2D center, int radius) {
        this.setCenter(center);
        this.setRadius(radius);
    }

    public Circle(int xCenter, int yCenter, int radius) {
        this(new Point2D(xCenter, yCenter), radius);
    }

    public Circle(int radius) {
        this(new Point2D(), radius);
    }

    public Circle() {
        this(new Point2D(), 1);
    }

    public Point2D getCenter() {

        return center;
    }

    public void setCenter(Point2D center) {
        this.center = center;
    }

    public int getRadius() {

        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void moveRel(int dx, int dy) {
        center.moveRel(dx, dy);
    }

    public void enlarge(int n) {
        this.radius = radius * n;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public boolean isInside(int x, int y) {
        return ((x - center.getX()) * (x - center.getX()) + (y - center.getY()) * (y - center.getY())) <= radius * radius;
    }

    public boolean isInside(Point2D point2D) {
        return isInside(point2D.getX(), point2D.getY());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius &&
                Objects.equals(center, circle.center);
    }

    @Override
    public int hashCode() {
        return Objects.hash(center, radius);
    }
}
