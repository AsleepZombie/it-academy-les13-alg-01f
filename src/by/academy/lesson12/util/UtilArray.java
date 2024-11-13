package src.by.academy.lesson12.util;

import java.util.Random;

public class UtilArray {
    private static final Random random = new Random();

    public static void fill(int[] array) {
        fillRandom(array, 90, 10);
    }

    public static void fillLess(int[] array) {
        fillRandom(array, 9, 1);
    }

    public static void fillExact(int[] array, int min, int max) {
        fillRandom(array, max - min + 1,min);
    }

    public static void fillRandom(int[] array, int bound, int addition) {
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(bound) + addition;
        }
    }

    public static void print(int[] array) {
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void printPretty(int[] array) {
        for (int number : array) {
            System.out.printf("%2s ", number);
        }
        System.out.println();
    }

    public static void printPretty(double[] array) {
        for (double number : array) {
            System.out.printf("%.3f ", number);
        }
        System.out.println();
    }

    public static void print(boolean[] array) {
        for (boolean value : array) {
            if (value) {
                System.out.print("tr ");
            } else {
                System.out.print("fl ");
            }
        }
        System.out.println();
    }

    public static void fillAndPrint(int[] array) {
        fill(array);
        print(array);
    }
}
