package com.company;

import java.util.ArrayList;
import java.util.List;

public class Executor {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");

        for(String str : list){
            System.out.println(str);
        }

        System.out.println("======");

        list.remove(1);

        for(String str : list){
            System.out.println(str);
        }


//        Tennis tennis = new Tennis();
//        FigureSkating figureSkating = new FigureSkating();
//        Basketball basketball = new Basketball();
//        Darts darts = new Darts();
//        Golf golf = new Golf();
//        Hockey hockey = new Hockey();

//        Athlete athlete = new Athlete();
//        System.out.println("Name: Alex");
//        athlete.run();
//        athlete.say();
//        athlete.walk();

//        Fanat fanat = new Fanat();
//        System.out.println("Name: Tom");
//        fanat.run();
//        fanat.say();
//        fanat.walk();
//
//        Judge judge = new Judge();
//        System.out.println("Name: Jack");
//        judge.run();
//        judge.say();
//        judge.walk();

//        Stadium stadium = new Stadium();
//        System.out.println("Stadium: Dinamo");
//
//        stadium.setChampion(basketball);
//        basketball.medal();
//        basketball.win();
//        System.out.println(stadium.getChampion().printInfoChampion());
//
//        stadium.setChampion(figureSkating);
//        figureSkating.medal();
//        figureSkating.win();
//        System.out.println(stadium.getChampion().printInfoChampion());

//        stadium.setChampion(tennis);
//        stadium.setChampion(darts);
//        stadium.setChampion(golf);
//        stadium.setChampion(hockey);
    }



}