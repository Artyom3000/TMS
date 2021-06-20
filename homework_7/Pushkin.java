package homework_7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

class Pushkin{

    public static void main(String args[]) throws IOException {
        Map< Character, Long > result = Files.lines(Path.of("C:\\Users\\aalle\\Desktop\\pushkin.txt" )).collect(Collectors.joining()).toLowerCase()
                .chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        result.entrySet().stream().sorted(Entry.comparingByKey())
                .forEach(e -> System.out.println(e.getKey() + " - " + e.getValue()));
    }
}
