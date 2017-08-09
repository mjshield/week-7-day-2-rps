package com.example.user.rockpaperscissors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView resultTextView;
    Button buttonRock;
    Button buttonPaper;
    Button buttonScissors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultTextView = (TextView) findViewById(R.id.result_text);
        buttonRock = (Button) findViewById(R.id.button_rock);
        buttonPaper = (Button) findViewById(R.id.button_paper);
        buttonScissors = (Button) findViewById(R.id.button_scissors);
    }

    public void onRockButtonClicked(View button_rock) {
        String playerMove = "rock";
        String computerMove = Game.getMove();
        String result = Game.adjudicate(playerMove, computerMove);
        String display = "The computer move was " + computerMove + ". \n";
        display += result;
        resultTextView.setText( display );
    }

    public void onPaperButtonClicked(View button_paper) {
        String playerMove = "paper";
        String computerMove = Game.getMove();
        String result = Game.adjudicate(playerMove, computerMove);
        String display = "The computer move was " + computerMove + ". \n";
        display += result;
        resultTextView.setText( display );
    }

    public void onScissorsButtonClicked(View button_scissors) {
        String playerMove = "scissors";
        String computerMove = Game.getMove();
        String result = Game.adjudicate(playerMove, computerMove);
        String display = "The computer move was " + computerMove + ". \n";
        display += result;
        resultTextView.setText( display );
    }
}
