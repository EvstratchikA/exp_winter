package com.company.sportgames;

public class Darts extends SingleGames implements IChampion{
    private String name = "Darts";
    private int age = 19;
    private int person = 1;

    public Darts() {

    }
    public Darts (String name){
        this.name = name;
    }

    public void setName(String nameValue) {
        this.name = nameValue;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(String ageValue) {
        this.name = ageValue;
    }

    public int getAge() {
        return this.age;
    }

    public void setPerson(String personValue) {
        this.name = personValue;
    }

    public int getPerson() {
        return this.person;

    }
    public void printInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Person: " + this.person);

    }

    @Override
    public void win() {
        System.out.println(this.name + "Win: No");
    }
    public void win(String success) {
        System.out.println(success);
    }

    @Override
    public void medal() {
        System.out.println(this.name + "Medal: -");
    }
    public void medal(String reward) {
        System.out.println(reward);
    }

    @Override
    public String printInfoChampion() {
        return "Champion";
    }
}
