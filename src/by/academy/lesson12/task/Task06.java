package src.by.academy.lesson12.task;

public class Task06 {
    public static void execute() {
        int a = 3000;
        int b = 60000;
        int m = 4;
        execute(a, b, m);
    };

    public static void execute(int a, int b, int m) {
        int count = 0;
        double t1;
        double t2;
        double t3;
        double t4;
        int y;

        t1 = Math.sqrt(a + b + m);
        t2 = Math.sqrt(a + b) * m;
        t3 = Math.sqrt(a * b * m);
        t4 = Math.sqrt(a * b) * m;
        System.out.println();
        for (int k = -30; k < 60; k++) {
            y = (int) (Math.pow(k, 3) - 25 * k * k + 50 * k + 1000);
            if ((t1 < t2? y > t1 & y < t2: y > t2 & y < t1) ||
                (t3 < t4? y > t3 & y < t4: y > t4 & y < t3)) {
                System.out.printf("y = %s\n",y);
                if (count++ == 20){
                    break;
                }
            }
        }
    }
}
