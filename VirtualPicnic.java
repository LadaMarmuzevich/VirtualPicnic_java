
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VirtualPicnic {
    public static void main(String[] args) {

        try {
            File file = new File("input.txt");
            Scanner scanner = new Scanner(file);

            int count_word = 0;
            String longestWord = "";
            Map<String, Integer> wordFrequency = new HashMap<>();
            
            while (scanner.hasNext()) {
                String word = scanner.next();
                count_word ++;

                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }

                wordFrequency.put(word, wordFrequency.getOrDefault(word, 0 ) + 1);
            }
            System.out.println("Количество слов в файле: " + count_word);
            System.out.println("Самое длинное слово: " + longestWord);

            System.out.println("Частота повторения слов: ");
            for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
            scanner.close();
            
        } catch (FileNotFoundException e ) {
            System.err.println("Файл не найден.");
        }
        
    }
}