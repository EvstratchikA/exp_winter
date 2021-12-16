package com.company;

import com.company.sportgames.Games;
import com.company.sportgames.Single;
import com.company.sportgames.Team;

public class Executor {
    public static void main(String [] args) {

        Games football = new Games();
        System.out.println(football.getName());
        Team One = new Team();
        System.out.println(One.name + " " + One.age + " " + One.person);

        System.out.println();

        Games hockey = new Games();
        System.out.println(hockey.getName());
        Single Two = new Single();
        System.out.println(Two.name + " "+ Two.age + " " + Two.person);

    }

}
