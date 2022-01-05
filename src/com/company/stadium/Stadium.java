package com.company.stadium;

import com.company.sportgames.*;

import java.util.ArrayList;
import java.util.List;

public class Stadium {

    private IChampion champion;
    private String name;

    private List<SingleGames> listSingleGames;
    private List<TeamGames> listTeamGames;

    private List<Basketball> listBasketball;
    private List<Darts> listDarts;
    private List<FigureSkating> listFigureSkating;
    private List<Golf> listGolf;
    private List<Hockey> listHockey;
    private List<Tennis> listTennis;




    public Stadium() {
        listSingleGames = new ArrayList<SingleGames>();
        listTeamGames = new ArrayList<TeamGames>();
        listBasketball = new ArrayList<Basketball>();
        listDarts = new ArrayList<Darts>();
        listFigureSkating = new ArrayList<FigureSkating>();
        listGolf = new ArrayList<Golf>();
        listHockey = new ArrayList<Hockey>();
        listTennis = new ArrayList<Tennis>();
    }

    public Stadium(String name) {
        this.name = name;

    }
    public void setListBasketball(Basketball basketball){
        this.listBasketball.add(basketball);
    }
    public List<Basketball> getListBasketball(){
        return this.listBasketball;
    }

    public void setListDarts(Darts darts){
        this.listDarts.add(darts);
    }
    public List<Darts> getListDarts(){
        return this.listDarts;
    }

    public void setListFigureSkating(FigureSkating figureSkating){
        this.listFigureSkating.add(figureSkating);
    }
    public List<FigureSkating> getListFigureSkating(){
        return this.listFigureSkating;
    }

    public void setListGolf(Golf golf){
        this.listGolf.add(golf);
    }
    public List<Golf> getListGolf(){
        return this.listGolf;
    }

    public void setListHockey(Hockey hockey){
        this.listHockey.add(hockey);
    }
    public List<Hockey> getListHockey(){
        return this.listHockey;
    }

    public void setListTennis(Tennis tennis){
        this.listTennis.add(tennis);
    }
    public List<Tennis> getListTennis(){
        return this.listTennis;
    }

    public void setListSingleGames(SingleGames singleGames){
        this.listSingleGames.add(singleGames);
    }
    public List<SingleGames> getListSingleGames(){
        return this.listSingleGames;
    }

    public void setListTeamGames(TeamGames teamGames){
        this.listTeamGames.add(teamGames);
    }
    public List<TeamGames> getListTeamGames(){
        return this.listTeamGames;
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



    public void printListNameSingleGames(){
        for(SingleGames singleGames : this.getListSingleGames()){
            System.out.println(singleGames.getName());
        }
    }
    public void printListNameTeamGames(){
        for(TeamGames teamGames : this.getListTeamGames()){
            System.out.println(teamGames.getName());
        }
    }




}
