package com.example.android.scorekeeper;

import android.widget.Button;

import java.util.ArrayList;

public class BasketballTeam {

    private String name;
    private ArrayList<Player> players;
    private int points;
    private int onePointThrowsCount;
    private int twoPointsThrowsCount;
    private int threePointsThrowsCount;
    private int blockadesCount;
    private int interceptionsCount;
    private int foulsCount;
    private int ballPicksCount;
    private Button onePointThrowsCountButton;
    private Button twoPointsThrowsCountButton;
    private Button threePointsThrowsCountButton;
    private Button blockadesCountButton;
    private Button interceptionsCountButton;
    private Button foulsCountButton;
    private Button ballPicksCountButton;

    public BasketballTeam(String name) {
        this.name = name;
    }

    public BasketballTeam(String name, ArrayList<Player> players) {
        this.name = name;
        this.players = players;
    }

    public BasketballTeam(String name, int points, int onePointThrowsCount, int twoPointsThrowsCount,
                          int threePointsThrowsCount, int blockadesCount, int interceptionsCount,
                          int foulsCount, int ballPicksCount) {
        this.name = name;
        this.points = points;
        this.onePointThrowsCount = onePointThrowsCount;
        this.twoPointsThrowsCount = twoPointsThrowsCount;
        this.threePointsThrowsCount = threePointsThrowsCount;
        this.blockadesCount = blockadesCount;
        this.interceptionsCount = interceptionsCount;
        this.foulsCount = foulsCount;
        this.ballPicksCount = ballPicksCount;
    }

    public BasketballTeam(String name, int points,
                          int onePointThrowsCount, int twoPointsThrowsCount, int threePointsThrowsCount,
                          int blockadesCount, int interceptionsCount, int foulsCount, int ballPicksCount,
                          Button onePointThrowsCountButton, Button twoPointsThrowsCountButton,
                          Button threePointsThrowsCountButton, Button blockadesCountButton,
                          Button interceptionsCountButton, Button foulsCountButton,
                          Button ballPicksCountButton) {
        this.name = name;
        this.points = points;
        this.onePointThrowsCount = onePointThrowsCount;
        this.twoPointsThrowsCount = twoPointsThrowsCount;
        this.threePointsThrowsCount = threePointsThrowsCount;
        this.blockadesCount = blockadesCount;
        this.interceptionsCount = interceptionsCount;
        this.foulsCount = foulsCount;
        this.ballPicksCount = ballPicksCount;
        this.onePointThrowsCountButton = onePointThrowsCountButton;
        this.twoPointsThrowsCountButton = twoPointsThrowsCountButton;
        this.threePointsThrowsCountButton = threePointsThrowsCountButton;
        this.blockadesCountButton = blockadesCountButton;
        this.interceptionsCountButton = interceptionsCountButton;
        this.foulsCountButton = foulsCountButton;
        this.ballPicksCountButton = ballPicksCountButton;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public int getPoints() {
        return points;
    }

    public int getOnePointThrowsCount() {
        return onePointThrowsCount;
    }

    public int getTwoPointsThrowsCount() {
        return twoPointsThrowsCount;
    }

    public int getThreePointsThrowsCount() {
        return threePointsThrowsCount;
    }

    public int getBlockadesCount() {
        return blockadesCount;
    }

    public int getInterceptionsCount() {
        return interceptionsCount;
    }

    public int getFoulsCount() {
        return foulsCount;
    }

    public int getBallPicksCount() {
        return ballPicksCount;
    }

    public Button getOnePointThrowsCountButton() {
        return onePointThrowsCountButton;
    }

    public Button getTwoPointsThrowsCountButton() {
        return twoPointsThrowsCountButton;
    }

    public Button getThreePointsThrowsCountButton() {
        return threePointsThrowsCountButton;
    }

    public Button getBlockadesCountButton() {
        return blockadesCountButton;
    }

    public Button getInterceptionsCountButton() {
        return interceptionsCountButton;
    }

    public Button getFoulsCountButton() {
        return foulsCountButton;
    }

    public Button getBallPicksCountButton() {
        return ballPicksCountButton;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public void setOnePointThrowsCount(int onePointThrowsCount) {
        this.onePointThrowsCount = onePointThrowsCount;
    }

    public void setTwoPointsThrowsCount(int twoPointsThrowsCount) {
        this.twoPointsThrowsCount = twoPointsThrowsCount;
    }

    public void setThreePointsThrowsCount(int threePointsThrowsCount) {
        this.threePointsThrowsCount = threePointsThrowsCount;
    }

    public void setBlockadesCount(int blockadesCount) {
        this.blockadesCount = blockadesCount;
    }

    public void setInterceptionsCount(int interceptionsCount) {
        this.interceptionsCount = interceptionsCount;
    }

    public void setFoulsCount(int foulsCount) {
        this.foulsCount = foulsCount;
    }

    public void setBallPicksCount(int ballPicksCount) {
        this.ballPicksCount = ballPicksCount;
    }

    public void setOnePointThrowsCountButton(Button onePointThrowsCountButton) {
        this.onePointThrowsCountButton = onePointThrowsCountButton;
    }

    public void setTwoPointsThrowsCountButton(Button twoPointsThrowsCountButton) {
        this.twoPointsThrowsCountButton = twoPointsThrowsCountButton;
    }

    public void setThreePointsThrowsCountButton(Button threePointsThrowsCountButton) {
        this.threePointsThrowsCountButton = threePointsThrowsCountButton;
    }

    public void setBlockadesCountButton(Button blockadesCountButton) {
        this.blockadesCountButton = blockadesCountButton;
    }

    public void setInterceptionsCountButton(Button interceptionsCountButton) {
        this.interceptionsCountButton = interceptionsCountButton;
    }

    public void setFoulsCountButton(Button foulsCountButton) {
        this.foulsCountButton = foulsCountButton;
    }

    public void setBallPicksCountButton(Button ballPicksCountButton) {
        this.ballPicksCountButton = ballPicksCountButton;
    }
}
