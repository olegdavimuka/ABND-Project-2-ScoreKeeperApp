package com.example.android.scorekeeper;

import android.widget.Button;

import java.util.ArrayList;

public class VolleyballTeam {

    private String name;
    private ArrayList<Player> players;
    private int pointCount;
    private int ballFeedCount;
    private int ballReceptionCount;
    private int attackCount;
    private int blockCount;
    private Button pointCountButton;
    private Button ballFeedCountButton;
    private Button ballReceptionCountButton;
    private Button attackCountButton;
    private Button blockCountButton;

    public VolleyballTeam(String name) {
        this.name = name;
    }

    public VolleyballTeam(String name, ArrayList<Player> players) {
        this.name = name;
        this.players = players;
    }

    public VolleyballTeam(String name, int pointCount, int ballFeedCount, int ballReceptionCount,
                          int attackCount, int blockCount) {
        this.name = name;
        this.pointCount = pointCount;
        this.ballFeedCount = ballFeedCount;
        this.ballReceptionCount = ballReceptionCount;
        this.attackCount = attackCount;
        this.blockCount = blockCount;
    }

    public VolleyballTeam(String name, int pointCount, int ballFeedCount, int ballReceptionCount,
                          int attackCount, int blockCount, Button pointCountButton,
                          Button ballFeedCountButton, Button ballReceptionCountButton,
                          Button attackCountButton, Button blockCountButton) {
        this.name = name;
        this.pointCount = pointCount;
        this.ballFeedCount = ballFeedCount;
        this.ballReceptionCount = ballReceptionCount;
        this.attackCount = attackCount;
        this.blockCount = blockCount;
        this.pointCountButton = pointCountButton;
        this.ballFeedCountButton = ballFeedCountButton;
        this.ballReceptionCountButton = ballReceptionCountButton;
        this.attackCountButton = attackCountButton;
        this.blockCountButton = blockCountButton;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public int getPointCount() {
        return pointCount;
    }

    public int getBallFeedCount() {
        return ballFeedCount;
    }

    public int getBallReceptionCount() {
        return ballReceptionCount;
    }

    public int getAttackCount() {
        return attackCount;
    }

    public int getBlockCount() {
        return blockCount;
    }

    public Button getPointCountButton() {
        return pointCountButton;
    }

    public Button getFeedCountCountButton() {
        return ballFeedCountButton;
    }

    public Button getBallReceptionCountButton() {
        return ballReceptionCountButton;
    }

    public Button getAttackCountButton() {
        return attackCountButton;
    }

    public Button getBlockCountButton() {
        return blockCountButton;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public void setPointCount(int pointCount) {
        this.pointCount = pointCount;
    }

    public void setBallFeedCount(int ballFeedCount) {
        this.ballFeedCount = ballFeedCount;
    }

    public void setBallReceptionCount(int ballReceptionCount) {
        this.ballReceptionCount = ballReceptionCount;
    }

    public void setAttackCount(int attackCount) {
        this.attackCount = attackCount;
    }

    public void setBlockCount(int blockCount) {
        this.blockCount = blockCount;
    }

    public void setPointCountButton(Button pointCountButton) {
        this.pointCountButton = pointCountButton;
    }

    public void setBallFeedCountButton(Button ballFeedCountButton) {
        this.ballFeedCountButton = ballFeedCountButton;
    }

    public void setBallReceptionCountButton(Button ballReceptionCountButton) {
        this.ballReceptionCountButton = ballReceptionCountButton;
    }

    public void setAttackCountButton(Button attackCountButton) {
        this.attackCountButton = attackCountButton;
    }

    public void setBlockCountButton(Button blockCountButton) {
        this.blockCountButton = blockCountButton;
    }
}
