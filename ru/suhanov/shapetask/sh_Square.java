package ru.suhanov.shapetask;
import ru.suhanov.forshapes.Line;
import ru.suhanov.forshapes.Point;

public class sh_Square extends Shape {

    public sh_Square(Point leftup, int eqsidelen){
        this.startpoint=leftup;
        this.sidelen = eqsidelen;
        this.area=area();
        Exc_neg();
        Doedges();
    }
    public sh_Square(int x, int y, int inpsidelen) {
        this.startpoint = new Point(x,y);
        this.sidelen=inpsidelen;
        this.area=area();
        Exc_neg();
        Doedges();
    }

    public void Setlastpoint(Point lastpoint){
        int newsidelen=this.startpoint.y - lastpoint.y;
        this.sidelen=newsidelen;
        Exc_neg();
        Doedges();
    }

    public void Setsidelen(int newsidelen){
        this.sidelen=newsidelen;
        Exc_neg();
        Doedges();
    }
    public double Getsidelen(){
        return this.sidelen;
    }

    private void Exc_neg(){
        if (sidelen<=0){
            throw new IllegalArgumentException("Сторона квадрата не может быть отрицательной");
        }
    }
    private void Doedges(){
        Point rightup = new Point((int) (startpoint.x+sidelen),startpoint.y);
        Point rightdown = new Point((int) (startpoint.x+sidelen), (int) (startpoint.y-sidelen));
        Point leftdown = new Point(startpoint.x, (int) (startpoint.y-sidelen));
        Point leftupagain=startpoint;
        this.edges= new Point[] {startpoint,rightup,rightdown,leftdown,leftupagain};
    }

    @Override
    public double area() {
        return sidelen*sidelen;
    }

    @Override
    public Line PolygonalChainget() {
        return new Line(this.edges);
    }

    public String toString(){

        return "Квадрат в точках "+edges[0]+edges[1]+edges[2]+edges[3]+" со стороной "+sidelen+" и площадью "+area;
    }
}
