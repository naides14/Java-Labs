package ru.suhanov.forshapes;
import ru.suhanov.main.lenmeasure;
import ru.suhanov.main.intochain;

public class Linestraight implements lenmeasure,intochain  {
    public Point start;
    public Point end;
    public Linestraight(Point startpoint, Point endpoint){
        this.start=startpoint;
        this.end=endpoint;
    }
    private double getlen(){
        return Math.sqrt(((end.x-start.x)*(end.x-start.x))+((end.y-start.y)*(end.y-start.y)));
    }
    public String toString(){
        return "Линия от "+start+" до "+end+" длиной "+getlen();
    }

    @Override
    public Line PolygonalChainget() {
        return new Line(new Point[]{start,end});
    }

    @Override
    public double measure() {
        return getlen();
    }
}
