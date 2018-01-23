package com.example.android.scorekeeper;

import android.widget.Button;

import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Player> players;
    private int statistic_1_count;
    private int statistic_2_count;
    private int statistic_3_count;
    private Button statistic_1_Button;
    private Button statistic_2_Button;
    private Button statistic_3_Button;

    public Team() {

    }

    public Team(String name) {
        this.name = name;
    }

    public Team(String name, ArrayList<Player> players) {
        this.name = name;
        this.players = players;
    }

    public Team(String name, int statistic_1_count, int statistic_2_count, int statistic_3_count) {
        this.name = name;
        this.statistic_1_count = statistic_1_count;
        this.statistic_2_count = statistic_2_count;
        this.statistic_3_count = statistic_3_count;
    }

    public Team(String name, int statistic_1_count, int statistic_2_count, int statistic_3_count,
                Button statistic_1_Button, Button statistic_2_Button, Button statistic_3_Button) {
        this.name = name;
        this.statistic_1_count = statistic_1_count;
        this.statistic_2_count = statistic_2_count;
        this.statistic_3_count = statistic_3_count;
        this.statistic_1_Button = statistic_1_Button;
        this.statistic_2_Button = statistic_2_Button;
        this.statistic_3_Button = statistic_3_Button;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public int getStatistic_1_count() {
        return statistic_1_count;
    }

    public int getStatistic_2_count() {
        return statistic_2_count;
    }

    public int getStatistic_3_count() {
        return statistic_3_count;
    }

    public Button getStatistic_1_Button() {
        return statistic_1_Button;
    }

    public Button getStatistic_2_Button() {
        return statistic_2_Button;
    }

    public Button getStatistic_3_Button() {
        return statistic_3_Button;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public void setStatistic_1_count(int statistic_1_count) {
        this.statistic_1_count = statistic_1_count;
    }

    public void setStatistic_2_count(int statistic_2_count) {
        this.statistic_2_count = statistic_2_count;
    }

    public void setStatistic_3_count(int statistic_3_count) {
        this.statistic_3_count = statistic_3_count;
    }

    public void setStatistic_1_Button(Button statistic_1_Button) {
        this.statistic_1_Button = statistic_1_Button;
    }

    public void setStatistic_2_Button(Button statistic_2_Button) {
        this.statistic_2_Button = statistic_2_Button;
    }

    public void setStatistic_3_Button(Button statistic_3_Button) {
        this.statistic_3_Button = statistic_3_Button;
    }
}
