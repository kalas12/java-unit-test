package net.thumbtack.school.figures.v2;

import java.util.Objects;

public class Rectangle extends Figure {
    private Point2D topLeft;
    private Point2D bottomRight;

    public Rectangle(Point2D leftTop, Point2D rightBottom, int color) {
        topLeft = leftTop;
        bottomRight = rightBottom;
        setColor(color);
    }

    public Rectangle(int xLeft, int yTop, int xRight, int yBottom, int color) {
        this(new Point2D(xLeft, yTop),new Point2D(xRight, yBottom), color);
    }

    public Rectangle(int length, int width, int color) {
        this(new Point2D(0, width * (-1)),new Point2D(length, 0), color);
    }

    public Rectangle(int color) {
        this(new Point2D(0, -1),new Point2D(1, 0), color);
    }

    public Point2D getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point2D topLeft) {
        this.topLeft = topLeft;
    }

    public Point2D getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(Point2D bottomRight) {
        this.bottomRight = bottomRight;
    }

    public int getLength() {
        return Math.abs(bottomRight.getX() - topLeft.getX());
    }

    public int getWidth() {
        return Math.abs(bottomRight.getY() - topLeft.getY());
    }

    public void moveRel(int dx, int dy) {
        bottomRight.moveRel(dx, dy);
        topLeft.moveRel(dx, dy);
    }

    public void enlarge(int nx, int ny) {
        int xResult = Math.abs(bottomRight.getX() - topLeft.getX());
        xResult = xResult * nx + topLeft.getX();
        int yResult = Math.abs(bottomRight.getY() - topLeft.getY());
        yResult = yResult * ny + topLeft.getY();
        bottomRight.moveTo(xResult, yResult);
    }

    public double getArea() {
        return getWidth() * getLength();
    }

    public double getPerimeter() {
        return 2 * (getWidth() + getLength());
    }

    public boolean isInside(int x, int y) {
        return (topLeft.getX() <= x && bottomRight.getX() >= x) && (topLeft.getY() <= y && bottomRight.getY() >= y);
    }

    public boolean isInside(Point2D point2D) {
        return isInside(point2D.getX(), point2D.getY());
    }

    public boolean isIntersects(Rectangle rectangle) {
        if (isInside(rectangle.bottomRight) || (isInside(rectangle.topLeft))) {
            return true;
        }
        return rectangle.isInside(getTopLeft());
    }

    public boolean isInside(Rectangle rectangle) {
        return isInside(rectangle.bottomRight) && isInside(rectangle.topLeft);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle)) return false;
        if (!super.equals(o)) return false;
        Rectangle rectangle = (Rectangle) o;
        return Objects.equals(topLeft, rectangle.topLeft) &&
                Objects.equals(bottomRight, rectangle.bottomRight);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), topLeft, bottomRight);
    }
}













