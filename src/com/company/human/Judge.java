package com.company.human;

public class Judge implements IHuman{
    public String name;

    public Judge() {

    }
    public Judge (String name){
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
        System.out.println("Stop!");
    }

    @Override
    public void run() {
        System.out.println("Yes");
    }
}
