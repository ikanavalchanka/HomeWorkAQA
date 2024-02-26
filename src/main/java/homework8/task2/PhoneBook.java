package homework8.task2;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Map;

public class PhoneBook {
    private Map<String, Set<String>> phoneBook;

    public PhoneBook(Map<String, Set<String>> phoneBook) {
        this.phoneBook = phoneBook;
    }

    public void setPhoneBook(String lastName, String phoneNumber) {
        phoneBook.computeIfAbsent(lastName, k -> new HashSet<>()).add(phoneNumber);
    }
    public Set<String> get(String lastName) {
        return phoneBook.getOrDefault(lastName, new HashSet<>());
    }

}
