package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class League<T extends Team> {

    private String name;
    private  ArrayList<T> league = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public boolean addTeam(T team) {
        if (league.contains(team)) {
            System.out.println("Team " + team.getName() + " already added");
            return false;
        } else {
            league.add(team);
            //System.out.println(team.getName() + "added to these league " + this.league);
            return true;
        }
    }

    public void showLeagueTable(){
        Collections.sort(league);
        for(T t: league){
            System.out.println(t.getName()+": "+t.ranking());
        }
    }

//    public void matchResult(League<T> opponent, int ourScore, int theirScore) {
//        String message;
//        if (ourScore > theirScore) {
//            won++;
//            message = " beat ";
//        } else if (ourScore == theirScore) {
//            tied++;
//            message = " draw with ";
//        } else {
//            lost++;
//            message = " lost to ";
//        }
//        played++;
//        if (opponent != null) {
//            System.out.println(this.getName() + message + opponent.getName());
//            opponent.matchResult(null, theirScore, ourScore);
//        }
//    }
//
//    public int ranking() {
//        return (won * 3) + tied;
//    }
//
//    @Override
//    public int compareTo(League<T> team) {
//        if (this.ranking() > team.ranking()) {
//            return -1;
//        } else if (this.ranking() < team.ranking()) {
//            return 1;
//        } else {
//            return 0;
//        }
//    }

//    public void printLeagueTeams (League root){
//        if (root == null){
//            System.out.println("League empty");
//        } else {
//            while (root!=null){
//                System.out.println(root.ranking());
//                root=root.
//            }
//        }
//    }
}
