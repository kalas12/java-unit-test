package net.thumbtack.school.boxes;

import net.thumbtack.school.figures.v3.Figure;
import net.thumbtack.school.figures.v3.Rectangle;
import net.thumbtack.school.figures.v3.Triangle;

import javax.swing.text.AbstractDocument;
import java.lang.reflect.Array;

class ArrayBox<T extends Figure>{

    private T[] Content;

    public ArrayBox (T[] content){
        this.setContent(content);
    }

    public T[] getContent() {
        return Content;
    }

    public void setContent(T[] content) {
        Content = content;
    }

    public T getElement (int i){
        return Content[i];
    }

    public void setElement (int i, T content){
        Content[i]=content;
    }

    public boolean isSameSize(ArrayBox ArrayBox) {
        return Content.length==ArrayBox.Content.length;
    }
}
