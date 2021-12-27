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
        System.out.println("Walk: Fast");
    }
    public void walk(String speed) {
        System.out.println(speed);
    }

    @Override
    public void say() {
        System.out.println("Say: Bye");
    }
    public void say(String voice) {
        System.out.println(voice);
    }

    @Override
    public void run() {
        System.out.println("Run: Yes");
    }
    public void run(String distance) {
        System.out.println(distance);
    }

}
