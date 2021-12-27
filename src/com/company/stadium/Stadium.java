package com.company.stadium;

import com.company.sportgames.IChampion;

public class Stadium {

    private IChampion champion;
    private String name;

    public Stadium() {

    }

    public Stadium(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setChampion(IChampion champion) {
        this.champion = champion;
    }

    public IChampion getChampion() {
        return this.champion;
    }


}
