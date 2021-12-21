package com.company.sportgames;

public abstract class Games {
    public String name = "AllGames";

    public abstract void play();

    public Games(){
    }

    public Games (String name){
        this.name = name;
    }

    public void setName(String nameValue) {
        this.name = nameValue;
    }

    public String getName() {
        return this.name;
    }

}
