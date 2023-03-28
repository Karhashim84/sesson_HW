package HW;
//n! (произведение чисел от 1 до n)
public class task_1_2 {
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        else {
            return n * factorial(n - 1);
        }
    }
}