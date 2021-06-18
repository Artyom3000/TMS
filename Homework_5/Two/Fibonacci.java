
//Решил с помощью рекурсии

package Homework_5.Two;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibNaive(10));
    }

    private static  long fibNaive(int n){
        if(n <= 1)
            return n;

        return fibNaive(n - 1) + fibNaive(n -2 );
    }
}