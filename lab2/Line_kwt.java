import java.util.Arrays;

public class Line_kwt { //для задачи 4
    private String constructor;
    public Point[] points;

    public Line_kwt() {
        this.constructor="empty";
    }
    public Line_kwt(Point...points) {
        this.points=points;
        this.constructor="manyset";
    }

    public String toString() {
        switch (constructor) {
            case ("manyset"):
                return "Линия "+Arrays.toString(points);
            case ("empty"):
                return "Линия (пустая) " + Arrays.toString(new Point[0]);
        }
        return null;
    }
}