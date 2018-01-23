package com.example.android.scorekeeper;

import android.widget.Button;

import java.util.ArrayList;

public class BasketballTeam extends Team {
    private int score;

    public BasketballTeam() {
    }

    public BasketballTeam(String name) {
        super(name);
    }

    public BasketballTeam(String name, ArrayList<Player> players) {
        super(name, players);
    }

    public BasketballTeam(String name, int score, int statistic_1_count, int statistic_2_count, int statistic_3_count,
                          Button statistic_1_Button, Button statistic_2_Button, Button statistic_3_Button) {
        super(name, statistic_1_count, statistic_2_count, statistic_3_count,
                statistic_1_Button, statistic_2_Button, statistic_3_Button);
        this.score = score;
    }

    BasketballTeam(String name, int statistic_1_count, int statistic_2_count, int statistic_3_count,
                   int score) {
        super(name, statistic_1_count, statistic_2_count, statistic_3_count);
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
