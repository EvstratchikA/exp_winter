package com.company;

import com.company.sportgames.*;

public class Executor {
    public static void main(String [] args) {

        Games game1 = new Games();
        System.out.println(game1.getName());
        TeamGames one = new TeamGames();
        System.out.println(one.getAge() + " " + one.getPerson() + " " + one.getName());
        System.out.println();

        Tennis tennis = new Tennis();
        System.out.println(tennis.getAge() + " " + tennis.getPerson() + " " + tennis.getName());

        Basketball basketball = new Basketball();
        System.out.println(basketball.getAge() + " " + basketball.getPerson() + " " + basketball.getName());

        Hockey hockey = new Hockey();
        System.out.println(hockey.getAge() + " " + hockey.getPerson() + " " + hockey.getName());


        System.out.println("=====");

        Games game2 = new Games();
        System.out.println(game2.getName());
        SingleGames two = new SingleGames();
        System.out.println(two.getAge() + " "+ two.getPerson() + " " + two.getName());
        System.out.println();

        FigureSkating figureSkating = new FigureSkating();
        System.out.println(figureSkating.getAge() + " " + figureSkating.getPerson() + " " + figureSkating.getName());

        Darts darts = new Darts();
        System.out.println(darts.getAge() + " " + darts.getPerson() + " " + darts.getName());

        Golf golf = new Golf();
        System.out.println(golf.getAge() + " " + golf.getPerson() + " " + golf.getName());

    }
}
