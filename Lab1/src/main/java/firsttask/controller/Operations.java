package firsttask.controller;

import firsttask.models.Coordinate;
import firsttask.models.Line;
import firsttask.models.Triangle;

public class Operations {
    public static boolean isLinePlacedInTriangle(Line line, Triangle triangle){
        return isPointPlacedInTriangle(line.getFirstPoint(), triangle)
                && isPointPlacedInTriangle(line.getSecondPoint(), triangle);
    }

    private static boolean isPointPlacedInTriangle(Coordinate point, Triangle triangle){
        Coordinate triangleFirstTop = triangle.getFirstTop();
        Coordinate triangleSecondTop = triangle.getSecondTop();
        Coordinate triangleThirdTop = triangle.getThirdTop();

        double x1 = triangleFirstTop.getX();
        double x2 = triangleSecondTop.getX();
        double x3 = triangleThirdTop.getX();

        double y1 = triangleFirstTop.getY();
        double y2 = triangleSecondTop.getY();
        double y3 = triangleThirdTop.getY();

        double x0 = point.getX();
        double y0 = point.getY();

        double firstScalar = (x1-x0)*(y2-y1)-(x2-x1)*(y1-y0);
        double secondScalar = (x2-x0)*(y3-y2)-(x3-x2)*(y2 - y0);
        double thirdScalar = (x3-x0)*(y1-y3)-(x1-x3)*(y3-y0);

        if(firstScalar <= 0 && secondScalar <= 0 && thirdScalar <= 0){
            return true;
        }
        else if(firstScalar > 0 && secondScalar > 0 && thirdScalar > 0){
            return true;
        }
        else return false;
    }
}
