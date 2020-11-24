package firsttask.models;

public class Line {
    private Coordinate firstPoint;
    private Coordinate secondPoint;

    public Line(Coordinate firstPoint, Coordinate secondPoint){
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
    }

    public Coordinate getFirstPoint() {
        return firstPoint;
    }

    public Coordinate getSecondPoint() {
        return secondPoint;
    }
}
