package com.novakivska.app.homework.homework15;

/**
 * Created by Tas_ka on 5/9/2017.
 */
public class FootballClub extends SportsClub{

    //public int wins = 25;
    //public int draws = 10;
    //public int defeats = 5;
    //public int statistic = (wins + draws + defeats)/3;

    public FootballClub(int wins, int draws, int defeats){
        super(wins, draws, defeats);
    }

    public void sportClub(){
        System.out.println("The statistic of current football club: ");
        showStatistic(25, 10, 5);
    }

}
