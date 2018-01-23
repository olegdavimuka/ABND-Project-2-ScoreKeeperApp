package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class VolleyballFragment extends Fragment {

    HashMap<String, String> savedValues = new HashMap<>();

    private View rootView;

    public VolleyballFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
            for (String key : savedInstanceState.keySet()) {
                if (!key.equals("android:view_state") && !key.equals("android:user_visible_hint")) {
                    savedValues.put(key, savedInstanceState.getString(key));
                }
            }
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.volleyball_layout, container, false);

        // Team_1
        final Team Team_1 = new Team(getString(R.string.volleyball_team_1), 0, 0, 0);

        Team_1.setStatistic_1_Button((Button) rootView.findViewById(R.id.volleyballTeam_1_PointButton));
        Team_1.setStatistic_2_Button((Button) rootView.findViewById(R.id.volleyballTeam_1_BallFeedButton));
        Team_1.setStatistic_3_Button((Button) rootView.findViewById(R.id.volleyballTeam_1_BallReceptionButton));

        // Team_1 players
        Player Team_1_Player_1 = new Player(Team_1.getName(),
                getString(R.string.volleyball_team_1_player_1), 0, 0);

        Team_1_Player_1.setPlayerButton((Button) rootView.findViewById(R.id.volleyballTeam_1_Player_1_Button));
        Team_1_Player_1.setPlayerRecord_1_Button((Button) rootView.findViewById(R.id.volleyballTeam_1_Player_1_Record_1_Button));
        Team_1_Player_1.setPlayerRecord_2_Button((Button) rootView.findViewById(R.id.volleyballTeam_1_Player_1_Record_2_Button));

        Player Team_1_Player_2 = new Player(Team_1.getName(),
                getString(R.string.volleyball_team_1_player_2), 0, 0);

        Team_1_Player_2.setPlayerButton((Button) rootView.findViewById(R.id.volleyballTeam_1_Player_2_Button));
        Team_1_Player_2.setPlayerRecord_1_Button((Button) rootView.findViewById(R.id.volleyballTeam_1_Player_2_Record_1_Button));
        Team_1_Player_2.setPlayerRecord_2_Button((Button) rootView.findViewById(R.id.volleyballTeam_1_Player_2_Record_2_Button));

        Player Team_1_Player_3 = new Player(Team_1.getName(),
                getString(R.string.volleyball_team_1_player_3), 0, 0);

        Team_1_Player_3.setPlayerButton((Button) rootView.findViewById(R.id.volleyballTeam_1_Player_3_Button));
        Team_1_Player_3.setPlayerRecord_1_Button((Button) rootView.findViewById(R.id.volleyballTeam_1_Player_3_Record_1_Button));
        Team_1_Player_3.setPlayerRecord_2_Button((Button) rootView.findViewById(R.id.volleyballTeam_1_Player_3_Record_2_Button));

        Player Team_1_Player_4 = new Player(Team_1.getName(),
                getString(R.string.volleyball_team_1_player_4), 0, 0);

        Team_1_Player_4.setPlayerButton((Button) rootView.findViewById(R.id.volleyballTeam_1_Player_4_Button));
        Team_1_Player_4.setPlayerRecord_1_Button((Button) rootView.findViewById(R.id.volleyballTeam_1_Player_4_Record_1_Button));
        Team_1_Player_4.setPlayerRecord_2_Button((Button) rootView.findViewById(R.id.volleyballTeam_1_Player_4_Record_2_Button));

        Player Team_1_Player_5 = new Player(Team_1.getName(),
                getString(R.string.volleyball_team_1_player_5), 0, 0);

        Team_1_Player_5.setPlayerButton((Button) rootView.findViewById(R.id.volleyballTeam_1_Player_5_Button));
        Team_1_Player_5.setPlayerRecord_1_Button((Button) rootView.findViewById(R.id.volleyballTeam_1_Player_5_Record_1_Button));
        Team_1_Player_5.setPlayerRecord_2_Button((Button) rootView.findViewById(R.id.volleyballTeam_1_Player_5_Record_2_Button));

        ArrayList<Player> Team_1_Players = new ArrayList<>();
        Team_1_Players.add(Team_1_Player_1);
        Team_1_Players.add(Team_1_Player_2);
        Team_1_Players.add(Team_1_Player_3);
        Team_1_Players.add(Team_1_Player_4);
        Team_1_Players.add(Team_1_Player_5);

        Team_1.setPlayers(Team_1_Players);

        // Team_2
        final Team Team_2 = new Team(getString(R.string.volleyball_team_2), 0, 0, 0);

        Team_2.setStatistic_1_Button((Button) rootView.findViewById(R.id.volleyballTeam_2_PointButton));
        Team_2.setStatistic_2_Button((Button) rootView.findViewById(R.id.volleyballTeam_2_BallFeedButton));
        Team_2.setStatistic_3_Button((Button) rootView.findViewById(R.id.volleyballTeam_2_BallReceptionButton));

        // Team_2 players
        Player Team_2_Player_1 = new Player(Team_2.getName(),
                getString(R.string.volleyball_team_2_player_1), 0, 0);

        Team_2_Player_1.setPlayerButton((Button) rootView.findViewById(R.id.volleyballTeam_2_Player_1_Button));
        Team_2_Player_1.setPlayerRecord_1_Button((Button) rootView.findViewById(R.id.volleyballTeam_2_Player_1_Record_1_Button));
        Team_2_Player_1.setPlayerRecord_2_Button((Button) rootView.findViewById(R.id.volleyballTeam_2_Player_1_Record_2_Button));

        Player Team_2_Player_2 = new Player(Team_2.getName(),
                getString(R.string.volleyball_team_2_player_2), 0, 0);

        Team_2_Player_2.setPlayerButton((Button) rootView.findViewById(R.id.volleyballTeam_2_Player_2_Button));
        Team_2_Player_2.setPlayerRecord_1_Button((Button) rootView.findViewById(R.id.volleyballTeam_2_Player_2_Record_1_Button));
        Team_2_Player_2.setPlayerRecord_2_Button((Button) rootView.findViewById(R.id.volleyballTeam_2_Player_2_Record_2_Button));

        Player Team_2_Player_3 = new Player(Team_2.getName(),
                getString(R.string.volleyball_team_2_player_3), 0, 0);

        Team_2_Player_3.setPlayerButton((Button) rootView.findViewById(R.id.volleyballTeam_2_Player_3_Button));
        Team_2_Player_3.setPlayerRecord_1_Button((Button) rootView.findViewById(R.id.volleyballTeam_2_Player_3_Record_1_Button));
        Team_2_Player_3.setPlayerRecord_2_Button((Button) rootView.findViewById(R.id.volleyballTeam_2_Player_3_Record_2_Button));

        Player Team_2_Player_4 = new Player(Team_2.getName(),
                getString(R.string.volleyball_team_2_player_4), 0, 0);

        Team_2_Player_4.setPlayerButton((Button) rootView.findViewById(R.id.volleyballTeam_2_Player_4_Button));
        Team_2_Player_4.setPlayerRecord_1_Button((Button) rootView.findViewById(R.id.volleyballTeam_2_Player_4_Record_1_Button));
        Team_2_Player_4.setPlayerRecord_2_Button((Button) rootView.findViewById(R.id.volleyballTeam_2_Player_4_Record_2_Button));

        Player Team_2_Player_5 = new Player(Team_2.getName(),
                getString(R.string.volleyball_team_2_player_5), 0, 0);

        Team_2_Player_5.setPlayerButton((Button) rootView.findViewById(R.id.volleyballTeam_2_Player_5_Button));
        Team_2_Player_5.setPlayerRecord_1_Button((Button) rootView.findViewById(R.id.volleyballTeam_2_Player_5_Record_1_Button));
        Team_2_Player_5.setPlayerRecord_2_Button((Button) rootView.findViewById(R.id.volleyballTeam_2_Player_5_Record_2_Button));

        ArrayList<Player> Team_2_Players = new ArrayList<>();
        Team_2_Players.add(Team_2_Player_1);
        Team_2_Players.add(Team_2_Player_2);
        Team_2_Players.add(Team_2_Player_3);
        Team_2_Players.add(Team_2_Player_4);
        Team_2_Players.add(Team_2_Player_5);

        Team_2.setPlayers(Team_2_Players);

        // Show/hide players and reset buttons
        final Button showHideButton = rootView.findViewById(R.id.volleyballShowHidePlayersButton);
        Button resetButton = rootView.findViewById(R.id.volleyballResetButton);

        // Players linear layout
        final LinearLayout playersLinearLayout = rootView.findViewById(R.id.volleyballPlayersLinearLayout);
        playersLinearLayout.setVisibility(View.GONE);

        final ArrayList<Button> Team_1_Buttons = new ArrayList<>();
        Team_1_Buttons.add(Team_1.getStatistic_1_Button());
        Team_1_Buttons.add(Team_1.getStatistic_2_Button());
        Team_1_Buttons.add(Team_1.getStatistic_3_Button());

        final ArrayList<Button> Team_2_Buttons = new ArrayList<>();
        Team_2_Buttons.add(Team_2.getStatistic_1_Button());
        Team_2_Buttons.add(Team_2.getStatistic_2_Button());
        Team_2_Buttons.add(Team_2.getStatistic_3_Button());

        TextView textView;
        if (savedInstanceState != null) {
            for (String key : savedInstanceState.keySet()) {
                if (!key.equals("android:view_state") && !key.equals("android:user_visible_hint")) {
                    savedValues.put(key, savedInstanceState.getString(key));
                    textView = rootView.findViewById(Integer.parseInt(key));
                    textView.setText(savedInstanceState.getString(key));
                }
            }
        }

        //Defining onClickListeners
        View.OnClickListener plusOneOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView countTextView = rootView.findViewById(view.getNextFocusForwardId());
                int count = Integer.parseInt(countTextView.getText().toString());
                count++;
                countTextView.setText(String.valueOf(count));
                savedValues.put(String.valueOf(view.getNextFocusForwardId()), (String.valueOf(count)));

                if (view.getId() == R.id.volleyballTeam_1_PointButton) {
                    TextView volleyballTeam_1_ScoreTextView = rootView.findViewById(R.id.volleyballTeam_1_Score);
                    int score = Integer.parseInt(volleyballTeam_1_ScoreTextView.getText().toString());
                    score++;
                    volleyballTeam_1_ScoreTextView.setText(String.valueOf(score));
                    savedValues.put(String.valueOf(volleyballTeam_1_ScoreTextView.getId()), (String.valueOf(score)));
                }
                if (view.getId() == R.id.volleyballTeam_2_PointButton) {
                    TextView volleyballTeam_2_ScoreTextView = rootView.findViewById(R.id.volleyballTeam_2_Score);
                    int score = Integer.parseInt(volleyballTeam_2_ScoreTextView.getText().toString());
                    score++;
                    volleyballTeam_2_ScoreTextView.setText(String.valueOf(score));
                    savedValues.put(String.valueOf(volleyballTeam_2_ScoreTextView.getId()), (String.valueOf(score)));
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
                if (playersLinearLayout.getVisibility() == View.GONE) {
                    showHideButton.setText(R.string.hide_players);
                    playersLinearLayout.setVisibility(View.VISIBLE);
                } else {
                    showHideButton.setText(R.string.show_players);
                    playersLinearLayout.setVisibility(View.GONE);
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

                TextView scoreTextView = rootView.findViewById(R.id.volleyballTeam_1_Score);
                scoreTextView.setText("0");
                scoreTextView = rootView.findViewById(R.id.volleyballTeam_2_Score);
                scoreTextView.setText("0");
                savedValues.clear();
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

    @Override
    public void onResume() {
        super.onResume();
        TextView textView;
        for (String key : savedValues.keySet()) {
            savedValues.put(key, savedValues.get(key));
            textView = rootView.findViewById(Integer.parseInt(key));
            textView.setText(savedValues.get(key));
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        for (String key : savedValues.keySet()) {
            outState.putString(key, savedValues.get(key));
        }
    }
}
