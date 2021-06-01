package Homeworks;

public class Task3 {

    public static void main(String[] args) {

        int barrel = 70;
        int bucket = 5;
        int watering_cans = 4;
        int liters_in_buckets = 10;

        System.out.println(liters_in_buckets * bucket + "л" + "-суммарные литры всех вёдер");

        int liters_of_all_buckets = liters_in_buckets * bucket;

        System.out.println(barrel - liters_of_all_buckets +"л" + "-остаток воды в бочке");

        int remaining_water = barrel - liters_of_all_buckets;

        System.out.println(remaining_water / watering_cans + "л" + "-количество воды в каждой лейке");



    }
}
