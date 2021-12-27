package com.company.human;

public class Fanat implements IHuman {
    public String name;

    public Fanat() {

    }

    public Fanat(String name) {
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
        System.out.println("Walk: Slow");
    }

    public void walk(String speed) {
        System.out.println(speed);
    }

    @Override
    public void say() {
        System.out.println("Say: Hello");
    }

    public void say(String voice) {
        System.out.println(voice);
    }

    @Override
    public void run() {
        System.out.println("Run: No");
    }

    public void run(String distance) {
        System.out.println(distance);
    }
}
