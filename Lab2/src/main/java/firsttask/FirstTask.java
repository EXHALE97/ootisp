package firsttask;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Insert N: ");
        int n = in.nextInt();
        System.out.println("Insert array " + n +" values: ");
        int[] inputSequence = new int[n];
        int[] outputSequence = new int[n];

        for (int i = 0; i < n; i++){
            inputSequence[i] = in.nextInt();
        }

        in.close();

        System.out.print("Initial array: ");
        for (int j : inputSequence) {
            System.out.print(j + " ");
        }

        for (int k : inputSequence) {
            if (k % 2 == 0) {
                for (int j = 0; j < outputSequence.length; j++) {
                    if (outputSequence[j] == 0) {
                        outputSequence[j] = k;
                        break;
                    }
                }
            }
        }

        for (int k : inputSequence) {
            if (k % 2 == 1 || k == 1) {
                for (int j = 0; j < outputSequence.length; j++) {
                    if (outputSequence[j] == 0) {
                        outputSequence[j] = k;
                        break;
                    }
                }
            }
        }

        System.out.print("\nResult array: ");
        for (int j : outputSequence) {
            System.out.print(j + " ");
        }
    }
}
