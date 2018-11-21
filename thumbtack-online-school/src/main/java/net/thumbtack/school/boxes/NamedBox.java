package net.thumbtack.school.boxes;

import net.thumbtack.school.area.HasArea;
import net.thumbtack.school.figures.v3.Figure;

class NamedBox<T extends Figure> extends Box<T>{
    private String Name;

    NamedBox(T content,String name) {
       super(content);
        setName(name);
    }

    public String  getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
