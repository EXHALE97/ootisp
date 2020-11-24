package firsttask.models;

public class Triangle {
    private Coordinate firstTop;
    private Coordinate secondTop;
    private Coordinate thirdTop;

    public Triangle(Coordinate firstTop, Coordinate secondTop, Coordinate thirdTop){
        this.firstTop = firstTop;
        this.secondTop = secondTop;
        this.thirdTop = thirdTop;
    }

    public Coordinate getFirstTop() {
        return firstTop;
    }

    public Coordinate getSecondTop() {
        return secondTop;
    }

    public Coordinate getThirdTop() {
        return thirdTop;
    }

    public void setFirstTop(Coordinate firstTop) {
        this.firstTop = firstTop;
    }

    public void setSecondTop(Coordinate secondTop) {
        this.secondTop = secondTop;
    }

    public void setThirdTop(Coordinate thirdTop) {
        this.thirdTop = thirdTop;
    }
}
