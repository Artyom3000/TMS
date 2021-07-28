package homework_6.Task03;

public class Main {

    public static void main(String[] args) {
        try {
            doSomething();
        } catch (RandomException e) {
            e.printStackTrace();
        }
        System.out.println("Программа продолжает работать.");
    }

    public static void doSomething() throws RandomException {
        System.out.println("Делаем какие-то действия и бросаем исключение.");
        throw new RandomException();
    }
}
