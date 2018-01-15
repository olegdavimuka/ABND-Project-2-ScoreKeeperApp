package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class HockeyFragment extends Fragment {

    public HockeyFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.hockey_layout, container, false);

        // Team_1
        final HockeyTeam Team_1 = new HockeyTeam(getString(R.string.hockey_team_1), 0,
                0, 0, 0, 0);

        Team_1.setGoalCountButton((Button) rootView.findViewById(R.id.hockeyTeam_1_GoalButton));
        Team_1.setPenaltyCountButton((Button) rootView.findViewById(R.id.hockeyTeam_1_PenaltyButton));
        Team_1.setPlayerRemovalCountButton((Button) rootView.findViewById(R.id.hockeyTeam_1_PlayerRemovalButton));
        Team_1.setBodyCheckCountButton((Button) rootView.findViewById(R.id.hockeyTeam_1_BodyCheckButton));
        Team_1.setBlockCountButton((Button) rootView.findViewById(R.id.hockeyTeam_1_BlockButton));

        // Team_1 players
        Player Team_1_Player_1 = new Player(Team_1.getName(),
                getString(R.string.hockey_team_1_player_1), 0, 0);

        Team_1_Player_1.setPlayerButton((Button) rootView.findViewById(R.id.hockeyTeam_1_Player_1_Button));
        Team_1_Player_1.setPlayerRecord_1_Button((Button) rootView.findViewById(R.id.hockeyTeam_1_Player_1_Record_1_Button));
        Team_1_Player_1.setPlayerRecord_2_Button((Button) rootView.findViewById(R.id.hockeyTeam_1_Player_1_Record_2_Button));

        Player Team_1_Player_2 = new Player(Team_1.getName(),
                getString(R.string.hockey_team_1_player_2), 0, 0);

        Team_1_Player_2.setPlayerButton((Button) rootView.findViewById(R.id.hockeyTeam_1_Player_2_Button));
        Team_1_Player_2.setPlayerRecord_1_Button((Button) rootView.findViewById(R.id.hockeyTeam_1_Player_2_Record_1_Button));
        Team_1_Player_2.setPlayerRecord_2_Button((Button) rootView.findViewById(R.id.hockeyTeam_1_Player_2_Record_2_Button));

        Player Team_1_Player_3 = new Player(Team_1.getName(),
                getString(R.string.hockey_team_1_player_3), 0, 0);

        Team_1_Player_3.setPlayerButton((Button) rootView.findViewById(R.id.hockeyTeam_1_Player_3_Button));
        Team_1_Player_3.setPlayerRecord_1_Button((Button) rootView.findViewById(R.id.hockeyTeam_1_Player_3_Record_1_Button));
        Team_1_Player_3.setPlayerRecord_2_Button((Button) rootView.findViewById(R.id.hockeyTeam_1_Player_3_Record_2_Button));

        Player Team_1_Player_4 = new Player(Team_1.getName(),
                getString(R.string.hockey_team_1_player_4), 0, 0);

        Team_1_Player_4.setPlayerButton((Button) rootView.findViewById(R.id.hockeyTeam_1_Player_4_Button));
        Team_1_Player_4.setPlayerRecord_1_Button((Button) rootView.findViewById(R.id.hockeyTeam_1_Player_4_Record_1_Button));
        Team_1_Player_4.setPlayerRecord_2_Button((Button) rootView.findViewById(R.id.hockeyTeam_1_Player_4_Record_2_Button));

        Player Team_1_Player_5 = new Player(Team_1.getName(),
                getString(R.string.hockey_team_1_player_5), 0, 0);

        Team_1_Player_5.setPlayerButton((Button) rootView.findViewById(R.id.hockeyTeam_1_Player_5_Button));
        Team_1_Player_5.setPlayerRecord_1_Button((Button) rootView.findViewById(R.id.hockeyTeam_1_Player_5_Record_1_Button));
        Team_1_Player_5.setPlayerRecord_2_Button((Button) rootView.findViewById(R.id.hockeyTeam_1_Player_5_Record_2_Button));

        Player Team_1_Player_6 = new Player(Team_1.getName(),
                getString(R.string.hockey_team_1_player_6), 0, 0);

        Team_1_Player_6.setPlayerButton((Button) rootView.findViewById(R.id.hockeyTeam_1_Player_6_Button));
        Team_1_Player_6.setPlayerRecord_1_Button((Button) rootView.findViewById(R.id.hockeyTeam_1_Player_6_Record_1_Button));
        Team_1_Player_6.setPlayerRecord_2_Button((Button) rootView.findViewById(R.id.hockeyTeam_1_Player_6_Record_2_Button));

        ArrayList<Player> Team_1_Players = new ArrayList<>();
        Team_1_Players.add(Team_1_Player_3);
        Team_1_Players.add(Team_1_Player_2);
        Team_1_Players.add(Team_1_Player_3);
        Team_1_Players.add(Team_1_Player_4);
        Team_1_Players.add(Team_1_Player_5);
        Team_1_Players.add(Team_1_Player_6);

        Team_1.setPlayers(Team_1_Players);

        // Team_2
        final HockeyTeam Team_2 = new HockeyTeam(getString(R.string.hockey_team_2), 0,
                0, 0, 0, 0);

        Team_2.setGoalCountButton((Button) rootView.findViewById(R.id.hockeyTeam_2_GoalButton));
        Team_2.setPenaltyCountButton((Button) rootView.findViewById(R.id.hockeyTeam_2_PenaltyButton));
        Team_2.setPlayerRemovalCountButton((Button) rootView.findViewById(R.id.hockeyTeam_2_PlayerRemovalButton));
        Team_2.setBodyCheckCountButton((Button) rootView.findViewById(R.id.hockeyTeam_2_BodyCheckButton));
        Team_2.setBlockCountButton((Button) rootView.findViewById(R.id.hockeyTeam_2_BlockButton));

        // Team_2 players
        Player Team_2_Player_1 = new Player(Team_2.getName(),
                getString(R.string.hockey_team_2_player_1), 0, 0);

        Team_2_Player_1.setPlayerButton((Button) rootView.findViewById(R.id.hockeyTeam_2_Player_2_Button));
        Team_2_Player_1.setPlayerRecord_1_Button((Button) rootView.findViewById(R.id.hockeyTeam_2_Player_1_Record_1_Button));
        Team_2_Player_1.setPlayerRecord_2_Button((Button) rootView.findViewById(R.id.hockeyTeam_2_Player_1_Record_2_Button));

        Player Team_2_Player_2 = new Player(Team_2.getName(),
                getString(R.string.hockey_team_2_player_2), 0, 0);

        Team_2_Player_2.setPlayerButton((Button) rootView.findViewById(R.id.hockeyTeam_2_Player_2_Button));
        Team_2_Player_2.setPlayerRecord_1_Button((Button) rootView.findViewById(R.id.hockeyTeam_2_Player_2_Record_1_Button));
        Team_2_Player_2.setPlayerRecord_2_Button((Button) rootView.findViewById(R.id.hockeyTeam_2_Player_2_Record_2_Button));

        Player Team_2_Player_3 = new Player(Team_2.getName(),
                getString(R.string.hockey_team_2_player_3), 0, 0);

        Team_2_Player_3.setPlayerButton((Button) rootView.findViewById(R.id.hockeyTeam_2_Player_3_Button));
        Team_2_Player_3.setPlayerRecord_1_Button((Button) rootView.findViewById(R.id.hockeyTeam_2_Player_3_Record_1_Button));
        Team_2_Player_3.setPlayerRecord_2_Button((Button) rootView.findViewById(R.id.hockeyTeam_2_Player_3_Record_2_Button));

        Player Team_2_Player_4 = new Player(Team_2.getName(),
                getString(R.string.hockey_team_2_player_4), 0, 0);

        Team_2_Player_4.setPlayerButton((Button) rootView.findViewById(R.id.hockeyTeam_2_Player_4_Button));
        Team_2_Player_4.setPlayerRecord_1_Button((Button) rootView.findViewById(R.id.hockeyTeam_2_Player_4_Record_1_Button));
        Team_2_Player_4.setPlayerRecord_2_Button((Button) rootView.findViewById(R.id.hockeyTeam_2_Player_4_Record_2_Button));

        Player Team_2_Player_5 = new Player(Team_2.getName(),
                getString(R.string.hockey_team_2_player_5), 0, 0);

        Team_2_Player_5.setPlayerButton((Button) rootView.findViewById(R.id.hockeyTeam_2_Player_5_Button));
        Team_2_Player_5.setPlayerRecord_1_Button((Button) rootView.findViewById(R.id.hockeyTeam_2_Player_5_Record_1_Button));
        Team_2_Player_5.setPlayerRecord_2_Button((Button) rootView.findViewById(R.id.hockeyTeam_2_Player_5_Record_2_Button));

        Player Team_2_Player_6 = new Player(Team_2.getName(),
                getString(R.string.hockey_team_2_player_6), 0, 0);

        Team_2_Player_6.setPlayerButton((Button) rootView.findViewById(R.id.hockeyTeam_2_Player_6_Button));
        Team_2_Player_6.setPlayerRecord_1_Button((Button) rootView.findViewById(R.id.hockeyTeam_2_Player_6_Record_1_Button));
        Team_2_Player_6.setPlayerRecord_2_Button((Button) rootView.findViewById(R.id.hockeyTeam_2_Player_6_Record_2_Button));


        ArrayList<Player> Team_2_Players = new ArrayList<>();
        Team_2_Players.add(Team_2_Player_1);
        Team_2_Players.add(Team_2_Player_2);
        Team_2_Players.add(Team_2_Player_3);
        Team_2_Players.add(Team_2_Player_4);
        Team_2_Players.add(Team_2_Player_5);
        Team_2_Players.add(Team_2_Player_6);

        Team_2.setPlayers(Team_2_Players);

        // Show/hide players and reset buttons
        final Button showHideButton = rootView.findViewById(R.id.hockeyShowHidePlayersButton);
        Button resetButton = rootView.findViewById(R.id.hockeyResetButton);

        final ArrayList<Button> Team_1_Buttons = new ArrayList<>();
        Team_1_Buttons.add(Team_1.getGoalCountButton());
        Team_1_Buttons.add(Team_1.getPenaltyCountButton());
        Team_1_Buttons.add(Team_1.getPlayerRemovalCountButton());
        Team_1_Buttons.add(Team_1.getBodyCheckCountButton());
        Team_1_Buttons.add(Team_1.getBlockCountButton());

        final ArrayList<Button> Team_2_Buttons = new ArrayList<>();
        Team_2_Buttons.add(Team_2.getGoalCountButton());
        Team_2_Buttons.add(Team_2.getPenaltyCountButton());
        Team_2_Buttons.add(Team_2.getPlayerRemovalCountButton());
        Team_2_Buttons.add(Team_2.getBodyCheckCountButton());
        Team_2_Buttons.add(Team_2.getBlockCountButton());

        // Defining onClickListeners
        View.OnClickListener plusOneOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView countTextView = rootView.findViewById(view.getNextFocusForwardId());
                int count = Integer.parseInt(countTextView.getText().toString());
                countTextView.setText("" + ++count);

                if (view.getId() == R.id.hockeyTeam_1_GoalButton) {
                    TextView hockeyTeam_1_ScoreTextView = rootView.findViewById(R.id.hockeyTeam_1_Score);
                    int score = Integer.parseInt(hockeyTeam_1_ScoreTextView.getText().toString());
                    score++;
                    hockeyTeam_1_ScoreTextView.setText("" + score);
                }
                if (view.getId() == R.id.hockeyTeam_2_GoalButton) {
                    TextView hockeyTeam_2_ScoreTextView = rootView.findViewById(R.id.hockeyTeam_2_Score);
                    int score = Integer.parseInt(hockeyTeam_2_ScoreTextView.getText().toString());
                    score++;
                    hockeyTeam_2_ScoreTextView.setText("" + score);
                }
            }
        };

        View.OnClickListener showHideOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LinearLayout playerLinearLayout = rootView.findViewById(view.getNextFocusForwardId());
                if (playerLinearLayout.getVisibility() == View.GONE) {
                    playerLinearLayout.setVisibility(View.VISIBLE);
                } else {
                    playerLinearLayout.setVisibility(View.GONE);
                }
            }
        };

        View.OnClickListener showHideAllOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (Player player : Team_1.getPlayers()) {
                    if (player.getPlayerButton().getVisibility() == View.GONE) {
                        showHideButton.setText(R.string.hide_players);
                        player.getPlayerButton().setVisibility(View.VISIBLE);
                    } else {
                        showHideButton.setText(R.string.show_players);
                        player.getPlayerButton().setVisibility(View.GONE);
                        rootView.findViewById(player.getPlayerButton().getNextFocusForwardId())
                                .setVisibility(View.GONE);
                    }
                }

                for (Player player : Team_2.getPlayers()) {
                    if (player.getPlayerButton().getVisibility() == View.GONE) {
                        showHideButton.setText(R.string.hide_players);
                        player.getPlayerButton().setVisibility(View.VISIBLE);
                    } else {
                        showHideButton.setText(R.string.show_players);
                        player.getPlayerButton().setVisibility(View.GONE);
                        rootView.findViewById(player.getPlayerButton().getNextFocusForwardId()).setVisibility(View.GONE);
                    }
                }
            }
        };

        View.OnClickListener resetOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                for (Button teamButton : Team_1_Buttons) {
                    TextView textView = rootView.findViewById(teamButton.getNextFocusForwardId());
                    textView.setText(R.string.zero);
                }

                for (Button teamButton : Team_2_Buttons) {
                    TextView textView = rootView.findViewById(teamButton.getNextFocusForwardId());
                    textView.setText(R.string.zero);
                }

                for (Player player : Team_1.getPlayers()) {
                    TextView countTextView = rootView.findViewById(player.getPlayerRecord_1_Button().getNextFocusForwardId());
                    countTextView.setText(R.string.zero);
                    countTextView = rootView.findViewById(player.getPlayerRecord_2_Button().getNextFocusForwardId());
                    countTextView.setText(R.string.zero);
                }

                for (Player player : Team_2.getPlayers()) {
                    TextView countTextView = rootView.findViewById(player.getPlayerRecord_1_Button().getNextFocusForwardId());
                    countTextView.setText(R.string.zero);
                    countTextView = rootView.findViewById(player.getPlayerRecord_2_Button().getNextFocusForwardId());
                    countTextView.setText(R.string.zero);
                }

                TextView scoreTextView = rootView.findViewById(R.id.hockeyTeam_1_Score);
                scoreTextView.setText("0");
                scoreTextView = rootView.findViewById(R.id.hockeyTeam_2_Score);
                scoreTextView.setText("0");
            }
        };

        // Setting onClickListener for Team_1 buttons
        for (Button teamButton : Team_1_Buttons) {
            teamButton.setOnClickListener(plusOneOnClickListener);
        }

        // Setting onClickListener for Team_2 buttons
        for (Button teamButton : Team_2_Buttons) {
            teamButton.setOnClickListener(plusOneOnClickListener);
        }

        // Setting onClickListener for Team_1 players records buttons
        for (Player player : Team_1.getPlayers()) {
            player.getPlayerRecord_1_Button().setOnClickListener(plusOneOnClickListener);
        }

        for (Player player : Team_1.getPlayers()) {
            player.getPlayerRecord_2_Button().setOnClickListener(plusOneOnClickListener);
        }

        // Setting onClickListener for Team_2 players records buttons
        for (Player player : Team_2.getPlayers()) {
            player.getPlayerRecord_1_Button().setOnClickListener(plusOneOnClickListener);
        }

        for (Player player : Team_2.getPlayers()) {
            player.getPlayerRecord_2_Button().setOnClickListener(plusOneOnClickListener);
        }

        // Setting onClickListener for players buttons
        for (Player player : Team_1.getPlayers()) {
            player.getPlayerButton().setOnClickListener(showHideOnClickListener);
        }

        for (Player player : Team_2.getPlayers()) {
            player.getPlayerButton().setOnClickListener(showHideOnClickListener);
        }

        // Setting onClickListeners for show/hide button and reset
        showHideButton.setOnClickListener(showHideAllOnClickListener);
        resetButton.setOnClickListener(resetOnClickListener);

        return rootView;
    }
}
