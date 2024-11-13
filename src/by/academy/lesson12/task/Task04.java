package src.by.academy.lesson12.task;

import src.by.academy.lesson12.util.UtilArray;

public class Task04 {
    public static int execute(int n) {
        int result = 0;
        int[][] array = new int[2][n];
        //boolean[] res = new boolean[n];
        fillArray(array, -4, 4);
        printArray(array);

        for (int i = 0; i < array[0].length; i++) {
            if (isInside(array[0][i], array[1][i])) {
                result++;
                //res[i] = true;
            }
        }
        //UtilArray.print(res);
        return result;
    }
    private static void fillArray(int[][] array, int min, int max) {
        for (int[] subArray : array) {
            UtilArray.fillExact(subArray, min, max);
        }
    }
    private static void printArray(int[][] array) {
        for (int[] subArray : array) {
            UtilArray.printPretty(subArray);
        }
    }
    private static boolean isInside(int x, int y) {
        if (x < -2 | x > 2 | y < -1 | y > 2) {
            return false;
        } else if ((x > 0 & y > 1) || (x < 0 & y < 0)){
            return false;
        }
        return true;
    }
}
