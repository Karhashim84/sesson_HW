package HW4;

import java.util.LinkedList;

//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
public class task1 {
    public static void main(String[] args) {
        LinkedList<Integer> linkList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            linkList.add(getRandomNumber());
        }
        System.out.printf("Первоначальный: %s\n", linkList);
        for (int i = 0; i < 10; i++) {
            System.out.printf(linkList.getLast() + ", "); //чет не допер как перед перевернутым массивом добавить строку "Перевернутый",
            // получается на каждый элемент и новый с каждой строки
            linkList.removeLast();
        }
    }
    public static int getRandomNumber() {
        int x = (int) (Math.random() * 20);
        return x;
    }
}
