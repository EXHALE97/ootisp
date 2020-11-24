package secondtask;

public class SecondTask {
    public static void main(String[] args){
        System.out.println("Number of excellent students: " + getCountExcellentStudents(getMatrix()));
    }

    public static int[][] getMatrix() {
        return new int[][]
                {
                        {7, 4, 2, 4, 9},
                        {6, 7, 6, 6, 8},
                        {10, 8, 9, 10, 10},
                        {2, 4, 6, 3, 1},
                        {6, 8, 7, 8, 8},
                        {6, 8, 6, 6, 8},
                        {9, 7, 9, 10, 8},
                        {8, 7, 8, 6, 7},
                        {7, 6, 6, 6, 6},
                        {6, 8, 7, 8, 7}
                };
    }

    public static int getCountExcellentStudents(int [][] recBook) {
        int retCnt = 0;
        boolean flagTrue;
        for (int [] row : recBook) {
            flagTrue = true;
            for (int mark : row)
                if (mark >= 8) {
                    flagTrue = false;
                    break;
                }
            if (flagTrue) retCnt++;
        }
        return retCnt;
    }
}
