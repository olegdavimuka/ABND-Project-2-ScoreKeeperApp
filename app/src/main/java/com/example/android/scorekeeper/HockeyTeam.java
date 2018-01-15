package com.example.android.scorekeeper;

import android.widget.Button;

import java.util.ArrayList;

public class HockeyTeam {

    private String name;
    private ArrayList<Player> players;
    private int goalCount;
    private int penaltyCount;
    private int playerRemovalCount;
    private int bodyCheckCount;
    private int blockCount;
    private Button goalCountButton;
    private Button penaltyCountButton;
    private Button playerRemovalCountButton;
    private Button bodyCheckCountButton;
    private Button blockCountButton;

    public HockeyTeam(String name) {
        this.name = name;
    }

    public HockeyTeam(String name, ArrayList<Player> players) {
        this.name = name;
        this.players = players;
    }

    public HockeyTeam(String name, int goalCount, int penaltyCount, int playerRemovalCount,
                          int bodyCheckCount, int blockCount) {
        this.name = name;
        this.goalCount = goalCount;
        this.penaltyCount = penaltyCount;
        this.playerRemovalCount = playerRemovalCount;
        this.bodyCheckCount = bodyCheckCount;
        this.blockCount = blockCount;
    }

    public HockeyTeam(String name, int goalCount, int penaltyCount, int playerRemovalCount,
                      int bodyCheckCount, int blockCount, Button goalCountButton,
                      Button penaltyCountButton, Button playerRemovalCountButton,
                      Button bodyCheckCountButton, Button blockCountButton) {
        this.name = name;
        this.goalCount = goalCount;
        this.penaltyCount = penaltyCount;
        this.playerRemovalCount = playerRemovalCount;
        this.bodyCheckCount = bodyCheckCount;
        this.blockCount = blockCount;
        this.goalCountButton = goalCountButton;
        this.penaltyCountButton = penaltyCountButton;
        this.playerRemovalCountButton = playerRemovalCountButton;
        this.bodyCheckCountButton = bodyCheckCountButton;
        this.blockCountButton = blockCountButton;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public int getGoalCount() {
        return goalCount;
    }

    public int getPenaltyCount() {
        return penaltyCount;
    }

    public int getPlayerRemovalCount() {
        return playerRemovalCount;
    }

    public int getBodyCheckCount() {
        return bodyCheckCount;
    }

    public int getBlockCount() {
        return blockCount;
    }

    public Button getGoalCountButton() {
        return goalCountButton;
    }

    public Button getPenaltyCountButton() {
        return penaltyCountButton;
    }

    public Button getPlayerRemovalCountButton() {
        return playerRemovalCountButton;
    }

    public Button getBodyCheckCountButton() {
        return bodyCheckCountButton;
    }

    public Button getBlockCountButton() {
        return blockCountButton;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public void setGoalCount(int goalCount) {
        this.goalCount = goalCount;
    }

    public void setPenaltyCount(int penaltyCount) {
        this.penaltyCount = penaltyCount;
    }

    public void setPlayerRemovalCount(int playerRemovalCount) {
        this.playerRemovalCount = playerRemovalCount;
    }

    public void setBodyCheckCount(int bodyCheckCount) {
        this.bodyCheckCount = bodyCheckCount;
    }

    public void setBlockCount(int blockCount) {
        this.blockCount = blockCount;
    }

    public void setGoalCountButton(Button goalCountButton) {
        this.goalCountButton = goalCountButton;
    }

    public void setPenaltyCountButton(Button penaltyCountButton) {
        this.penaltyCountButton = penaltyCountButton;
    }

    public void setPlayerRemovalCountButton(Button playerRemovalCountButton) {
        this.playerRemovalCountButton = playerRemovalCountButton;
    }

    public void setBodyCheckCountButton(Button bodyCheckCountButton) {
        this.bodyCheckCountButton = bodyCheckCountButton;
    }

    public void setBlockCountButton(Button blockCountButton) {
        this.blockCountButton = blockCountButton;
    }
}
