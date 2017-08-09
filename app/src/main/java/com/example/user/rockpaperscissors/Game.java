package com.example.user.rockpaperscissors;

import java.util.Random;

/**
 * Created by user on 09/08/2017.
 */

public abstract class Game {

    public static String adjudicate(String playerMove, String computerMove) {

        switch( playerMove ) {

            case "rock":
                switch (computerMove) {
                    case "rock":
                        return "Draw";
                    case "paper":
                        return "Computer Wins";
                    case "scissors":
                        return "Player Wins";
                }
                ;

            case "paper":
                switch (computerMove) {
                    case "rock":
                        return "Player Wins";
                    case "paper":
                        return "Draw";
                    case "scissors":
                        return "Computer Wins";
                }
                ;

            case "scissors":
                switch (computerMove) {
                    case "rock":
                        return "Computer Wins";
                    case "paper":
                        return "Player Wins";
                    case "scissors":
                        return "Draw";
                }
                ;
        }

        return null;
    }

    public static String getMove() {

        String[] moves = { "rock", "paper", "scissors" };
        int choice = new Random().nextInt( moves.length );
        return moves[ choice ];

    }

}
