package com.company.human;

public class Fanat implements IHuman{
    public String name;

    public Fanat() {

    }
    public Fanat (String name){
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
        System.out.println("Slow");
    }

    @Override
    public void say() {
        System.out.println("Hello");
    }

    @Override
    public void run() {
        System.out.println("No");
    }
}
