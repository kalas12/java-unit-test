package net.thumbtack.school.boxes;

import net.thumbtack.school.area.HasArea;
import net.thumbtack.school.figures.v3.Figure;

class Box<T extends Figure> implements HasArea {
    private T Content;

    Box(T content) {
        setContent(content);
    }

    public T getContent() {
        return Content;
    }

    public void setContent(T content) {
        Content = content;
    }

    @Override
    public double getArea() {
        return Content.getArea();
    }

    public boolean isAreaEqual(Box content){
       return Content.getArea()==content.getArea();
    }

    static boolean isAreaEqual (Box content1,Box content2){
        return content1.getArea()==content2.getArea();
    }

}
