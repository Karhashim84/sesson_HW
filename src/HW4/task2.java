package HW4;

import java.util.LinkedList;

//Реализуйте очередь с помощью LinkedList со следующими методами:
//        enqueue() - помещает элемент в конец очереди,
//        dequeue() - возвращает первый элемент из очереди и удаляет его,
//        first() - возвращает первый элемент из очереди, не удаляя.
public class task2 {
    public static void main(String[] args) {

        LinkedList<Integer> linkList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            linkList.add(getRandomNumber());
        }
        System.out.println("Начальная очередь");
        System.out.println(linkList);
        enqueue(linkList, 9);
        System.out.println("Очередь с добавленным элементом");
        System.out.println(linkList);
        System.out.println("Первый элемент в очереди для удаления");
        System.out.println(dequeue(linkList));
        System.out.println("Очередь с удаленным первым элементом");
        System.out.println(linkList);
        System.out.println("Первый элемент в очереди");
        System.out.println(first(linkList));
        System.out.println("Очередь без удаленного первого элемента");
        System.out.println(linkList);
    }
    public static void enqueue(LinkedList<Integer> list, int num) { //помещает элемент в конец очереди
        list.addLast(num);
    }
    public static int dequeue(LinkedList<Integer> list) { //возвращает первый элемент из очереди и удаляет его
        int num = 0;
        num = list.get(0);
        list.remove(0);
        return num;
    }
    public static int first(LinkedList<Integer> list) { //возвращает первый элемент из очереди, не удаляя
        int num = 0;
        num = list.get(0);
        return num;
    }
    public static int getRandomNumber() { // генератор случайных чисел
        return (int) (Math.random() * 20);
    }
}
