package homework_6;

public class Task06 {

    public static void main(String[] args) {
        try {
            getRandomException();
        } catch (IllegalArgumentException e) {
            System.out.println("Словили IllegalArgumentException");
        } catch (ArithmeticException e) {
            System.out.println("Словили ArithmeticException");
        } catch (UnsupportedOperationException e) {
            System.out.println("Словили UnsupportedOperationException");
        }
    }

    public static void getRandomException() {
        int i = 1 + (int) (Math.random() * 3);
        switch (i) {
            case 1:
                throw new IllegalArgumentException();
            case 2:
                throw new ArithmeticException();
            case 3:
                throw new UnsupportedOperationException();
        }
    }
}