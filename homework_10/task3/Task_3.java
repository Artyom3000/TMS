package homework_10.task3;


import java.util.LinkedHashSet;
import java.util.Set;

public class Task_3 {
    public static void main(String[] args) {

        String string = "1, 2, 3, 4, 4, 5";

        char[] chars = string.toCharArray();
        Set<Character> charSet = new LinkedHashSet<Character>();
        for (char c : chars) {
            charSet.add(c);
        }

        StringBuilder sb = new StringBuilder();
        for (Character character : charSet) {
            sb.append(character);
        }
        System.out.println(sb.toString());
    }
}