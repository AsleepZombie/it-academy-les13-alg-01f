package src.by.academy.lesson12.task;

public class Task02 {

    public static void execute(double a, double b, int n) {
        double[][] array = new double[2][n];
        for (int i = 0; i < array[0].length; i++) {
            array[0][i] = (b - a) / (n - 1) * i + a;
            array[1][i] = Task01.execute(array[0][i]);
        }
        showPrettyTable(array);
    }

    private static void showPrettyTable(double[][] array) {
        System.out.println("________________________________");
        for (int i = 0; i < array[0].length; i++) {
            System.out.printf("|%3s|%10.2f|%15.6f|\n", i + 1, array[0][i],array[1][i]);
            System.out.println("|___|__________|_______________|");
        }
    }
}
