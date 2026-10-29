package ru.suhanov.forshapes;
import java.util.Arrays;
import ru.suhanov.main.lenmeasure;
import ru.suhanov.main.intochain;

public class Line implements lenmeasure,intochain {
    public Point[] p_arr;

    public Line(Point[] p_arr){
        this.p_arr=p_arr;
    }

    public Line() {
    }

    public double getlen(Point[] arr) {
        if (arr == null || arr.length < 2) {
            return 0;
        }
        double total = 0;
        for (int i = 0; i < arr.length-1; i++) {
            Point curr = arr[i];
            Point next = arr[i + 1];
            double dx = next.x - curr.x;
            double dy = next.y - curr.y;
            double distance = Math.sqrt(dx * dx + dy * dy);
            total+=distance;
        }
        return total;
    }
    @Override
    public double measure() {
        return getlen(this.p_arr);
    }

    @Override
    public Line PolygonalChainget() {
        return new Line(p_arr);
    }

    //@Override
    public boolean equals(Line line){
        if (this.p_arr==line.p_arr){
            return true;
        }
        return false;
    }

    public String toString(){
        return "Ломаная с углами в точках "+Arrays.toString(p_arr)+", общая длина: "+measure();
    }
}
