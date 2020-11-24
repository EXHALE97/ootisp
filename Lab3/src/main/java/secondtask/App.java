package secondtask;

public class App {
    public static void main(String[] args){
        RightTriangle first = new RightTriangle(6, 45);
        RightTriangle second = new RightTriangle(9, 60);

        ShowInfo(first);
        ShowInfo(second);
    }

    public static void ShowInfo(RightTriangle triangle){
        System.out.println("Triangle: side - " + triangle.getSide() + ", angle - " + triangle.getAngle());
        System.out.println("Second side - " + triangle.CountSecondSide());
        System.out.println("Hypotenuse - " + triangle.CountHypotenuse());
        System.out.println("Inradius - " + triangle.CountInRadius());
        System.out.println("Distance between inradius and outradius points - " + triangle.CountDistanceBetweenRadiusPoints());
        System.out.println("Square root of square - " + triangle.CountSqrtOfSquare());

        System.out.println("Triangle existing (Pythagoras theorem):");
        if(triangle.CheckExisting()){
            System.out.println("Triangle existing proved!\n\n");
        }else {
            System.out.println("Triangle does not exist!\n\n");
        }
    }
}
