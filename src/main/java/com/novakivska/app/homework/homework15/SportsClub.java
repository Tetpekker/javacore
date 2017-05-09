package com.novakivska.app.homework.homework15;

/**
 * Created by Tas_ka on 5/9/2017.
 */
public abstract class SportsClub {

    public String name;
    public String location;
    public int wins;
    public int draws;
    public int defeats;

    public SportsClub(String name, String location){
        this.name = name;
        this.location = location;

    }

    public SportsClub(int wins, int draws, int defeats){
        this.wins = wins;
        this.draws = draws;
        this.defeats = defeats;
    }

    public abstract void sportClub();

    public void showName(String name){
        System.out.println("Sport club: " + name);
    }
    public void showLocation(String location){
        System.out.println("Located at: " + location);
    }

    public void showStatistic(int wins, int draws, int defeats){
        int statistic = (wins + draws + defeats)/3;
        System.out.println(statistic);
    }

}
