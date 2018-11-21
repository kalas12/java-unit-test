package net.thumbtack.school.figures.v3;

import net.thumbtack.school.area.HasArea;
import net.thumbtack.school.colors.Color;
import net.thumbtack.school.colors.ColorException;

import java.util.Objects;

public class Triangle extends Figure{
    private Point2D point1;
    private Point2D point2;
    private Point2D point3;

    public Triangle(Point2D point1, Point2D point2, Point2D point3, Color color) throws ColorException{
        this.setPoint1(point1);
        this.setPoint3(point3);
        this.setPoint2(point2);
        setColor(color);
    }

    public Triangle(Point2D point1, Point2D point2, Point2D point3, String color) throws ColorException {
        this.setPoint1(point1);
        this.setPoint3(point3);
        this.setPoint2(point2);
        setColor(color);
    }

    public Point2D getPoint1() {
        return point1;
    }

    public void setPoint1(Point2D point1) {
        this.point1 = point1;
    }

    public Point2D getPoint2() {
        return point2;
    }

    public void setPoint2(Point2D point2) {
        this.point2 = point2;
    }

    public Point2D getPoint3() {
        return point3;
    }

    public void setPoint3(Point2D point3) {
        this.point3 = point3;
    }

    private double calcSide (Point2D point1, Point2D point2){
        return Math.sqrt(Math.pow(point1.getX() - point2.getX(),2)+Math.pow(point1.getY() - point2.getY(),2));
    }

    public double getSide12() {
        return calcSide(point1,point2);
    }

    public double getSide13() {
        return calcSide(point1,point3);
    }

    public double getSide23() {
        return calcSide(point3,point2);
    }

    public void moveRel(int dx, int dy) {
        point1.moveRel(dx, dy);
        point2.moveRel(dx, dy);
        point3.moveRel(dx, dy);
    }

    public double getArea() {
        double a = point1.getX() * (point2.getY() - point3.getY());
        double b = point2.getX() * (point3.getY() - point1.getY());
        double c = point3.getX() * (point1.getY() - point2.getY());
        return Math.abs((a + b + c) / 2.0);
    }

    public double getPerimeter() {
        double a = getSide12();
        double b = getSide13();
        double c = getSide23();
        return a + b + c;
    }

    public boolean isInside(int x, int y) {
        int a = (point1.getX() - x) * (point2.getY() - point1.getY()) - (point2.getX() - point1.getX()) * (point1.getY() - y);
        int b = (point2.getX() - x) * (point3.getY() - point2.getY()) - (point3.getX() - point2.getX()) * (point2.getY() - y);
        int c = (point3.getX() - x) * (point1.getY() - point3.getY()) - (point1.getX() - point3.getX()) * (point3.getY() - y);
        return (a >= 0 && b >= 0 && c >= 0) || (a <= 0 && b <= 0 && c <= 0);
    }

    public boolean isInside(Point2D point2D) {
        return isInside(point2D.getX(), point2D.getY());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        if (!super.equals(o)) return false;
        Triangle triangle = (Triangle) o;
        return Objects.equals(point1, triangle.point1) &&
                Objects.equals(point2, triangle.point2) &&
                Objects.equals(point3, triangle.point3);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), point1, point2, point3);
    }
}
