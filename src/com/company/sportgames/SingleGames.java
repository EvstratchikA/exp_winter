package com.company.sportgames;

public class SingleGames extends Games {
    private String name = "SingleGame";
    private int age = 23;
    private int person = 1;

    public SingleGames(){

    }

    public SingleGames (String name){
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
    public void play() {
        System.out.println("Active");
    }
    public void play(String action){
        System.out.println(action);
    }
}
