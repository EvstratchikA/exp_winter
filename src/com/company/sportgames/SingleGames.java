package com.company.sportgames;

public class SingleGames extends Games {
    private String name = "SingleGame";
    private int age = 23;
    private int person = 1;

    public SingleGames(){

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
