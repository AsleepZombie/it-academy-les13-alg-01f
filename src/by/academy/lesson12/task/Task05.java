package src.by.academy.lesson12.task;

public class Task05 {
    public static void execute(int n) {
        execute(1, n);
    }
    public static void execute(double a, int n) {
        double result;
        double x;
        double dx;
        x = -2 * a;
        dx = a / 5;

        for (int i = 0; i < n; i++) {
            result = x > 0?
                    4 * Math.pow(a, 3) / (x * x + 4 * a * a):
                    a / 2 * (Math.pow(Math.E, x / a) + Math.pow(Math.E, -x / a) );
            System.out.printf("x=%.1f y=%.3f\n",x ,result);
            x += dx;
        }
    }

}
