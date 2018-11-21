package net.thumbtack.school.boxes;

import net.thumbtack.school.area.HasArea;
import net.thumbtack.school.figures.v3.Figure;

class PairBox<T extends Figure,V extends Figure> implements HasArea {
    private T ContentFirst;
    private V ContentSecond;

    public PairBox (T contentFirst,V contentSecond){
        setContentFirst(contentFirst);
        setContentSecond(contentSecond);
    }

    public T getContentFirst() {
        return ContentFirst;
    }

    public void setContentFirst(T contentFirst) {
        ContentFirst = contentFirst;
    }

    public V getContentSecond() {
        return ContentSecond;
    }

    public void setContentSecond(V contentSecond) {
        ContentSecond = contentSecond;
    }

    @Override
    public double getArea() {
        return ContentSecond.getArea() + ContentFirst.getArea();
    }

   public boolean isAreaEqual(PairBox content){
        return getArea()==content.getArea();
   }

   static boolean isAreaEqual(PairBox content1,PairBox content2){
       return content1.getArea()==content2.getArea();
   }
}

