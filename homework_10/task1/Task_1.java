package homework_10.task1;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task_1 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File file = new File("C:\\Users\\aalle\\Desktop\\inglish.txt");
        Set<String> strSet = new HashSet<>();
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        BufferedReader bufferReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        while ((line = bufferReader.readLine()) != null) {
            stringBuilder.append(line);
        }
        bufferReader.close();
        strSet.addAll(Arrays.asList(stringBuilder.toString().toLowerCase().split(" |, |. |\\.")));
        System.out.println(strSet);
    }
}

