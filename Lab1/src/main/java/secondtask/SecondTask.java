package secondtask;

import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Insert N: ");
        int n = in.nextInt();

        double leftSide = countLeftSide(n);
        double rightSide = countRightSide(n);

        System.out.println("Left side value = " + leftSide);
        System.out.println("Right side value = " + rightSide);

        if(leftSide == rightSide){
            System.out.println("Formula is true!");
        }else{
            System.out.println("Formula is false!");
        }
    }

    public static double countLeftSide(int n){
        double leftSide = 0;

        for(int i = 1; i<=n; i++){
            leftSide = leftSide + (Math.pow(i,3));
        }

        return leftSide;
    }

    public static double countRightSide(int n){
        return Math.pow(n*(n+1),2)/4;
    }
}
