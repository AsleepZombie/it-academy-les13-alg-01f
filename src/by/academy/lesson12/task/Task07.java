package src.by.academy.lesson12.task;

import src.by.academy.lesson12.util.UtilArray;

public class Task07 {
    public static void execute(int n, int m) {
        double x = 1d;
        double hx = 0.1d;
        double z = 2d;
        double hz = -0.03d;
        int i;

        double[] xArray = new double[n];
        double[] zArray = new double[m];

        for (i = 0; i < n; i++) {
            xArray[i] = count(x,z);
            x+=hx;
        }
        for (i = 0; i < m; i++) {
            zArray[i] = count(x,z);
            z+=hz;
        }
        UtilArray.printPretty(xArray);
        UtilArray.printPretty(zArray);
    }

    private static double count(double x, double z) {
        double result;
        result = Math.sqrt(z * z + x * x) * Math.log10(z);
        result += Math.log10(z) / Math.sqrt(x * x - z * z + 3.2d);
        return result;
    }
}
