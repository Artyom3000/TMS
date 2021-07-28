package homework_6;

import homework_6.Task04.RandomException;

public class Task05 {

    public static void main(String[] args) {
        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            try {
                RandomException randomException = new RandomException();
                randomException.initCause(e);
                throw randomException;
            } catch (RandomException exception) {
                exception.printStackTrace();
            }
        }
    }
}