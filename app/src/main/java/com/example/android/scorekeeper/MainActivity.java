package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import static com.example.android.scorekeeper.R.id.stegenButton;

public class MainActivity extends AppCompatActivity {

    int realGoals = 0;
    int barcelonaGoals = 0;

    int realFouls = 0;
    int barcelonaFouls = 0;

    int realYellowCards = 0;
    int barcelonaYellowCards = 0;

    int realRedCards = 0;
    int barcelonaRedCards = 0;

    int realOffsides = 0;
    int barcelonaOffsides = 0;

    int realCornerKicks = 0;
    int barcelonaCornerKicks = 0;

    int realSaves = 0;
    int barcelonaSaves = 0;

    int stegenGoals = 0;
    int stegenAssists = 0;

    int navasGoals = 0;
    int navasAssists = 0;

    int hernandezGoals = 0;
    int hernandezAssists = 0;

    int semedoGoals = 0;
    int semedoAssists = 0;

    int ramosGoals = 0;
    int ramosAssists = 0;

    int nachoGoals = 0;
    int nachoAssists = 0;

    int piqueGoals = 0;
    int piqueAssists = 0;

    int umtitiGoals = 0;
    int umtitiAssists = 0;

    int carvajalGoals = 0;
    int carvajalAssists = 0;

    int kovacicGoals = 0;
    int kovacicAssists = 0;

    int albaGoals = 0;
    int albaAssists = 0;

    int busquetsGoals = 0;
    int busquetsAssists = 0;

    int ceballosGoals = 0;
    int ceballosAssists = 0;

    int rakiticGoals = 0;
    int rakiticAssists = 0;

    int modricGoals = 0;
    int modricAssists = 0;

    int denis_suarezGoals = 0;
    int denis_suarezAssists = 0;

    int asensioGoals = 0;
    int asensioAssists = 0;

    int messiGoals = 0;
    int messiAssists = 0;

    int benzemaGoals = 0;
    int benzemaAssists = 0;

    int suarezGoals = 0;
    int suarezAssists = 0;

    int baleGoals = 0;
    int baleAssists = 0;

    int deulofeuGoals = 0;
    int deulofeuAssists = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hideAll();

    }

    public void realGoal(View view) {
        TextView textView = (TextView) findViewById(R.id.realGoals);
        realGoals++;
        textView.setText("" + realGoals);
    }

    public void barcelonaGoal(View view) {
        TextView textView = (TextView) findViewById(R.id.barcelonaGoals);
        barcelonaGoals++;
        textView.setText("" + barcelonaGoals);
    }

    public void realFoul(View view) {
        TextView textView = (TextView) findViewById(R.id.realFouls);
        realFouls++;
        textView.setText("" + realFouls);
    }

    public void barcelonaFoul(View view) {
        TextView textView = (TextView) findViewById(R.id.barcelonaFouls);
        barcelonaFouls++;
        textView.setText("" + barcelonaFouls);
    }

    public void realYellowCard(View view) {
        TextView textView = (TextView) findViewById(R.id.realYellowCards);
        realYellowCards++;
        textView.setText("" + realYellowCards);
    }

    public void barcelonaYellowCard(View view) {
        TextView textView = (TextView) findViewById(R.id.barcelonaYellowCards);
        barcelonaYellowCards++;
        textView.setText("" + barcelonaYellowCards);
    }

    public void realRedCard(View view) {
        TextView textView = (TextView) findViewById(R.id.realRedCards);
        realRedCards++;
        textView.setText("" + realRedCards);
    }

    public void barcelonaRedCard(View view) {
        TextView textView = (TextView) findViewById(R.id.barcelonaRedCards);
        barcelonaRedCards++;
        textView.setText("" + barcelonaRedCards);
    }

    public void realOffside(View view) {
        TextView textView = (TextView) findViewById(R.id.realOffsides);
        realOffsides++;
        textView.setText("" + realOffsides);
    }

    public void barcelonaOffside(View view) {
        TextView textView = (TextView) findViewById(R.id.barcelonaOffsides);
        barcelonaOffsides++;
        textView.setText("" + barcelonaOffsides);
    }

    public void realCornerKick(View view) {
        TextView textView = (TextView) findViewById(R.id.realCornerKicks);
        realCornerKicks++;
        textView.setText("" + realCornerKicks);
    }

    public void barcelonaCornerKick(View view) {
        TextView textView = (TextView) findViewById(R.id.barcelonaCornerKicks);
        barcelonaCornerKicks++;
        textView.setText("" + barcelonaCornerKicks);
    }

    public void realSave(View view) {
        TextView textView = (TextView) findViewById(R.id.realSaves);
        realSaves++;
        textView.setText("" + realSaves);
    }

    public void barcelonaSave(View view) {
        TextView textView = (TextView) findViewById(R.id.barcelonaSaves);
        barcelonaSaves++;
        textView.setText("" + barcelonaSaves);
    }

    public void showPlayers(View view) {
        Button b = (Button) findViewById(R.id.stegenButton);
        if (b.getVisibility() == View.GONE) {
            b.setVisibility(View.VISIBLE);
        } else {
            b.setVisibility(View.GONE);
        }

        b = (Button) findViewById(R.id.navasButton);
        if (b.getVisibility() == View.GONE) {
            b.setVisibility(View.VISIBLE);
        } else {
            b.setVisibility(View.GONE);
        }

        b = (Button) findViewById(R.id.hernandezButton);
        if (b.getVisibility() == View.GONE) {
            b.setVisibility(View.VISIBLE);
        } else {
            b.setVisibility(View.GONE);
        }

        b = (Button) findViewById(R.id.semedoButton);
        if (b.getVisibility() == View.GONE) {
            b.setVisibility(View.VISIBLE);
        } else {
            b.setVisibility(View.GONE);
        }

        b = (Button) findViewById(R.id.ramosButton);
        if (b.getVisibility() == View.GONE) {
            b.setVisibility(View.VISIBLE);
        } else {
            b.setVisibility(View.GONE);
        }

        b = (Button) findViewById(R.id.piqueButton);
        if (b.getVisibility() == View.GONE) {
            b.setVisibility(View.VISIBLE);
        } else {
            b.setVisibility(View.GONE);
        }

        b = (Button) findViewById(R.id.nachoButton);
        if (b.getVisibility() == View.GONE) {
            b.setVisibility(View.VISIBLE);
        } else {
            b.setVisibility(View.GONE);
        }

        b = (Button) findViewById(R.id.umtitiButton);
        if (b.getVisibility() == View.GONE) {
            b.setVisibility(View.VISIBLE);
        } else {
            b.setVisibility(View.GONE);
        }

        b = (Button) findViewById(R.id.carvajalButton);
        if (b.getVisibility() == View.GONE) {
            b.setVisibility(View.VISIBLE);
        } else {
            b.setVisibility(View.GONE);
        }

        b = (Button) findViewById(R.id.albaButton);
        if (b.getVisibility() == View.GONE) {
            b.setVisibility(View.VISIBLE);
        } else {
            b.setVisibility(View.GONE);
        }

        b = (Button) findViewById(R.id.kovacicButton);
        if (b.getVisibility() == View.GONE) {
            b.setVisibility(View.VISIBLE);
        } else {
            b.setVisibility(View.GONE);
        }

        b = (Button) findViewById(R.id.busquetsButton);
        if (b.getVisibility() == View.GONE) {
            b.setVisibility(View.VISIBLE);
        } else {
            b.setVisibility(View.GONE);
        }

        b = (Button) findViewById(R.id.ceballosButton);
        if (b.getVisibility() == View.GONE) {
            b.setVisibility(View.VISIBLE);
        } else {
            b.setVisibility(View.GONE);
        }

        b = (Button) findViewById(R.id.rakiticButton);
        if (b.getVisibility() == View.GONE) {
            b.setVisibility(View.VISIBLE);
        } else {
            b.setVisibility(View.GONE);
        }

        b = (Button) findViewById(R.id.modricButton);
        if (b.getVisibility() == View.GONE) {
            b.setVisibility(View.VISIBLE);
        } else {
            b.setVisibility(View.GONE);
        }

        b = (Button) findViewById(R.id.denis_suarezButton);
        if (b.getVisibility() == View.GONE) {
            b.setVisibility(View.VISIBLE);
        } else {
            b.setVisibility(View.GONE);
        }

        b = (Button) findViewById(R.id.asensioButton);
        if (b.getVisibility() == View.GONE) {
            b.setVisibility(View.VISIBLE);
        } else {
            b.setVisibility(View.GONE);
        }

        b = (Button) findViewById(R.id.messiButton);
        if (b.getVisibility() == View.GONE) {
            b.setVisibility(View.VISIBLE);
        } else {
            b.setVisibility(View.GONE);
        }

        b = (Button) findViewById(R.id.benzemaButton);
        if (b.getVisibility() == View.GONE) {
            b.setVisibility(View.VISIBLE);
        } else {
            b.setVisibility(View.GONE);
        }

        b = (Button) findViewById(R.id.suarezButton);
        if (b.getVisibility() == View.GONE) {
            b.setVisibility(View.VISIBLE);
        } else {
            b.setVisibility(View.GONE);
        }

        b = (Button) findViewById(R.id.baleButton);
        if (b.getVisibility() == View.GONE) {
            b.setVisibility(View.VISIBLE);
        } else {
            b.setVisibility(View.GONE);
        }

        b = (Button) findViewById(R.id.deulofeuButton);
        if (b.getVisibility() == View.GONE) {
            b.setVisibility(View.VISIBLE);
        } else {
            b.setVisibility(View.GONE);
        }

        LinearLayout ll = (LinearLayout) findViewById(R.id.stegen);
        ll.setVisibility(View.GONE);

        ll = (LinearLayout) findViewById(R.id.navas);
        ll.setVisibility(View.GONE);

        ll = (LinearLayout) findViewById(R.id.hernandez);
        ll.setVisibility(View.GONE);

        ll = (LinearLayout) findViewById(R.id.semedo);
        ll.setVisibility(View.GONE);

        ll = (LinearLayout) findViewById(R.id.ramos);
        ll.setVisibility(View.GONE);

        ll = (LinearLayout) findViewById(R.id.pique);
        ll.setVisibility(View.GONE);

        ll = (LinearLayout) findViewById(R.id.nacho);
        ll.setVisibility(View.GONE);

        ll = (LinearLayout) findViewById(R.id.umtiti);
        ll.setVisibility(View.GONE);

        ll = (LinearLayout) findViewById(R.id.carvajal);
        ll.setVisibility(View.GONE);

        ll = (LinearLayout) findViewById(R.id.alba);
        ll.setVisibility(View.GONE);

        ll = (LinearLayout) findViewById(R.id.kovacic);
        ll.setVisibility(View.GONE);

        ll = (LinearLayout) findViewById(R.id.busquets);
        ll.setVisibility(View.GONE);

        ll = (LinearLayout) findViewById(R.id.ceballos);
        ll.setVisibility(View.GONE);

        ll = (LinearLayout) findViewById(R.id.rakitic);
        ll.setVisibility(View.GONE);

        ll = (LinearLayout) findViewById(R.id.modric);
        ll.setVisibility(View.GONE);

        ll = (LinearLayout) findViewById(R.id.denis_suarez);
        ll.setVisibility(View.GONE);

        ll = (LinearLayout) findViewById(R.id.asensio);
        ll.setVisibility(View.GONE);

        ll = (LinearLayout) findViewById(R.id.messi);
        ll.setVisibility(View.GONE);

        ll = (LinearLayout) findViewById(R.id.benzema);
        ll.setVisibility(View.GONE);

        ll = (LinearLayout) findViewById(R.id.suarez);
        ll.setVisibility(View.GONE);

        ll = (LinearLayout) findViewById(R.id.bale);
        ll.setVisibility(View.GONE);

        ll = (LinearLayout) findViewById(R.id.deulofeu);
        ll.setVisibility(View.GONE);
    }

    public void hideAll() {
        Button bb = (Button) findViewById(stegenButton);
        bb.setVisibility(View.GONE);

        bb = (Button) findViewById(R.id.navasButton);
        bb.setVisibility(View.GONE);

        bb = (Button) findViewById(R.id.hernandezButton);
        bb.setVisibility(View.GONE);

        bb = (Button) findViewById(R.id.semedoButton);
        bb.setVisibility(View.GONE);

        bb = (Button) findViewById(R.id.ramosButton);
        bb.setVisibility(View.GONE);

        bb = (Button) findViewById(R.id.piqueButton);
        bb.setVisibility(View.GONE);

        bb = (Button) findViewById(R.id.nachoButton);
        bb.setVisibility(View.GONE);

        bb = (Button) findViewById(R.id.umtitiButton);
        bb.setVisibility(View.GONE);

        bb = (Button) findViewById(R.id.carvajalButton);
        bb.setVisibility(View.GONE);

        bb = (Button) findViewById(R.id.albaButton);
        bb.setVisibility(View.GONE);

        bb = (Button) findViewById(R.id.kovacicButton);
        bb.setVisibility(View.GONE);

        bb = (Button) findViewById(R.id.busquetsButton);
        bb.setVisibility(View.GONE);

        bb = (Button) findViewById(R.id.ceballosButton);
        bb.setVisibility(View.GONE);

        bb = (Button) findViewById(R.id.rakiticButton);
        bb.setVisibility(View.GONE);

        bb = (Button) findViewById(R.id.modricButton);
        bb.setVisibility(View.GONE);

        bb = (Button) findViewById(R.id.denis_suarezButton);
        bb.setVisibility(View.GONE);

        bb = (Button) findViewById(R.id.asensioButton);
        bb.setVisibility(View.GONE);

        bb = (Button) findViewById(R.id.messiButton);
        bb.setVisibility(View.GONE);

        bb = (Button) findViewById(R.id.benzemaButton);
        bb.setVisibility(View.GONE);

        bb = (Button) findViewById(R.id.suarezButton);
        bb.setVisibility(View.GONE);

        bb = (Button) findViewById(R.id.baleButton);
        bb.setVisibility(View.GONE);

        bb = (Button) findViewById(R.id.deulofeuButton);
        bb.setVisibility(View.GONE);

        LinearLayout ll = (LinearLayout) findViewById(R.id.stegen);
        ll.setVisibility(View.GONE);

        ll = (LinearLayout) findViewById(R.id.navas);
        ll.setVisibility(View.GONE);

        ll = (LinearLayout) findViewById(R.id.hernandez);
        ll.setVisibility(View.GONE);

        ll = (LinearLayout) findViewById(R.id.semedo);
        ll.setVisibility(View.GONE);

        ll = (LinearLayout) findViewById(R.id.ramos);
        ll.setVisibility(View.GONE);

        ll = (LinearLayout) findViewById(R.id.pique);
        ll.setVisibility(View.GONE);

        ll = (LinearLayout) findViewById(R.id.nacho);
        ll.setVisibility(View.GONE);

        ll = (LinearLayout) findViewById(R.id.umtiti);
        ll.setVisibility(View.GONE);

        ll = (LinearLayout) findViewById(R.id.carvajal);
        ll.setVisibility(View.GONE);

        ll = (LinearLayout) findViewById(R.id.alba);
        ll.setVisibility(View.GONE);

        ll = (LinearLayout) findViewById(R.id.kovacic);
        ll.setVisibility(View.GONE);

        ll = (LinearLayout) findViewById(R.id.busquets);
        ll.setVisibility(View.GONE);

        ll = (LinearLayout) findViewById(R.id.ceballos);
        ll.setVisibility(View.GONE);

        ll = (LinearLayout) findViewById(R.id.rakitic);
        ll.setVisibility(View.GONE);

        ll = (LinearLayout) findViewById(R.id.modric);
        ll.setVisibility(View.GONE);

        ll = (LinearLayout) findViewById(R.id.denis_suarez);
        ll.setVisibility(View.GONE);

        ll = (LinearLayout) findViewById(R.id.asensio);
        ll.setVisibility(View.GONE);

        ll = (LinearLayout) findViewById(R.id.messi);
        ll.setVisibility(View.GONE);

        ll = (LinearLayout) findViewById(R.id.benzema);
        ll.setVisibility(View.GONE);

        ll = (LinearLayout) findViewById(R.id.suarez);
        ll.setVisibility(View.GONE);

        ll = (LinearLayout) findViewById(R.id.bale);
        ll.setVisibility(View.GONE);

        ll = (LinearLayout) findViewById(R.id.deulofeu);
        ll.setVisibility(View.GONE);
    }

    public void stegen(View view) {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.stegen);
        if (linearLayout.getVisibility() == View.GONE) {
            linearLayout.setVisibility(View.VISIBLE);
        } else {
            linearLayout.setVisibility(View.GONE);
        }
    }

    public void navas(View view) {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.navas);
        if (linearLayout.getVisibility() == View.GONE) {
            linearLayout.setVisibility(View.VISIBLE);
        } else {
            linearLayout.setVisibility(View.GONE);
        }
    }

    public void hernandez(View view) {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.hernandez);
        if (linearLayout.getVisibility() == View.GONE) {
            linearLayout.setVisibility(View.VISIBLE);
        } else {
            linearLayout.setVisibility(View.GONE);
        }
    }

    public void semedo(View view) {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.semedo);
        if (linearLayout.getVisibility() == View.GONE) {
            linearLayout.setVisibility(View.VISIBLE);
        } else {
            linearLayout.setVisibility(View.GONE);
        }
    }

    public void ramos(View view) {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.ramos);
        if (linearLayout.getVisibility() == View.GONE) {
            linearLayout.setVisibility(View.VISIBLE);
        } else {
            linearLayout.setVisibility(View.GONE);
        }
    }

    public void pique(View view) {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.pique);
        if (linearLayout.getVisibility() == View.GONE) {
            linearLayout.setVisibility(View.VISIBLE);
        } else {
            linearLayout.setVisibility(View.GONE);
        }
    }

    public void nacho(View view) {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.nacho);
        if (linearLayout.getVisibility() == View.GONE) {
            linearLayout.setVisibility(View.VISIBLE);
        } else {
            linearLayout.setVisibility(View.GONE);
        }
    }

    public void umtiti(View view) {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.umtiti);
        if (linearLayout.getVisibility() == View.GONE) {
            linearLayout.setVisibility(View.VISIBLE);
        } else {
            linearLayout.setVisibility(View.GONE);
        }
    }

    public void carvajal(View view) {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.carvajal);
        if (linearLayout.getVisibility() == View.GONE) {
            linearLayout.setVisibility(View.VISIBLE);
        } else {
            linearLayout.setVisibility(View.GONE);
        }
    }

    public void alba(View view) {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.alba);
        if (linearLayout.getVisibility() == View.GONE) {
            linearLayout.setVisibility(View.VISIBLE);
        } else {
            linearLayout.setVisibility(View.GONE);
        }
    }

    public void kovacic(View view) {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.kovacic);
        if (linearLayout.getVisibility() == View.GONE) {
            linearLayout.setVisibility(View.VISIBLE);
        } else {
            linearLayout.setVisibility(View.GONE);
        }
    }

    public void busquets(View view) {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.busquets);
        if (linearLayout.getVisibility() == View.GONE) {
            linearLayout.setVisibility(View.VISIBLE);
        } else {
            linearLayout.setVisibility(View.GONE);
        }
    }

    public void ceballos(View view) {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.ceballos);
        if (linearLayout.getVisibility() == View.GONE) {
            linearLayout.setVisibility(View.VISIBLE);
        } else {
            linearLayout.setVisibility(View.GONE);
        }
    }

    public void rakitic(View view) {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.rakitic);
        if (linearLayout.getVisibility() == View.GONE) {
            linearLayout.setVisibility(View.VISIBLE);
        } else {
            linearLayout.setVisibility(View.GONE);
        }
    }

    public void modric(View view) {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.modric);
        if (linearLayout.getVisibility() == View.GONE) {
            linearLayout.setVisibility(View.VISIBLE);
        } else {
            linearLayout.setVisibility(View.GONE);
        }
    }

    public void denis_suarez(View view) {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.denis_suarez);
        if (linearLayout.getVisibility() == View.GONE) {
            linearLayout.setVisibility(View.VISIBLE);
        } else {
            linearLayout.setVisibility(View.GONE);
        }
    }

    public void asensio(View view) {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.asensio);
        if (linearLayout.getVisibility() == View.GONE) {
            linearLayout.setVisibility(View.VISIBLE);
        } else {
            linearLayout.setVisibility(View.GONE);
        }
    }

    public void messi(View view) {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.messi);
        if (linearLayout.getVisibility() == View.GONE) {
            linearLayout.setVisibility(View.VISIBLE);
        } else {
            linearLayout.setVisibility(View.GONE);
        }
    }

    public void benzema(View view) {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.benzema);
        if (linearLayout.getVisibility() == View.GONE) {
            linearLayout.setVisibility(View.VISIBLE);
        } else {
            linearLayout.setVisibility(View.GONE);
        }
    }

    public void suarez(View view) {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.suarez);
        if (linearLayout.getVisibility() == View.GONE) {
            linearLayout.setVisibility(View.VISIBLE);
        } else {
            linearLayout.setVisibility(View.GONE);
        }
    }

    public void bale(View view) {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.bale);
        if (linearLayout.getVisibility() == View.GONE) {
            linearLayout.setVisibility(View.VISIBLE);
        } else {
            linearLayout.setVisibility(View.GONE);
        }
    }

    public void deulofeu(View view) {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.deulofeu);
        if (linearLayout.getVisibility() == View.GONE) {
            linearLayout.setVisibility(View.VISIBLE);
        } else {
            linearLayout.setVisibility(View.GONE);
        }
    }

    public void stegenGoal(View view) {
        TextView tv = (TextView) findViewById(R.id.stegenGoals);
        stegenGoals++;
        tv.setText("" + stegenGoals);
    }

    public void stegenAssist(View view) {
        TextView tv = (TextView) findViewById(R.id.stegenAssists);
        stegenAssists++;
        tv.setText("" + stegenAssists);
    }

    public void navasGoal(View view) {
        TextView tv = (TextView) findViewById(R.id.navasGoals);
        navasGoals++;
        tv.setText("" + navasGoals);
    }

    public void navasAssist(View view) {
        TextView tv = (TextView) findViewById(R.id.navasAssists);
        navasAssists++;
        tv.setText("" + navasAssists);
    }

    public void hernandezGoal(View view) {
        TextView tv = (TextView) findViewById(R.id.hernandezGoals);
        hernandezGoals++;
        tv.setText("" + hernandezGoals);
    }

    public void hernandezAssist(View view) {
        TextView tv = (TextView) findViewById(R.id.hernandezAssists);
        hernandezAssists++;
        tv.setText("" + hernandezAssists);
    }

    public void semedoGoal(View view) {
        TextView tv = (TextView) findViewById(R.id.semedoGoals);
        semedoGoals++;
        tv.setText("" + semedoGoals);
    }

    public void semedoAssist(View view) {
        TextView tv = (TextView) findViewById(R.id.semedoAssists);
        semedoAssists++;
        tv.setText("" + semedoAssists);
    }

    public void ramosGoal(View view) {
        TextView tv = (TextView) findViewById(R.id.ramosGoals);
        ramosGoals++;
        tv.setText("" + ramosGoals);
    }

    public void ramosAssist(View view) {
        TextView tv = (TextView) findViewById(R.id.ramosAssists);
        ramosAssists++;
        tv.setText("" + ramosAssists);
    }

    public void piqueGoal(View view) {
        TextView tv = (TextView) findViewById(R.id.piqueGoals);
        piqueGoals++;
        tv.setText("" + piqueGoals);
    }

    public void piqueAssist(View view) {
        TextView tv = (TextView) findViewById(R.id.piqueAssists);
        piqueAssists++;
        tv.setText("" + piqueAssists);
    }

    public void nachoGoal(View view) {
        TextView tv = (TextView) findViewById(R.id.nachoGoals);
        nachoGoals++;
        tv.setText("" + nachoGoals);
    }

    public void nachoAssist(View view) {
        TextView tv = (TextView) findViewById(R.id.nachoAssists);
        nachoAssists++;
        tv.setText("" + nachoAssists);
    }

    public void umtitiGoal(View view) {
        TextView tv = (TextView) findViewById(R.id.umtitiGoals);
        umtitiGoals++;
        tv.setText("" + umtitiGoals);
    }

    public void umtitiAssist(View view) {
        TextView tv = (TextView) findViewById(R.id.umtitiAssists);
        umtitiAssists++;
        tv.setText("" + umtitiAssists);
    }

    public void carvajalGoal(View view) {
        TextView tv = (TextView) findViewById(R.id.carvajalGoals);
        carvajalGoals++;
        tv.setText("" + carvajalGoals);
    }

    public void carvajalAssist(View view) {
        TextView tv = (TextView) findViewById(R.id.carvajalAssists);
        carvajalAssists++;
        tv.setText("" + carvajalAssists);
    }

    public void albaGoal(View view) {
        TextView tv = (TextView) findViewById(R.id.albaGoals);
        albaGoals++;
        tv.setText("" + albaGoals);
    }

    public void albaAssist(View view) {
        TextView tv = (TextView) findViewById(R.id.albaAssists);
        albaAssists++;
        tv.setText("" + albaAssists);
    }

    public void kovacicGoal(View view) {
        TextView tv = (TextView) findViewById(R.id.kovacicGoals);
        kovacicGoals++;
        tv.setText("" + kovacicGoals);
    }

    public void kovacicAssist(View view) {
        TextView tv = (TextView) findViewById(R.id.kovacicAssists);
        kovacicAssists++;
        tv.setText("" + kovacicAssists);
    }

    public void busquetsGoal(View view) {
        TextView tv = (TextView) findViewById(R.id.busquetsGoals);
        busquetsGoals++;
        tv.setText("" + busquetsGoals);
    }

    public void busquetsAssist(View view) {
        TextView tv = (TextView) findViewById(R.id.busquetsAssists);
        busquetsAssists++;
        tv.setText("" + busquetsAssists);
    }

    public void ceballosGoal(View view) {
        TextView tv = (TextView) findViewById(R.id.ceballosGoals);
        ceballosGoals++;
        tv.setText("" + ceballosGoals);
    }

    public void ceballosAssist(View view) {
        TextView tv = (TextView) findViewById(R.id.ceballosAssists);
        ceballosAssists++;
        tv.setText("" + ceballosAssists);
    }

    public void rakiticGoal(View view) {
        TextView tv = (TextView) findViewById(R.id.rakiticGoals);
        rakiticGoals++;
        tv.setText("" + rakiticGoals);
    }

    public void rakiticAssist(View view) {
        TextView tv = (TextView) findViewById(R.id.rakiticAssists);
        rakiticAssists++;
        tv.setText("" + rakiticAssists);
    }

    public void modricGoal(View view) {
        TextView tv = (TextView) findViewById(R.id.modricGoals);
        modricGoals++;
        tv.setText("" + modricGoals);
    }

    public void modricAssist(View view) {
        TextView tv = (TextView) findViewById(R.id.modricAssists);
        modricAssists++;
        tv.setText("" + modricAssists);
    }

    public void denis_suarezGoal(View view) {
        TextView tv = (TextView) findViewById(R.id.denis_suarezGoals);
        denis_suarezGoals++;
        tv.setText("" + denis_suarezGoals);
    }

    public void denis_suarezAssist(View view) {
        TextView tv = (TextView) findViewById(R.id.denis_suarezAssists);
        denis_suarezAssists++;
        tv.setText("" + denis_suarezAssists);
    }

    public void asensioGoal(View view) {
        TextView tv = (TextView) findViewById(R.id.asensioGoals);
        asensioGoals++;
        tv.setText("" + asensioGoals);
    }

    public void asensioAssist(View view) {
        TextView tv = (TextView) findViewById(R.id.asensioAssists);
        asensioAssists++;
        tv.setText("" + asensioAssists);
    }

    public void messiGoal(View view) {
        TextView tv = (TextView) findViewById(R.id.messiGoals);
        messiGoals++;
        tv.setText("" + messiGoals);
    }

    public void messiAssist(View view) {
        TextView tv = (TextView) findViewById(R.id.messiAssists);
        messiAssists++;
        tv.setText("" + messiAssists);
    }

    public void benzemaGoal(View view) {
        TextView tv = (TextView) findViewById(R.id.benzemaGoals);
        benzemaGoals++;
        tv.setText("" + benzemaGoals);
    }

    public void benzemaAssist(View view) {
        TextView tv = (TextView) findViewById(R.id.benzemaAssists);
        benzemaAssists++;
        tv.setText("" + benzemaAssists);
    }

    public void suarezGoal(View view) {
        TextView tv = (TextView) findViewById(R.id.suarezGoals);
        suarezGoals++;
        tv.setText("" + suarezGoals);
    }

    public void suarezAssist(View view) {
        TextView tv = (TextView) findViewById(R.id.suarezAssists);
        suarezAssists++;
        tv.setText("" + suarezAssists);
    }

    public void baleGoal(View view) {
        TextView tv = (TextView) findViewById(R.id.baleGoals);
        baleGoals++;
        tv.setText("" + baleGoals);
    }

    public void baleAssist(View view) {
        TextView tv = (TextView) findViewById(R.id.baleAssists);
        baleAssists++;
        tv.setText("" + baleAssists);
    }

    public void deulofeuGoal(View view) {
        TextView tv = (TextView) findViewById(R.id.deulofeuGoals);
        deulofeuGoals++;
        tv.setText("" + deulofeuGoals);
    }

    public void deulofeuAssist(View view) {
        TextView tv = (TextView) findViewById(R.id.deulofeuAssists);
        deulofeuAssists++;
        tv.setText("" + deulofeuAssists);
    }

    public void reset(View view) {
        realGoals = 0;
        TextView tv = (TextView) findViewById(R.id.realGoals);
        tv.setText("0");

        barcelonaGoals = 0;
        tv = (TextView) findViewById(R.id.barcelonaGoals);
        tv.setText("0");

        realFouls = 0;
        tv = (TextView) findViewById(R.id.realFouls);
        tv.setText("0");

        barcelonaFouls = 0;
        tv = (TextView) findViewById(R.id.barcelonaFouls);
        tv.setText("0");

        realYellowCards = 0;
        tv = (TextView) findViewById(R.id.realYellowCards);
        tv.setText("0");

        barcelonaYellowCards = 0;
        tv = (TextView) findViewById(R.id.barcelonaYellowCards);
        tv.setText("0");

        realRedCards = 0;
        tv = (TextView) findViewById(R.id.realRedCards);
        tv.setText("0");

        barcelonaRedCards = 0;
        tv = (TextView) findViewById(R.id.barcelonaRedCards);
        tv.setText("0");

        realOffsides = 0;
        tv = (TextView) findViewById(R.id.realOffsides);
        tv.setText("0");

        barcelonaOffsides = 0;
        tv = (TextView) findViewById(R.id.barcelonaOffsides);
        tv.setText("0");

        realCornerKicks = 0;
        tv = (TextView) findViewById(R.id.realCornerKicks);
        tv.setText("0");

        barcelonaCornerKicks = 0;
        tv = (TextView) findViewById(R.id.barcelonaCornerKicks);
        tv.setText("0");

        realSaves = 0;
        tv = (TextView) findViewById(R.id.realSaves);
        tv.setText("0");

        barcelonaSaves = 0;
        tv = (TextView) findViewById(R.id.barcelonaSaves);
        tv.setText("0");

        stegenGoals = 0;
        tv = (TextView) findViewById(R.id.stegenGoals);
        tv.setText("0");

        stegenAssists = 0;
        tv = (TextView) findViewById(R.id.stegenAssists);
        tv.setText("0");

        navasGoals = 0;
        tv = (TextView) findViewById(R.id.navasGoals);
        tv.setText("0");

        navasAssists = 0;
        tv = (TextView) findViewById(R.id.navasAssists);
        tv.setText("0");

        hernandezGoals = 0;
        tv = (TextView) findViewById(R.id.hernandezGoals);
        tv.setText("0");

        hernandezAssists = 0;
        tv = (TextView) findViewById(R.id.hernandezAssists);
        tv.setText("0");

        semedoGoals = 0;
        tv = (TextView) findViewById(R.id.semedoGoals);
        tv.setText("0");

        semedoAssists = 0;
        tv = (TextView) findViewById(R.id.semedoAssists);
        tv.setText("0");

        ramosGoals = 0;
        tv = (TextView) findViewById(R.id.ramosGoals);
        tv.setText("0");

        ramosAssists = 0;
        tv = (TextView) findViewById(R.id.ramosAssists);
        tv.setText("0");

        nachoGoals = 0;
        tv = (TextView) findViewById(R.id.nachoGoals);
        tv.setText("0");

        nachoAssists = 0;
        tv = (TextView) findViewById(R.id.nachoAssists);
        tv.setText("0");

        piqueGoals = 0;
        tv = (TextView) findViewById(R.id.piqueGoals);
        tv.setText("0");

        piqueAssists = 0;
        tv = (TextView) findViewById(R.id.piqueAssists);
        tv.setText("0");

        umtitiGoals = 0;
        tv = (TextView) findViewById(R.id.umtitiGoals);
        tv.setText("0");

        umtitiAssists = 0;
        tv = (TextView) findViewById(R.id.umtitiAssists);
        tv.setText("0");

        carvajalGoals = 0;
        tv = (TextView) findViewById(R.id.carvajalGoals);
        tv.setText("0");

        carvajalAssists = 0;
        tv = (TextView) findViewById(R.id.carvajalAssists);
        tv.setText("0");

        kovacicGoals = 0;
        tv = (TextView) findViewById(R.id.kovacicGoals);
        tv.setText("0");

        kovacicAssists = 0;
        tv = (TextView) findViewById(R.id.kovacicAssists);
        tv.setText("0");

        albaGoals = 0;
        tv = (TextView) findViewById(R.id.albaGoals);
        tv.setText("0");

        albaAssists = 0;
        tv = (TextView) findViewById(R.id.albaAssists);
        tv.setText("0");

        busquetsGoals = 0;
        tv = (TextView) findViewById(R.id.busquetsGoals);
        tv.setText("0");

        busquetsAssists = 0;
        tv = (TextView) findViewById(R.id.busquetsAssists);
        tv.setText("0");

        ceballosGoals = 0;
        tv = (TextView) findViewById(R.id.ceballosGoals);
        tv.setText("0");

        ceballosAssists = 0;
        tv = (TextView) findViewById(R.id.ceballosAssists);
        tv.setText("0");

        rakiticGoals = 0;
        tv = (TextView) findViewById(R.id.rakiticGoals);
        tv.setText("0");

        rakiticAssists = 0;
        tv = (TextView) findViewById(R.id.rakiticAssists);
        tv.setText("0");

        modricGoals = 0;
        tv = (TextView) findViewById(R.id.modricGoals);
        tv.setText("0");

        modricAssists = 0;
        tv = (TextView) findViewById(R.id.modricAssists);
        tv.setText("0");

        denis_suarezGoals = 0;
        tv = (TextView) findViewById(R.id.denis_suarezGoals);
        tv.setText("0");

        denis_suarezAssists = 0;
        tv = (TextView) findViewById(R.id.denis_suarezAssists);
        tv.setText("0");

        asensioGoals = 0;
        tv = (TextView) findViewById(R.id.asensioGoals);
        tv.setText("0");

        asensioAssists = 0;
        tv = (TextView) findViewById(R.id.asensioAssists);
        tv.setText("0");

        messiGoals = 0;
        tv = (TextView) findViewById(R.id.messiGoals);
        tv.setText("0");

        messiAssists = 0;
        tv = (TextView) findViewById(R.id.messiAssists);
        tv.setText("0");

        benzemaGoals = 0;
        tv = (TextView) findViewById(R.id.benzemaGoals);
        tv.setText("0");

        benzemaAssists = 0;
        tv = (TextView) findViewById(R.id.benzemaAssists);
        tv.setText("0");

        suarezGoals = 0;
        tv = (TextView) findViewById(R.id.suarezGoals);
        tv.setText("0");

        suarezAssists = 0;
        tv = (TextView) findViewById(R.id.suarezAssists);
        tv.setText("0");

        baleGoals = 0;
        tv = (TextView) findViewById(R.id.baleGoals);
        tv.setText("0");

        baleAssists = 0;
        tv = (TextView) findViewById(R.id.baleAssists);
        tv.setText("0");

        deulofeuGoals = 0;
        tv = (TextView) findViewById(R.id.deulofeuGoals);
        tv.setText("0");

        deulofeuAssists = 0;
        tv = (TextView) findViewById(R.id.deulofeuAssists);
        tv.setText("0");
    }
}
