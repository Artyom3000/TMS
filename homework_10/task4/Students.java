package homework_10.task4;

import java.util.ArrayList;

public class Students {
    public static void main (String[] args) {


        ArrayList<Integer> age = new ArrayList<Integer>();
        age.add(21);
        age.add(19);
        age.add(18);
        age.add(22);
        age.add(25);



        ArrayList<String> name = new ArrayList<String>();
        name.add("Никита");
        name.add("Максим");
        name.add("Кирилл");
        name.add("Даша");
        name.add("Саша");


        ArrayList<String> Last_name = new ArrayList<String>();
        Last_name.add("Федорович");
        Last_name.add("Лисовский");
        Last_name.add("Буйницкий");
        Last_name.add("Кулакович");
        Last_name.add("Алехнович");


        ArrayList<Double> averageScoreForTheYear = new ArrayList<Double>();
        averageScoreForTheYear.add(8.0);
        averageScoreForTheYear.add(7.8);
        averageScoreForTheYear.add(6.42);
        averageScoreForTheYear.add(5.6);
        averageScoreForTheYear.add(5.1);


        for(int i=1; i<5; i++) {
            System.out.println("\n" + "averageScoreForTheYear: " + age.get(i)+"\n"+"First name: " + name.get(i)+"\n"+"Last name: " + Last_name.get(i) +"\n"+"averageScoreForTheYear: " + averageScoreForTheYear.get(i));
            System.out.println();

        }
        Double min = averageScoreForTheYear.get(0);
        Double max = averageScoreForTheYear.get(0);
        for(int a=0; a<averageScoreForTheYear.size();a++) {
            double number = averageScoreForTheYear.get(a);
            if(number < min) min=number;
            if(number > max) max=number;

        }
        System.out.println("min = " + min );
        System.out.println("max = " + max);
    }
}