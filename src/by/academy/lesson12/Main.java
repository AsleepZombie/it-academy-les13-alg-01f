package src.by.academy.lesson12;

import src.by.academy.lesson12.task.*;
import src.by.academy.lesson12.util.Splitter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x;
        double a;
        double b;
        int n;
        int m;
        char retry;

        do {
            System.out.print("Задача №1.\nx = ");
            x = scanner.nextDouble();
            System.out.println(Task01.execute(x));
            Splitter.split();

            System.out.print("Задача №2.\nВведите отрезок:\na = ");
            a = scanner.nextDouble();
            System.out.print("b = ");
            b = scanner.nextDouble();
            System.out.print("количество значений:");
            n = scanner.nextInt();
            Task02.execute(a, b, n);
            Splitter.split();

            System.out.print("Задача №3.\nx = ");
            x = scanner.nextDouble();
            System.out.print("n = ");
            n = scanner.nextInt();
            System.out.println(Task03.execute(x, n));
            Splitter.split();

            System.out.print("Задача №4.\nКоличество точек = ");
            n = scanner.nextInt();
            System.out.println("Точек внутри области - " + Task04.execute(n));
            Splitter.split();

            System.out.print("Задача №5.\nКоличество элементов = ");
            n = scanner.nextInt();
            Task05.execute(n);
            Splitter.split();

            System.out.print("Задача №6.\n");
            Task06.execute();
            Splitter.split();

            System.out.print("Задача №7.\nКоличество элементов n= ");
            n = scanner.nextInt();
            System.out.print("Количество элементов m= ");
            m = scanner.nextInt();
            Task07.execute(n, m);
            Splitter.split();

            System.out.print("Задача №8.\n");
            Task08.execute();
            Splitter.split();

            System.out.print("retry? y/n: ");
            retry = scanner.next().toLowerCase().charAt(0);

        } while (retry == 'y');
    }
}
