package ru.suhanov.main;
import ru.suhanov.forshapes.Line;
import ru.suhanov.forshapes.Point;
import java.util.ArrayList;

public interface intochain {

    public Line PolygonalChainget();

    static Line mergechains(intochain[] objects){
        int pointslen = 0;
        for (intochain obj:objects){
            if (obj!=null){
                Line chain = obj.PolygonalChainget();
                if (chain != null && chain.p_arr != null) {
                    pointslen += chain.p_arr.length;
                }
            }
        }
        ArrayList<Point> allPoints = new ArrayList<>(pointslen);
        for (intochain obj : objects) {
            if (obj != null) {
                Line chain = obj.PolygonalChainget();
                if (chain != null && chain.p_arr != null) {
                    for (Point p : chain.p_arr) {
                        allPoints.add(p);
                    }
                }
            }
        }
        Point[] res = new Point[pointslen];
        allPoints.toArray(res);
        return new Line(res);
    }
}


