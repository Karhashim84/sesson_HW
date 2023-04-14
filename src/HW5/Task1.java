package HW5;
//Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Task1 {
    public static Map<String, List<String>> phoneBook = new HashMap<>();
    public static void main(String[] args) {
        addPerson();
        Scanner sc = new Scanner(System.in);
        System.out.print("Имя: ");
        String str = sc.nextLine();
        sc.close();
        findPerson(str);
    }
    public static void addPerson() {
        phoneBook.put("Катя", List.of("+7(912)187-71-74", "+7(906)253-18-13", "+7(909)568-69-79"));
        phoneBook.put("Аня", List.of("+7(991)034-34-08", "+7(991)303-10-89"));
        phoneBook.put("Вадим",List.of("+7(912)418-46-50"));
        phoneBook.put("Миша",List.of("+7(909)127-67-37", "+7(908)642-05-81", "+7(909)297-32-96"));
        phoneBook.put("Вера",List.of("+7(906)049-33-56", "+7(909)567-14-12"));
    }
    public static void findPerson(String surname) {
        System.out.printf("%s: %s", surname, phoneBook.get(surname));
    }
}

