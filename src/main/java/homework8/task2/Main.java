package homework8.task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
// В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать номер телефона по фамилии.
// Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.
//Желательно не добавлять лишний функционал (дополнительные поля (имя, отчество, адрес), взаимодействие с пользователем через консоль и т.д).
// Консоль использовать только для вывода результатов проверки телефонного справочника.
public class Main {
    public static void main(String[] args) {
        Map<String, Set<String>> phoneBookData = new HashMap<>();
        PhoneBook phoneBook1 = new PhoneBook(phoneBookData);
        phoneBook1.setPhoneBook("Jobsen", "888-1999-222");
        phoneBook1.setPhoneBook("Miele", "1223-2222-111");
        phoneBook1.setPhoneBook("Jobs","999-22222-11111");
        phoneBook1.setPhoneBook("Olive","0000-111-22-3");
        phoneBook1.setPhoneBook("Miles","124-56-565-99");
        System.out.println("Jobsen phone numbers" + phoneBook1.get("Jobsen"));
        System.out.println("Miele phone numbers" + phoneBook1.get("Miele"));
        System.out.println("Olive phone numbers" + phoneBook1.get("Olive"));
        System.out.println("Miles phone numbers" + phoneBook1.get("Miles"));
        System.out.println(" Jobsen phone numbers" + phoneBook1.get("Jobsen"));
    }
}
