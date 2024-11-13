package src.by.academy.lesson12.task;

public class Task03 {
    public static double execute(double x, int n) {
        double result = 0;
        for (int k = 1; k <= n; k++) {
            result += (Math.sin(k * x / 2) + Math.sin((k * x - 1) / 2)) / Math.pow(Math.E,(x - 1) / k);
        }
        result *= Math.sqrt(Math.PI * x);

        return result;
    }
}
