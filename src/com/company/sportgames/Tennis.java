package com.company.sportgames;

public class Tennis extends TeamGames{
    private String name = "Tennis";
    private int age = 20;
    private int person = 2;

    public Tennis() {

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
