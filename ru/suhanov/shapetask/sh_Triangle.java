package ru.suhanov.shapetask;
import ru.suhanov.forshapes.Line;
import ru.suhanov.forshapes.Point;


public class sh_Triangle extends Shape{

    public sh_Triangle(Point[] points){
        this.edges=points;
        if (points.length>3){
            throw new ArrayIndexOutOfBoundsException("У треугольника не может быть более 3 сторон");
        }
        getDistances();
        this.area=area();

    }
    private void getDistances() {
        double a=0;
        double b=0;
        double c=0;
        for (int i=0;i<this.edges.length;i++){
            int x1=this.edges[i].x;
            int y1=this.edges[i].y;
            int x2=this.edges[(i+1)%this.edges.length].x;
            int y2=this.edges[(i+1)%this.edges.length].y;
            double sidelen = Math.sqrt((y1-x1)*(y1-x1)+(y2-x2)*(y2-x2));
            switch(i) {
                case (0): a=sidelen;
                case (1): b=sidelen;
                case (2): c=sidelen;
            }
        }
        this.sidelen=a;
        this.side2len=b;
        this.side3len=c;
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("Треугольника с такими сторонами не существует");
        }
    }

    @Override
    public double area() {
        double perimeter=(sidelen+side2len+side3len)/2.0;
        return Math.sqrt(perimeter * (perimeter - sidelen) * (perimeter - side2len) * (perimeter - side3len));
    }

    @Override
    public Line PolygonalChainget(){
        return new Line(edges);
    }
    public String toString(){
        return "Треугольник в точках "+edges[0]+edges[1]+edges[2]+ ", с площадью "+area;
    }
}
