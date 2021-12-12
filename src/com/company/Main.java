package com.company;

public class Main {

    public static void main(String[] args) {
//        Задача 1
//        for(int i = 0; i<=10000; i++) {
//            if(i % 7 == 0 & (i !=0)) {
//                System.out.println(i);
//            }
//        }

//        Задача 2
        int counter = 0;
        int sum = 0;

        for(int i = 0; i<=200; i++) {
            if(i % 10 == 0 & (i !=0)) {
                counter+= 1;
                sum+= i;
            }
        }

        System.out.println("Среднее арифметическое: " + sum/counter);
    }
}
