package ru.suhanov.shapetask;
import ru.suhanov.forshapes.Point;
import ru.suhanov.main.intochain;

public abstract class Shape implements intochain {
    public Point startpoint;
    public double sidelen;
    public double side2len;
    public double side3len;
    public Point[] edges;
    public double area;
    public abstract double area();

}
