package com.example.android.scorekeeper;

import android.widget.Button;

import java.util.ArrayList;

public class FootballTeam {

    private String name;
    private ArrayList<Player> players;
    private int goalsCount;
    private int foulsCount;
    private int yellowCardsCount;
    private int redCardsCount;
    private int offsidesCount;
    private int cornerKicksCount;
    private int savesCount;
    private Button goalsCountButton;
    private Button foulsCountButton;
    private Button yellowCardsCountButton;
    private Button redCardsCountButton;
    private Button offsidesCountButton;
    private Button cornerKicksCountButton;
    private Button savesCountButton;

    public FootballTeam(String name) {
        this.name = name;
    }

    public FootballTeam(String name, ArrayList<Player> players) {
        this.name = name;
        this.players = players;
    }

    public FootballTeam(String name, int goalsCount, int foulsCount, int yellowCardsCount,
                             int redCardsCount, int offsidesCount, int cornerKicksCount, int savesCount) {
        this.name = name;
        this.goalsCount = goalsCount;
        this.foulsCount = foulsCount;
        this.yellowCardsCount = yellowCardsCount;
        this.redCardsCount = redCardsCount;
        this.offsidesCount = offsidesCount;
        this.cornerKicksCount = cornerKicksCount;
        this.savesCount = savesCount;
    }

    public FootballTeam(String name, int goalsCount, int foulsCount, int yellowCardsCount,
                        int redCardsCount, int offsidesCount, int cornerKicksCount, int savesCount,
                        Button goalsCountButton, Button foulsCountButton, Button yellowCardsCountButton,
                        Button redCardsCountButton, Button offsidesCountButton, Button cornerKicksCountButton,
                        Button savesCountButton) {
        this.name = name;
        this.goalsCount = goalsCount;
        this.foulsCount = foulsCount;
        this.yellowCardsCount = yellowCardsCount;
        this.redCardsCount = redCardsCount;
        this.offsidesCount = offsidesCount;
        this.cornerKicksCount = cornerKicksCount;
        this.savesCount = savesCount;
        this.goalsCountButton = goalsCountButton;
        this.foulsCountButton = foulsCountButton;
        this.yellowCardsCountButton = yellowCardsCountButton;
        this.redCardsCountButton = redCardsCountButton;
        this.offsidesCountButton = offsidesCountButton;
        this.cornerKicksCountButton = cornerKicksCountButton;
        this.savesCountButton = savesCountButton;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public int getGoalsCount() {
        return goalsCount;
    }

    public int getFoulsCount() {
        return foulsCount;
    }

    public int getYellowCardsCount() {
        return yellowCardsCount;
    }

    public int getRedCardsCount() {
        return redCardsCount;
    }

    public int getOffsidesCount() {
        return offsidesCount;
    }

    public int getCornerKicksCount() {
        return cornerKicksCount;
    }

    public int getSavesCount() {
        return savesCount;
    }

    public Button getGoalsCountButton() {
        return goalsCountButton;
    }

    public Button getFoulsCountButton() {
        return foulsCountButton;
    }

    public Button getYellowCardsCountButton() {
        return yellowCardsCountButton;
    }

    public Button getRedCardsCountButton() {
        return redCardsCountButton;
    }

    public Button getOffsidesCountButton() {
        return offsidesCountButton;
    }

    public Button getCornerKicksCountButton() {
        return cornerKicksCountButton;
    }

    public Button getSavesCountButton() {
        return savesCountButton;
    }

    public void setGoalsCount(int goalsCount) {
        this.goalsCount = goalsCount;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public void setFoulsCount(int foulsCount) {
        this.foulsCount = foulsCount;
    }

    public void setYellowCardsCount(int yellowCardsCount) {
        this.yellowCardsCount = yellowCardsCount;
    }

    public void setRedCardsCount(int redCardsCount) {
        this.redCardsCount = redCardsCount;
    }

    public void setOffsidesCount(int offsidesCount) {
        this.offsidesCount = offsidesCount;
    }

    public void setCornerKicksCount(int cornerKicksCount) {
        this.cornerKicksCount = cornerKicksCount;
    }

    public void setSavesCount(int savesCount) {
        this.savesCount = savesCount;
    }

    public void setGoalsCountButton(Button goalsCountButton) {
        this.goalsCountButton = goalsCountButton;
    }

    public void setFoulsCountButton(Button foulsCountButton) {
        this.foulsCountButton = foulsCountButton;
    }

    public void setYellowCardsCountButton(Button yellowCardsCountButton) {
        this.yellowCardsCountButton = yellowCardsCountButton;
    }

    public void setRedCardsCountButton(Button redCardsCountButton) {
        this.redCardsCountButton = redCardsCountButton;
    }

    public void setOffsidesCountButton(Button offsidesCountButton) {
        this.offsidesCountButton = offsidesCountButton;
    }

    public void setCornerKicksCountButton(Button cornerKicksCountButton) {
        this.cornerKicksCountButton = cornerKicksCountButton;
    }

    public void setSavesCountButton(Button savesCountButton) {
        this.savesCountButton = savesCountButton;
    }
}
