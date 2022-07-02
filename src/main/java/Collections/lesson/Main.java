package Collections.lesson;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src/main/resources/file.txt");
        int length = fis.available();
        byte[] data = new byte[length];
        fis.read(data);

        String text = new String(data);

        List<String> words = new ArrayList<>();
        for (String s : text.split(" ")) {
            words.add(s.replaceAll("[^a-zA-Zа-яёА-ЯЁ]", "").toLowerCase());
        }

        // сортировка по алфавиту, вывод в консоль
        Collections.sort(words);
        System.out.println("Слова по алфавиту:\n" + words);

        // сколько раз каждое слово встречается в файле
        Map<String, Long> frequency = countDuplicates(words);
        System.out.println("Сколько раз каждое слово встречается в файле:\n" + frequency);

        // слово с максимальным количеством повторений
        Map.Entry<String, Long> maxEntry = null;
        for (Map.Entry<String, Long> entry : frequency.entrySet()) {
            if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
                maxEntry = entry;
            }
        }
        System.out.println("Слово с максимальным количеством повторений:\n" + maxEntry);
        fis.close();
    }

    public static Map<String, Long> countDuplicates(List<String> inputList) {
        return inputList.stream().collect(Collectors.toMap(Function.identity(), v -> 1L, Long::sum));
    }
}
