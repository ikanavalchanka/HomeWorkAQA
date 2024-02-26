package homework8.task1;
import java.util.HashMap;
import java.util.Map;
//Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
// Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем). Посчитать, сколько раз встречается каждое слово.
public class UniqueWords {
    public static void main(String[] args) {
        String[] wordsArray = {"apple", "banana", "orange", "apple", "grape", "banana", "kiwi", "orange", "apple", "pear", "grape", "kiwi", "banana"};
        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : wordsArray) {
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                wordCountMap.put(word, 1);
            }
        }

        System.out.println("Unique word and amount in the list:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
        }
    }
}