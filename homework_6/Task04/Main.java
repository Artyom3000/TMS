package homework_6.Task04;

public class Main {

    public static void main(String[] args) {
        try {
            doSomething();
        } catch (RandomException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Программа продолжает работать.");
    }

    public static void doSomething() throws RandomException {
        System.out.println("Делаем какие-то действия и бросаем исключение.");
        throw new RandomException("Что-то пошло не так!");
    }
}

