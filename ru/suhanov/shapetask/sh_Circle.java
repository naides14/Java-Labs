package ru.suhanov.shapetask;

import ru.suhanov.forshapes.Line;
import ru.suhanov.forshapes.Point;

public class sh_Circle extends Shape{
    public sh_Circle(Point center, int radius){
        this.startpoint=center;
        this.sidelen=radius;
        Exc_neg();
        this.area=area();
    };

    private void Exc_neg(){
        if (sidelen<=0){
            throw new IllegalArgumentException("Радиус окружности не может быть отрицательным");
        }
    }

    @Override
    public double area() {
        return Math.PI*sidelen*sidelen;
    }

    @Override
    public Line PolygonalChainget() {
        return null;
    }

    public String toString() {
        return "окружность с центром в точке "+startpoint+" и площадью "+area;
    }


}

