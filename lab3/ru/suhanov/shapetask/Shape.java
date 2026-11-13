package ru.suhanov.shapetask;
import ru.suhanov.forshapes.Point;
import ru.suhanov.main.intochain;

public abstract class Shape implements intochain {
    public Point startpoint;
    public double sidelen;
    public double area;

    public abstract double area();

}
