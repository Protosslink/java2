import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Task6 {

    public void task() throws FileNotFoundException {

        Scanner scanner1 = new Scanner(new File("Text1"));
        Set<String> words = new TreeSet<>();
        while (scanner1.hasNext()) {
            String word = scanner1.useDelimiter("\\s+").next();
            words.add(word);
        }
        System.out.println(words);
        Scanner scanner = new Scanner(new File("Text1"));
        Map<String, Integer> statistics = new HashMap<>();
        while (scanner.hasNext()) {
            String word = scanner.useDelimiter("\\s+").next();
            Integer count = statistics.get(word);
            if (count == null) {
                count = 0;
            }
            statistics.put(word, ++count);
        }
        System.out.println(statistics);
//Collection<Integer> values = statistics.values();

        {
            Map.Entry<String, Integer> maxEntry = null;
            for (Map.Entry<String, Integer> entry : statistics.entrySet()) {
                if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
                    maxEntry = entry;
                }
            }
            System.out.println("Слово " + maxEntry.getKey() + " повторяется " + maxEntry.getValue() + " раз(а)");
        }
    }
}