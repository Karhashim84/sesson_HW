package HW;

import java.util.Scanner;

//Реализовать простой калькулятор
public class task_1_4 {
    static int scanNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    static String scanOperations() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    static int getResult(String operation, int firstNumber, int secondNumber) {
        int result = 0;
        switch (operation) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                result = firstNumber / secondNumber;
            default:
                System.out.println("Введите оператор: -, +, *, /");
                break;
        }
        return result;
    }
    public static void calc() {
        System.out.println("Введите первое число: ");
        int firstNumber = scanNumber();
        System.out.println("Введите оператор: -, +, *, /");
        String operations = scanOperations();
        System.out.println("Введите второе число: ");
        int secondNumber = scanNumber();
        int result = getResult(operations, firstNumber, secondNumber);
        System.out.printf("%d %s %d = %d", firstNumber, operations, secondNumber, result);

    }
}