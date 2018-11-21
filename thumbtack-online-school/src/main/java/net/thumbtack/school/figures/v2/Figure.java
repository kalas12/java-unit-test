package net.thumbtack.school.figures.v2;

import java.util.Objects;

abstract class Figure implements Colored {
    int color;

    public void setColor (int color){
        this.color = color;
    }
    public int getColor (){
        return color;
    }

    abstract void moveRel(int dx, int dy);
    abstract double getArea();
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
}
