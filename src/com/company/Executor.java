package com.company;

import com.company.human.*;
import com.company.sportgames.*;

public class Executor {
    public static void main(String[] args) {


        Games game1 = new Games() {
            @Override
            public void play() {

            }
        };
        System.out.println(game1.getName());

        TeamGames one = new TeamGames();
        System.out.println(one.getName());
        one.play();

        Tennis tennis = new Tennis();
        tennis.setName("Tennis");
        tennis.printInfo();


        System.out.println("=====");


        Games game2 = new Games() {
            @Override
            public void play() {

            }
        };
        System.out.println(game2.getName());

        SingleGames two = new SingleGames();
        System.out.println(two.getName());
        two.play();

        FigureSkating figureSkating = new FigureSkating();
        figureSkating.setName("FigureSkating");
        figureSkating.printInfo();


        System.out.println("======");



        Athlete athlete = new Athlete();
        System.out.println("Name: Alex");
        athlete.run();
        athlete.say();
        athlete.walk();

        Fanat fanat = new Fanat();
        System.out.println("Name: Tom");
        fanat.run();
        fanat.say();
        fanat.walk();

        Judge judge = new Judge();
        System.out.println("Name: Jack");
        judge.run();
        judge.say();
        judge.walk();

    }

}