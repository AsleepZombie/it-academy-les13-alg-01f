package src.by.academy.lesson12.task;

public class Task01 {

    public static double execute (double x) {
        double result;
        result = (Math.sqrt(Math.pow(Math.E,2.2 * x)));
        result -= Math.abs(Math.sin(Math.PI * x / (x + 2d/3)));
        result += 1.7;

        return  result;
    }
}
