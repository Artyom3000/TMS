package homework_6;

public class Task02 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        try {
            for (int i = 0; i <= 10; i++) {
                array[i] += 1;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход на пределы массива.");
        }
    }


}