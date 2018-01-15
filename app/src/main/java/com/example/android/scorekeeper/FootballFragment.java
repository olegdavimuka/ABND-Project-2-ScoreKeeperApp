package com.example.android.scorekeeper;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class FootballFragment extends android.support.v4.app.Fragment {

    public FootballFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.football_layout, container, false);

        // Team_1
        final FootballTeam Team_1 = new FootballTeam(getString(R.string.football_team_1), 0, 0, 0,
                0, 0, 0, 0);

        Team_1.setGoalsCountButton((Button) rootView.findViewById(R.id.footballTeam_1_GoalButton));
        Team_1.setFoulsCountButton((Button) rootView.findViewById(R.id.footballTeam_1_FoulButton));
        Team_1.setYellowCardsCountButton((Button) rootView.findViewById(R.id.footballTeam_1_YellowCardButton));
        Team_1.setRedCardsCountButton((Button) rootView.findViewById(R.id.footballTeam_1_RedCardButton));
        Team_1.setOffsidesCountButton((Button) rootView.findViewById(R.id.footballTeam_1_OffsideButton));
        Team_1.setCornerKicksCountButton((Button) rootView.findViewById(R.id.footballTeam_1_CornerKickButton));
        Team_1.setSavesCountButton((Button) rootView.findViewById(R.id.footballTeam_1_SaveButton));

        // Team_1 players
        Player Team_1_Player_1 = new Player(Team_1.getName(),
                getString(R.string.football_team_1_player_1), 0, 0);

        Team_1_Player_1.setPlayerButton((Button) rootView.findViewById(R.id.footballTeam_1_Player_1_Button));
        Team_1_Player_1.setPlayerRecord_1_Button((Button) rootView.findViewById(R.id.footballTeam_1_Player_1_Record_1_Button));
        Team_1_Player_1.setPlayerRecord_2_Button((Button) rootView.findViewById(R.id.footballTeam_1_Player_1_Record_2_Button));

        Player Team_1_Player_2 = new Player(Team_1.getName(),
                getString(R.string.football_team_1_player_2), 0, 0);

        Team_1_Player_2.setPlayerButton((Button) rootView.findViewById(R.id.footballTeam_1_Player_2_Button));
        Team_1_Player_2.setPlayerRecord_1_Button((Button) rootView.findViewById(R.id.footballTeam_1_Player_2_Record_1_Button));
        Team_1_Player_2.setPlayerRecord_2_Button((Button) rootView.findViewById(R.id.footballTeam_1_Player_2_Record_2_Button));

        Player Team_1_Player_3 = new Player(Team_1.getName(),
                getString(R.string.football_team_1_player_3), 0, 0);

        Team_1_Player_3.setPlayerButton((Button) rootView.findViewById(R.id.footballTeam_1_Player_3_Button));
        Team_1_Player_3.setPlayerRecord_1_Button((Button) rootView.findViewById(R.id.footballTeam_1_Player_3_Record_1_Button));
        Team_1_Player_3.setPlayerRecord_2_Button((Button) rootView.findViewById(R.id.footballTeam_1_Player_3_Record_2_Button));

        Player Team_1_Player_4 = new Player(Team_1.getName(),
                getString(R.string.football_team_1_player_4), 0, 0);

        Team_1_Player_4.setPlayerButton((Button) rootView.findViewById(R.id.footballTeam_1_Player_4_Button));
        Team_1_Player_4.setPlayerRecord_1_Button((Button) rootView.findViewById(R.id.footballTeam_1_Player_4_Record_1_Button));
        Team_1_Player_4.setPlayerRecord_2_Button((Button) rootView.findViewById(R.id.footballTeam_1_Player_4_Record_2_Button));

        Player Team_1_Player_5 = new Player(Team_1.getName(),
                getString(R.string.football_team_1_player_5), 0, 0);

        Team_1_Player_5.setPlayerButton((Button) rootView.findViewById(R.id.footballTeam_1_Player_5_Button));
        Team_1_Player_5.setPlayerRecord_1_Button((Button) rootView.findViewById(R.id.footballTeam_1_Player_5_Record_1_Button));
        Team_1_Player_5.setPlayerRecord_2_Button((Button) rootView.findViewById(R.id.footballTeam_1_Player_5_Record_2_Button));

        Player Team_1_Player_6 = new Player(Team_1.getName(),
                getString(R.string.football_team_1_player_6), 0, 0);

        Team_1_Player_6.setPlayerButton((Button) rootView.findViewById(R.id.footballTeam_1_Player_6_Button));
        Team_1_Player_6.setPlayerRecord_1_Button((Button) rootView.findViewById(R.id.footballTeam_1_Player_6_Record_1_Button));
        Team_1_Player_6.setPlayerRecord_2_Button((Button) rootView.findViewById(R.id.footballTeam_1_Player_6_Record_2_Button));

        Player Team_1_Player_7 = new Player(Team_1.getName(),
                getString(R.string.football_team_1_player_7), 0, 0);

        Team_1_Player_7.setPlayerButton((Button) rootView.findViewById(R.id.footballTeam_1_Player_7_Button));
        Team_1_Player_7.setPlayerRecord_1_Button((Button) rootView.findViewById(R.id.footballTeam_1_Player_7_Record_1_Button));
        Team_1_Player_7.setPlayerRecord_2_Button((Button) rootView.findViewById(R.id.footballTeam_1_Player_7_Record_2_Button));

        Player Team_1_Player_8 = new Player(Team_1.getName(),
                getString(R.string.football_team_1_player_8), 0, 0);

        Team_1_Player_8.setPlayerButton((Button) rootView.findViewById(R.id.footballTeam_1_Player_8_Button));
        Team_1_Player_8.setPlayerRecord_1_Button((Button) rootView.findViewById(R.id.footballTeam_1_Player_8_Record_1_Button));
        Team_1_Player_8.setPlayerRecord_2_Button((Button) rootView.findViewById(R.id.footballTeam_1_Player_8_Record_2_Button));

        Player Team_1_Player_9 = new Player(Team_1.getName(),
                getString(R.string.football_team_1_player_9), 0, 0);

        Team_1_Player_9.setPlayerButton((Button) rootView.findViewById(R.id.footballTeam_1_Player_9_Button));
        Team_1_Player_9.setPlayerRecord_1_Button((Button) rootView.findViewById(R.id.footballTeam_1_Player_9_Record_1_Button));
        Team_1_Player_9.setPlayerRecord_2_Button((Button) rootView.findViewById(R.id.footballTeam_1_Player_9_Record_2_Button));

        Player Team_1_Player_10 = new Player(Team_1.getName(),
                getString(R.string.football_team_1_player_10), 0, 0);

        Team_1_Player_10.setPlayerButton((Button) rootView.findViewById(R.id.footballTeam_1_Player_10_Button));
        Team_1_Player_10.setPlayerRecord_1_Button((Button) rootView.findViewById(R.id.footballTeam_1_Player_10_Record_1_Button));
        Team_1_Player_10.setPlayerRecord_2_Button((Button) rootView.findViewById(R.id.footballTeam_1_Player_10_Record_2_Button));

        Player Team_1_Player_11 = new Player(Team_1.getName(),
                getString(R.string.football_team_1_player_11), 0, 0);

        Team_1_Player_11.setPlayerButton((Button) rootView.findViewById(R.id.footballTeam_1_Player_11_Button));
        Team_1_Player_11.setPlayerRecord_1_Button((Button) rootView.findViewById(R.id.footballTeam_1_Player_11_Record_1_Button));
        Team_1_Player_11.setPlayerRecord_2_Button((Button) rootView.findViewById(R.id.footballTeam_1_Player_11_Record_2_Button));

        ArrayList<Player> Team_1_Players = new ArrayList<>();
        Team_1_Players.add(Team_1_Player_1);
        Team_1_Players.add(Team_1_Player_2);
        Team_1_Players.add(Team_1_Player_3);
        Team_1_Players.add(Team_1_Player_4);
        Team_1_Players.add(Team_1_Player_5);
        Team_1_Players.add(Team_1_Player_6);
        Team_1_Players.add(Team_1_Player_7);
        Team_1_Players.add(Team_1_Player_8);
        Team_1_Players.add(Team_1_Player_9);
        Team_1_Players.add(Team_1_Player_10);
        Team_1_Players.add(Team_1_Player_11);

        Team_1.setPlayers(Team_1_Players);

        // Team_2
        final FootballTeam Team_2 = new FootballTeam(getString(R.string.football_team_1), 0, 0, 0,
                0, 0, 0, 0);

        Team_2.setGoalsCountButton((Button) rootView.findViewById(R.id.footballTeam_2_GoalButton));
        Team_2.setFoulsCountButton((Button) rootView.findViewById(R.id.footballTeam_2_FoulButton));
        Team_2.setYellowCardsCountButton((Button) rootView.findViewById(R.id.footballTeam_2_YellowCardButton));
        Team_2.setRedCardsCountButton((Button) rootView.findViewById(R.id.footballTeam_2_RedCardButton));
        Team_2.setOffsidesCountButton((Button) rootView.findViewById(R.id.footballTeam_2_OffsideButton));
        Team_2.setCornerKicksCountButton((Button) rootView.findViewById(R.id.footballTeam_2_CornerKickButton));
        Team_2.setSavesCountButton((Button) rootView.findViewById(R.id.footballTeam_2_SaveButton));

        // Team_2 players
        Player Team_2_Player_1 = new Player(Team_2.getName(),
                getString(R.string.football_team_2_player_1), 0, 0);

        Team_2_Player_1.setPlayerButton((Button) rootView.findViewById(R.id.footballTeam_2_Player_1_Button));
        Team_2_Player_1.setPlayerRecord_1_Button((Button) rootView.findViewById(R.id.footballTeam_2_Player_1_Record_1_Button));
        Team_2_Player_1.setPlayerRecord_2_Button((Button) rootView.findViewById(R.id.footballTeam_2_Player_1_Record_2_Button));

        Player Team_2_Player_2 = new Player(Team_2.getName(),
                getString(R.string.football_team_2_player_2), 0, 0);

        Team_2_Player_2.setPlayerButton((Button) rootView.findViewById(R.id.footballTeam_2_Player_2_Button));
        Team_2_Player_2.setPlayerRecord_1_Button((Button) rootView.findViewById(R.id.footballTeam_2_Player_2_Record_1_Button));
        Team_2_Player_2.setPlayerRecord_2_Button((Button) rootView.findViewById(R.id.footballTeam_2_Player_2_Record_2_Button));

        Player Team_2_Player_3 = new Player(Team_2.getName(),
                getString(R.string.football_team_2_player_3), 0, 0);

        Team_2_Player_3.setPlayerButton((Button) rootView.findViewById(R.id.footballTeam_2_Player_3_Button));
        Team_2_Player_3.setPlayerRecord_1_Button((Button) rootView.findViewById(R.id.footballTeam_2_Player_3_Record_1_Button));
        Team_2_Player_3.setPlayerRecord_2_Button((Button) rootView.findViewById(R.id.footballTeam_2_Player_3_Record_2_Button));

        Player Team_2_Player_4 = new Player(Team_2.getName(),
                getString(R.string.football_team_2_player_4), 0, 0);

        Team_2_Player_4.setPlayerButton((Button) rootView.findViewById(R.id.footballTeam_2_Player_4_Button));
        Team_2_Player_4.setPlayerRecord_1_Button((Button) rootView.findViewById(R.id.footballTeam_2_Player_4_Record_1_Button));
        Team_2_Player_4.setPlayerRecord_2_Button((Button) rootView.findViewById(R.id.footballTeam_2_Player_4_Record_2_Button));

        Player Team_2_Player_5 = new Player(Team_2.getName(),
                getString(R.string.football_team_2_player_5), 0, 0);

        Team_2_Player_5.setPlayerButton((Button) rootView.findViewById(R.id.footballTeam_2_Player_5_Button));
        Team_2_Player_5.setPlayerRecord_1_Button((Button) rootView.findViewById(R.id.footballTeam_2_Player_5_Record_1_Button));
        Team_2_Player_5.setPlayerRecord_2_Button((Button) rootView.findViewById(R.id.footballTeam_2_Player_5_Record_2_Button));

        Player Team_2_Player_6 = new Player(Team_2.getName(),
                getString(R.string.football_team_2_player_6), 0, 0);

        Team_2_Player_6.setPlayerButton((Button) rootView.findViewById(R.id.footballTeam_2_Player_6_Button));
        Team_2_Player_6.setPlayerRecord_1_Button((Button) rootView.findViewById(R.id.footballTeam_2_Player_6_Record_1_Button));
        Team_2_Player_6.setPlayerRecord_2_Button((Button) rootView.findViewById(R.id.footballTeam_2_Player_6_Record_2_Button));

        Player Team_2_Player_7 = new Player(Team_2.getName(),
                getString(R.string.football_team_2_player_7), 0, 0);

        Team_2_Player_7.setPlayerButton((Button) rootView.findViewById(R.id.footballTeam_2_Player_7_Button));
        Team_2_Player_7.setPlayerRecord_1_Button((Button) rootView.findViewById(R.id.footballTeam_2_Player_7_Record_1_Button));
        Team_2_Player_7.setPlayerRecord_2_Button((Button) rootView.findViewById(R.id.footballTeam_2_Player_7_Record_2_Button));

        Player Team_2_Player_8 = new Player(Team_2.getName(),
                getString(R.string.football_team_2_player_8), 0, 0);

        Team_2_Player_8.setPlayerButton((Button) rootView.findViewById(R.id.footballTeam_2_Player_8_Button));
        Team_2_Player_8.setPlayerRecord_1_Button((Button) rootView.findViewById(R.id.footballTeam_2_Player_8_Record_1_Button));
        Team_2_Player_8.setPlayerRecord_2_Button((Button) rootView.findViewById(R.id.footballTeam_2_Player_8_Record_2_Button));

        Player Team_2_Player_9 = new Player(Team_2.getName(),
                getString(R.string.football_team_2_player_9), 0, 0);

        Team_2_Player_9.setPlayerButton((Button) rootView.findViewById(R.id.footballTeam_2_Player_9_Button));
        Team_2_Player_9.setPlayerRecord_1_Button((Button) rootView.findViewById(R.id.footballTeam_2_Player_9_Record_1_Button));
        Team_2_Player_9.setPlayerRecord_2_Button((Button) rootView.findViewById(R.id.footballTeam_2_Player_9_Record_2_Button));

        Player Team_2_Player_10 = new Player(Team_2.getName(),
                getString(R.string.football_team_2_player_10), 0, 0);

        Team_2_Player_10.setPlayerButton((Button) rootView.findViewById(R.id.footballTeam_2_Player_10_Button));
        Team_2_Player_10.setPlayerRecord_1_Button((Button) rootView.findViewById(R.id.footballTeam_2_Player_10_Record_1_Button));
        Team_2_Player_10.setPlayerRecord_2_Button((Button) rootView.findViewById(R.id.footballTeam_2_Player_10_Record_2_Button));

        Player Team_2_Player_11 = new Player(Team_2.getName(),
                getString(R.string.football_team_2_player_11), 0, 0);

        Team_2_Player_11.setPlayerButton((Button) rootView.findViewById(R.id.footballTeam_2_Player_11_Button));
        Team_2_Player_11.setPlayerRecord_1_Button((Button) rootView.findViewById(R.id.footballTeam_2_Player_11_Record_1_Button));
        Team_2_Player_11.setPlayerRecord_2_Button((Button) rootView.findViewById(R.id.footballTeam_2_Player_11_Record_2_Button));

        ArrayList<Player> Team_2_Players = new ArrayList<>();
        Team_2_Players.add(Team_2_Player_1);
        Team_2_Players.add(Team_2_Player_2);
        Team_2_Players.add(Team_2_Player_3);
        Team_2_Players.add(Team_2_Player_4);
        Team_2_Players.add(Team_2_Player_5);
        Team_2_Players.add(Team_2_Player_6);
        Team_2_Players.add(Team_2_Player_7);
        Team_2_Players.add(Team_2_Player_8);
        Team_2_Players.add(Team_2_Player_9);
        Team_2_Players.add(Team_2_Player_10);
        Team_2_Players.add(Team_2_Player_11);

        Team_2.setPlayers(Team_2_Players);

        // Show/hide players and reset buttons
        final Button showHideButton = rootView.findViewById(R.id.footballShowHidePlayersButton);
        Button resetButton = rootView.findViewById(R.id.footballResetButton);

        final ArrayList<Button> Team_1_Buttons = new ArrayList<>();
        Team_1_Buttons.add(Team_1.getGoalsCountButton());
        Team_1_Buttons.add(Team_1.getFoulsCountButton());
        Team_1_Buttons.add(Team_1.getYellowCardsCountButton());
        Team_1_Buttons.add(Team_1.getRedCardsCountButton());
        Team_1_Buttons.add(Team_1.getOffsidesCountButton());
        Team_1_Buttons.add(Team_1.getCornerKicksCountButton());
        Team_1_Buttons.add(Team_1.getSavesCountButton());

        final ArrayList<Button> Team_2_Buttons = new ArrayList<>();
        Team_2_Buttons.add(Team_2.getGoalsCountButton());
        Team_2_Buttons.add(Team_2.getFoulsCountButton());
        Team_2_Buttons.add(Team_2.getYellowCardsCountButton());
        Team_2_Buttons.add(Team_2.getRedCardsCountButton());
        Team_2_Buttons.add(Team_2.getOffsidesCountButton());
        Team_2_Buttons.add(Team_2.getCornerKicksCountButton());
        Team_2_Buttons.add(Team_2.getSavesCountButton());

        // Defining onClickListeners
        View.OnClickListener plusOneOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView countTextView = rootView.findViewById(view.getNextFocusForwardId());
                int count = Integer.parseInt(countTextView.getText().toString());
                count++;
                countTextView.setText("" + count);

                if (view.getId() == R.id.footballTeam_1_GoalButton) {
                    TextView footballTeam_1_ScoreTextView = rootView.findViewById(R.id.footballTeam_1_Score);
                    int score = Integer.parseInt(footballTeam_1_ScoreTextView.getText().toString());
                    score++;
                    footballTeam_1_ScoreTextView.setText("" + score);
                }
                if (view.getId() == R.id.footballTeam_2_GoalButton) {
                    TextView footballTeam_2_ScoreTextView = rootView.findViewById(R.id.footballTeam_2_Score);
                    int score = Integer.parseInt(footballTeam_2_ScoreTextView.getText().toString());
                    score++;
                    footballTeam_2_ScoreTextView.setText("" + score);
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
                for (Button TeamButton : Team_1_Buttons) {
                    TextView countTextView = rootView.findViewById(TeamButton.getNextFocusForwardId());
                    countTextView.setText(R.string.zero);
                }

                for (Button TeamButton : Team_2_Buttons) {
                    TextView countTextView = rootView.findViewById(TeamButton.getNextFocusForwardId());
                    countTextView.setText(R.string.zero);
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

                TextView scoreTextView = rootView.findViewById(R.id.footballTeam_1_Score);
                scoreTextView.setText("0");
                scoreTextView = rootView.findViewById(R.id.footballTeam_2_Score);
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
