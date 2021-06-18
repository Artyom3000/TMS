package Homework_5.One;

public class AmountDigits {
    private AmountDigits() {}

    public static int getAmountDigits(int number) {
        int result = 0;
        if (number < 10) {return number;}
        if (number == 10) {return 1; }
            for (int i = 0; number > 10; i++) {
                result += number % 10;
                number = number / 10;
            }
        return result;
    }
}

