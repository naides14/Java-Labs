import java.util.Arrays;

public class Line_kwt2 { //для задачи 5
    public Point[] p_arr;

    public Line_kwt2(Point... points) {
        this.p_arr = points;
    }

    public void add(Point... newpoints) { //автоматически становится массивом запомни
        int ind=0;
        Point[] allpoints = Arrays.copyOf(p_arr,newpoints.length+p_arr.length);
        for (int i = p_arr.length; i < allpoints.length; i++) {
            allpoints[i] = newpoints[ind];
            ind++;
        }

        this.p_arr = allpoints;
    }
    public String toString(){
        return "Линия "+Arrays.toString(p_arr)+" Длина: "+p_arr.length;
    }
}
