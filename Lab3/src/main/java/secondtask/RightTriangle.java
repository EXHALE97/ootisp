package secondtask;

public class RightTriangle {
    private double side;
    private int angle;

    public RightTriangle(){ }

    public RightTriangle(double side, int angle){
        this.side = side;
        this.angle = angle;
    }

    public void ReduceTriangle(int percent){
        this.side = this.side * (double)((100 - percent)/100);
    }

    public void IncreaseTriangle(int percent){
        this.side = this.side * (double)((100 + percent)/100);
    }

    public double CountInRadius(){
        double secondSide = CountSecondSide();
        double hypotenuse = CountHypotenuse();
        double halfPerimeter = 0.5 * (this.side + secondSide + hypotenuse);

        return Math.sqrt(((halfPerimeter - this.side) * (halfPerimeter - secondSide) * (halfPerimeter - hypotenuse))/halfPerimeter);
    }

    public double CountDistanceBetweenRadiusPoints(){
        double outRadius = (this.side/Math.cos(Math.toRadians(this.angle)))/2;

        return Math.sqrt(Math.pow(outRadius, 2) - 2 * outRadius * CountInRadius());
    }

    public double CountSqrtOfSquare(){
        return Math.sqrt(0.5 * this.side * CountSecondSide());
    }

    public double CountSecondSide(){
        return this.side * Math.tan(Math.toRadians(this.angle));
    }

    public double CountHypotenuse(){
        return this.side/Math.cos(Math.toRadians(this.angle));
    }

    public boolean CheckExisting(){
        return Math.sqrt(Math.pow(this.side, 2) + Math.pow(CountSecondSide(),2)) == CountHypotenuse();
    }

    public double getSide() {
        return side;
    }

    public int getAngle() {
        return angle;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
