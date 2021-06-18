
//Решил с помощью цикла

package Homework_5.Two;

public class Fibonacci_2 {
    public static void main(String[] args) {
        System.out.println(fibEffective( 100));
    }
    private static long fibEffective(int n){
        long [] arr = new long[n + 1];

        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i < n; i++)
            arr[i] = arr[i - 1] + arr[i - 2];

        return  arr[n];
    }
}