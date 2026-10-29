package ru.suhanov.forshapes;
import java.util.Arrays;

public class Lineloop extends Line {

    public Lineloop(Point[] p_arr){
        Point[] looparr = new Point[p_arr.length+1];
        for (int i=0;i<p_arr.length;i++){
            looparr[i]=p_arr[i];
        }
        looparr[looparr.length-1]=looparr[0];
        this.p_arr=looparr;
    }

    @Override
    public String toString(){
        return "Замкнутая ломаная с углами в точках "+ Arrays.toString(p_arr)+", длина: "+getlen(p_arr);
    }

}
