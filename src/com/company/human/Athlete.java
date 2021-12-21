package com.company.human;

public class Athlete implements IHuman{
    public String name;

    public Athlete() {

    }
    public Athlete (String name){
        this.name = name;
    }

    public void setName(String nameValue) {
        this.name = nameValue;
    }
    public String getName() {
        return this.name;
    }


    @Override
    public void walk() {
        System.out.println("Fast");
    }

    @Override
    public void say() {
        System.out.println("Bye");
    }

    @Override
    public void run() {
        System.out.println("Yes");
    }

}
