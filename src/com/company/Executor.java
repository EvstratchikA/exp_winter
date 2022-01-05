package com.company;

import com.company.sportgames.*;
import com.company.stadium.Stadium;

public class Executor {
    public static void main(String[] args) {
        Basketball basketball1 = new Basketball("First");
        Basketball basketball2 = new Basketball("Second");
        Basketball basketball3 = new Basketball("Third");
        Stadium stadium1 = new Stadium();

        stadium1.setListBasketball(basketball1);
        stadium1.setListBasketball(basketball2);
        stadium1.setListBasketball(basketball3);

        for(Basketball basketball : stadium1.getListBasketball()){
            System.out.println(basketball.getName());
        }

       System.out.println("======");

        SingleGames darts1 = new Darts("FirstDartsGame");
        SingleGames darts4 = new Darts("FourthDartsGame");
        SingleGames figureSkating2 = new FigureSkating("SecondFigureSkatingGames");
        SingleGames figureSkating7 = new FigureSkating("SeventhFigureSkatingGames");
        SingleGames golf9= new Golf("NinthGolfGame");
        SingleGames golf5= new Golf("FifthGolfGame");

        stadium1.setListDarts(darts1);
        stadium1.setListDarts(darts4);
        stadium1.setListFigureSkating(figureSkating2);
        stadium1.setListFigureSkating(figureSkating7);
        stadium1.setListGolf(golf5);
        stadium1.setListGolf(golf9);
        stadium1.printListNameSingleGames();











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

    }



}