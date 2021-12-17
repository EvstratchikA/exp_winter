package com.company;

import com.company.sportgames.Games;
import com.company.sportgames.SingleGames;
import com.company.sportgames.TeamGames;

public class Executor {
    public static void main(String [] args) {

        Games football = new Games();
        System.out.println(football.getName());
        TeamGames One = new TeamGames();
        System.out.println(One.name + " " + One.age + " " + One.person);

        System.out.println();

        Games hockey = new Games();
        System.out.println(hockey.getName());
        SingleGames Two = new SingleGames();
        System.out.println(Two.name + " "+ Two.age + " " + Two.person);

    }
}
