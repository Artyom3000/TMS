package homework_6;

public class Task07 {

    public static void main(String[] args) {
        try {
            getException();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Эта фраза печатается всегда.");
        }
    }

    public static void getException() {
        int i = (int) (Math.random() * 2);
        if (i == 0) {
            throw new NullPointerException();
        }
    }
}