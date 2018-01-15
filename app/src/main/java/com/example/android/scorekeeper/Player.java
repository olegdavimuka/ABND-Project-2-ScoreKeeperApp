package com.example.android.scorekeeper;

import android.widget.Button;

public class Player {

    private String team;
    private String name;
    private int Record_1_Count;
    private int Record_2_Count;
    private Button playerButton;
    private Button playerRecord_1_Button;
    private Button playerRecord_2_Button;

    public Player(String team, String name) {
        this.team = team;
        this.name = name;
    }

    public Player(String team, String name, int Record_1_Count, int Record_2_Count) {
        this.team = team;
        this.name = name;
        this.Record_1_Count = Record_1_Count;
        this.Record_2_Count = Record_2_Count;
    }

    public Player(String team, String name, int Record_1_Count, int Record_2_Count, Button playerButton,
                  Button playerRecord_1_Button, Button playerRecord_2_Button) {
        this.team = team;
        this.name = name;
        this.Record_1_Count = Record_1_Count;
        this.Record_2_Count = Record_2_Count;
        this.playerButton = playerButton;
        this.playerRecord_1_Button = playerRecord_1_Button;
        this.playerRecord_2_Button = playerRecord_2_Button;
    }

    public String getTeam() {
        return team;
    }

    public String getName() {
        return name;
    }

    public int getRecord_1_Count() {
        return Record_1_Count;
    }

    public int getRecord_2_Count() {
        return Record_2_Count;
    }

    public Button getPlayerButton() {
        return playerButton;
    }

    public Button getPlayerRecord_1_Button() {
        return playerRecord_1_Button;
    }

    public Button getPlayerRecord_2_Button() {
        return playerRecord_2_Button;
    }

    public void setRecord_1_Count(int record_1_Count) {
        this.Record_1_Count = record_1_Count;
    }

    public void setRecord_2_Count(int record_2_Count) {
        this.Record_2_Count = record_2_Count;
    }

    public void setPlayerButton(Button playerButton) {
        this.playerButton = playerButton;
    }

    public void setPlayerRecord_1_Button(Button playerRecord_1_Button) {
        this.playerRecord_1_Button = playerRecord_1_Button;
    }

    public void setPlayerRecord_2_Button(Button playerRecord_2_Button) {
        this.playerRecord_2_Button = playerRecord_2_Button;
    }
}
