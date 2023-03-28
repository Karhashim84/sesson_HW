package HW;

import java.util.Scanner;
//Вычислить n-ое треугольного число (сумма чисел от 1 до n)
public class task_1_1 {

    public static void triangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int i = scanner.nextInt();
        System.out.printf("Треугольное число: %d\n", giveMeNumber(i));
        scanner.close();
    }
    public static int giveMeNumber(int n) {
        return (n * (n + 1)) / 2;
    }
}