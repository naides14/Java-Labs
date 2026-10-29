package ru.suhanov.shapetask;
import ru.suhanov.forshapes.Line;
import ru.suhanov.forshapes.Point;



public class sh_Rectangle extends Shape {

    public sh_Rectangle(Point leftup, int a, int b){
        this.startpoint=leftup;
        this.sidelen = a;
        this.side2len=b;
        this.area=area();
        Exc_neg();
        Doedges();
    }

    private void Exc_neg(){
        if (sidelen<=0 || side2len<=0){
            throw new IllegalArgumentException("Стороны прямоугольника не могут быть отрицательными");
        }
    }
    private void Doedges(){
        Point rightup = new Point((int) (startpoint.x+sidelen),startpoint.y);
        Point rightdown = new Point((int) (startpoint.x+sidelen), (int) (startpoint.y-side2len));
        Point leftdown = new Point(startpoint.x, (int) (startpoint.y-side2len));
        Point leftupagain = startpoint;
        this.edges= new Point[] {startpoint,rightup,rightdown,leftdown,leftupagain};
    }

    @Override
    public double area() {
        return sidelen*side2len;
    }

    @Override
    public Line PolygonalChainget() {
        return new Line(this.edges);
    }

    public String toString(){
        return "Прямоугольник в точках "+edges[0]+edges[1]+edges[2]+edges[3]+" с длинойй "+sidelen+", шириной "+side2len+", и площадью "+area;
    }


}