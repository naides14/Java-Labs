import java.util.Arrays;

public class Line { //для задачи 3
    public Point[] p_arr;

    public Line(Point[] p_arr){
        this.p_arr=p_arr;
    }
    public String toString(){
        return "Линия "+Arrays.toString(p_arr);
    }
}



