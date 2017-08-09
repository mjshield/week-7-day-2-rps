package com.example.user.rockpaperscissors;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 09/08/2017.
 */

public class GameTest {

    String playerMove;
    String computerMove;

    @Test
    public void adjudicatePlayerWins() {
        playerMove = "paper";
        computerMove = "rock";

        String expected = "Player Wins";
        assertEquals(expected, Game.adjudicate(playerMove, computerMove));
    }

    @Test
    public void adjudicatePlayerDraws() {
        playerMove = "rock";
        computerMove = "rock";

        String expected = "Draw";
        assertEquals(expected, Game.adjudicate(playerMove, computerMove));
    }

    @Test
    public void adjudicatePlayerLoses() {
        playerMove = "rock";
        computerMove = "paper";

        String expected = "Computer Wins";
        assertEquals(expected, Game.adjudicate(playerMove, computerMove));
    }

    @Test
    public void testGetMove(){
        String move = Game.getMove();
        Boolean result = ( move.equals("rock") || move.equals("paper") || move.equals("scissors") );
        assertEquals( result, true );
    }
}
