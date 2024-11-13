package src.by.academy.lesson12.task;

public class Task08 {
    public static void execute(){
        double x = 0.1d;
        double yOld = 0;
        double yNew = 0;

        do {
            if (yOld == 0){
                yOld = x * x - Math.pow(Math.E, 2 * x) + 4;
            }else {
                yOld = yNew;
            }
            x+= 0.1d;
            yNew = x * x - Math.pow(Math.E, 2 * x) + 4;
        }while (((yOld < 0 & yNew < 0) || (yOld > 0 & yNew > 0)) && x<=10);
        System.out.printf("нуль функции пройден при x = %.1f\n", x);
    }
}
