package net.thumbtack.school.figures.v2;

import java.util.Objects;

public class Cylinder extends Circle {
    private int height;

    public Cylinder(Point2D center, int radius, int height, int color) {
        super(center, radius,color);
        setHeight(height);
    }

    public Cylinder(int xCenter, int yCenter, int radius, int height, int color) {
        super(xCenter, yCenter, radius,color);
        setHeight(height);
    }

    public Cylinder(int radius, int height, int color) {
        super(radius,color);
        setHeight(height);
    }

    public Cylinder(int color) {
        super(color);
        setHeight(1);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getVolume() {
        return getArea() * getHeight();
    }

    public boolean isInside(int x, int y, int z) {
        return isInside(x,y) && (0 <= z && height >= z);
    }

    public boolean isInside(Point3D point) {
        return isInside(point.getX(), point.getY(), point.getZ());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cylinder cylinder = (Cylinder) o;
        return height == cylinder.height;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), height);
    }
}
