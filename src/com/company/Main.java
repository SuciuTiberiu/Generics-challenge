package com.company;

public class Main {

    public static void main(String[] args) {
        FootballTeam steaua = new FootballTeam("Steaua");
        FootballTeam dinamo = new FootballTeam("Dinamo");
        FootballTeam cfr = new FootballTeam("CFR Cluj");
        FootballTeam astra = new FootballTeam("Astra");
        HandballTeam csmB = new HandballTeam("CSM Bucuresti");
        HandballTeam uCluj = new HandballTeam("U Cluj");

//        League<FootballTeam> steaua = new League<>("Steaua");
//        League<FootballTeam> dinamo = new League<>("Dinamo");
//        League<FootballTeam> cfr = new League<>("CFR Cluj");
//        League<FootballTeam> astra = new League<>("Astra");
//        League<HandballTeam> csmB = new League<>("CSM Bucuresti");
//        League<HandballTeam> uCluj = new League<>("U Cluj");

//        steaua.matchResult(dinamo,2,1);
//        steaua.matchResult(cfr,1,2);
//        steaua.matchResult(astra,3,0);
//        cfr.matchResult(dinamo,1,1);
//        cfr.matchResult(astra,0,0);
//        uCluj.matchResult(csmB,21,19);

//        System.out.println(steaua.getName()+": "+steaua.ranking());
//        System.out.println(cfr.getName()+": "+cfr.ranking());
//        System.out.println(astra.getName()+": "+astra.ranking());
//        System.out.println(dinamo.getName()+": "+dinamo.ranking());

        League<Team<FootballPlayer>> footballLeague = new League<>("AFL");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        Team<FootballPlayer> hawthron = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");
        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");

        footballLeague.addTeam(adelaideCrows);
        footballLeague.addTeam(melbourne);
        footballLeague.addTeam(hawthron);
        footballLeague.addTeam(fremantle);

        hawthron.matchReault(fremantle,1,0);
        hawthron.matchReault(adelaideCrows,3,8);

        adelaideCrows.matchReault(fremantle,2,1);

        footballLeague.showLeagueTable();
    }
}
