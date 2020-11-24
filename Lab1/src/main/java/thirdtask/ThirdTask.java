package thirdtask;

import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Insert EPS: ");
        double eps = in.nextDouble();
        System.out.println("Insert X: ");
        double x = in.nextDouble();

        System.out.println("Values number (while): = " + countMaclaurinSeriesUsingWhile(x, eps));
        System.out.println("Values number (do - while): = " + countMaclaurinSeriesUsingDoWhile(x, eps));
    }

    public static int countMaclaurinSeriesUsingWhile(double x, double eps){
        int n = 1;

        while (x >= eps){
            n++;
            x = countElement(x,n);
        }

        return n;
    }

    public static int countMaclaurinSeriesUsingDoWhile(double x, double eps){
        int n = 1;

        do{
            n++;
            x = countElement(x,n);
        }while (x >= eps);

        return n;
    }

    public static double countElement(double x, double n){
        if(n%2 == 1 || n == 1){
            x = x-(Math.pow(x,n)/n);
        }else if(n%2 == 0){
            x = x+(Math.pow(x,n)/n);
        }

        return x;
    }
}
