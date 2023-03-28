package HW;

import java.util.ArrayList;
import java.util.Scanner;

//Вывести все простые числа от 1 до 1000 простое число - то число которое делится без остатка только на 1
// и на само себя (1 - это не простое число);
public class task_1_3 {
    public static void simple() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите положительное число: ");
        int input = scanner.nextInt();
        scanner.close();
        ArrayList<Integer> simples = new ArrayList<>();

        for (int i = 2; i <= input; i++) {
            boolean isSimpleNumber = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isSimpleNumber = false;
                    break;
                }
            }
            if (isSimpleNumber) {
                simples.add(i);
            }
        }
        System.out.println("Простые числа: " + simples);
    }
}
