package com.company.sportgames;

public class Hockey extends TeamGames {
    private String name = "Hockey";
    private int age = 21;
    private int person = 17;

    public Hockey() {

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
}
