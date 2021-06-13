package Homework_4.two;

public class Transformation {
    private static int result = 0;
    static int[] arabic = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    static String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public static String transformation(String romanDigit) {
        if (romanDigit.contains("M || m")){
            System.out.println(1000);
         } else if (romanDigit.contains("CM || cm")) {
            System.out.println(900);
         } else if (romanDigit.contains("D || d")) {
            System.out.println(500);
         } else if (romanDigit.contains("CD || cd")) {
            System.out.println(400);
         } else if (romanDigit.contains("C || c")) {
            System.out.println(100);
         } else if (romanDigit.contains("XC || xc")){
            System.out.println(90);
         } else if (romanDigit.contains("L || l")) {
            System.out.println(50);
         } else if (romanDigit.contains("XL || xl")){
            System.out.println(40);
         } else if (romanDigit.contains("X || x")) {
            System.out.println(10);
         } else if (romanDigit.contains("IX || ix")){
            System.out.println(9);
         } else if (romanDigit.contains("V || v")) {
            System.out.println(5);
         } else if (romanDigit.contains("IV || iv")){
            System.out.println(4);
         } else if (romanDigit.contains("I || i")) {
            System.out.println(1);
         }

        for (int i = 0; i < roman.length; i++) {
            while (romanDigit.toUpperCase().startsWith(roman[i])) {
                result += arabic[i];
                romanDigit = romanDigit.substring(roman[i].length());
            }
        }
        return String.valueOf(result);
    }
}

