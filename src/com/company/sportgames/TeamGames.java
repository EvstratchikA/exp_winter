package com.company.sportgames;

public class TeamGames extends Games{
    private String name = "TeamGame";
    private int age = 25;
    private int person = 20;

    public TeamGames(){

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
