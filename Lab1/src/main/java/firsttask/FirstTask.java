package firsttask;

import firsttask.controller.Operations;
import firsttask.models.Coordinate;
import firsttask.models.Line;
import firsttask.models.Triangle;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args){
        String[] lineValues;
        Scanner in = new Scanner(System.in);
        System.out.println("Insert line first point X and Y (using comma, ex. \"2,1\"): ");
        lineValues = in.nextLine().split(",");
        Coordinate lineFirst = new Coordinate(Double.parseDouble(lineValues[0]), Double.parseDouble(lineValues[1]));
        System.out.println("Insert line second point X and Y (using comma, ex. \"2,1\"): ");
        lineValues = in.nextLine().split(",");
        Coordinate lineSecond = new Coordinate(Double.parseDouble(lineValues[0]), Double.parseDouble(lineValues[1]));
        System.out.println("Insert triangle first top X and Y (using comma, ex. \"2,1\"): ");
        lineValues = in.nextLine().split(",");
        Coordinate triangleFirst = new Coordinate(Double.parseDouble(lineValues[0]), Double.parseDouble(lineValues[1]));
        System.out.println("Insert triangle second top X and Y (using comma, ex. \"2,1\"): ");
        lineValues = in.nextLine().split(",");
        Coordinate triangleSecond = new Coordinate(Double.parseDouble(lineValues[0]), Double.parseDouble(lineValues[1]));
        System.out.println("Insert triangle third top X and Y (using comma, ex. \"2,1\"): ");
        lineValues = in.nextLine().split(",");
        Coordinate triangleThird = new Coordinate(Double.parseDouble(lineValues[0]), Double.parseDouble(lineValues[1]));

        System.out.println("You line coordinates: ");
        System.out.println("1 - (" + lineFirst.getX() + ", " + lineFirst.getY() + ")");
        System.out.println("2 - (" + lineSecond.getX() + ", " + lineSecond.getY() + ")");
        System.out.println("You triangle coordinates: ");
        System.out.println("1 - (" + triangleFirst.getX() + ", " + triangleFirst.getY() + ")");
        System.out.println("2 - (" + triangleSecond.getX() + ", " + triangleSecond.getY() + ")");
        System.out.println("3 - (" + triangleThird.getX() + ", " + triangleThird.getY() + ")");

        Triangle triangle = new Triangle(triangleFirst, triangleSecond, triangleThird);
        Line line = new Line(lineFirst, lineSecond);

        if(Operations.isLinePlacedInTriangle(line, triangle)){
            System.out.println("Line is placed inside the triangle");
        }
        else{
            System.out.println("Line is NOT placed inside the triangle");
        }
    }
}
