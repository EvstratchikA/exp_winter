package com.company.sportgames;

public class Basketball extends TeamGames{
    private String name = "Basketball";
    private int age = 19;
    private int person = 15;

    public Basketball() {

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
