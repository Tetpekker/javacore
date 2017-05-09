package com.novakivska.runners.homework15;

import com.novakivska.app.homework.homework15.FootballClub;
import com.novakivska.app.homework.homework15.SportsClub;

/**
 * Created by Tas_ka on 5/9/2017.
 */
public class SportsClubRunner {

    public static void main(String[] args){

        int wins = 25;
        int draws = 10;
        int defeats = 5;

        FootballClub footballClub = new FootballClub(wins, draws, defeats);
        footballClub.sportClub();

    }
}
