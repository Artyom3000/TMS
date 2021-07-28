package homework_6;

public class Task01 {

    public static void main(String[] args) {
        String s = null;
        try {
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("Значение строки - null.");
        }
    }
}