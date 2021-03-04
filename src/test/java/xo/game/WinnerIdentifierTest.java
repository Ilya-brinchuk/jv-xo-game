package xo.game;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class WinnerIdentifierTest {
    private WinnerIdentifier winnerIdentifier;

    @Before
    public void  setUp() throws Exception {
        winnerIdentifier = new WinnerIdentifier();
    }

    @Test
    public void x_isWinner() {
        char[][] board = new char[][] {
                {'0', 'X', 'X'},
                {' ', ' ', 'X'},
                {'0', ' ', 'X'}
        };
        String expected = "X";

        assertEquals(expected, winnerIdentifier.determinateWinner(board));
    }

    @Test
    public void o_isWinner() {
        char[][] board = new char[][] {
                {'0', 'X', 'X'},
                {'0', ' ', 'X'},
                {'0', ' ', ' '}
        };
        String expected = "0";
        assertEquals(expected, winnerIdentifier.determinateWinner(board));
    }

    @Test
    public void invalid() {
        char[][] board = new char[][] {
                {' ', ' ', ' '},
                {'0', ' ', 'X'},
                {'0', ' ', 'X'}
        };
        String expected = "";
        assertEquals(expected, winnerIdentifier.determinateWinner(board));
    }

    @Test
    public void draw() {
        char[][] board = new char[][] {
                {'0', ' ', 'X'},
                {'0', ' ', 'X'},
                {'0', ' ', 'X'}
        };
        String expected = "";
        assertEquals(expected, winnerIdentifier.determinateWinner(board));
    }
}