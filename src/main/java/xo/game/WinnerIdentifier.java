package xo.game;

public class WinnerIdentifier {
    public String determinateWinner(char[][] board) {
        int xcounter = 0;
        int ocounter = 0;
        for (int i = 0; i < board.length; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2]
                    && (board[i][0] == 'X' || board[i][0] == '0')) {
                if (board[i][0] == 'X') {
                    xcounter++;
                } else {
                    ocounter++;
                }
            }
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i]
                    && (board[0][i] == 'X' || board[0][i] == '0')) {
                if (board[0][i] == 'X') {
                    xcounter++;
                } else {
                    ocounter++;
                }
            }
        }
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2]
                && (board[0][0] == 'X' || board[0][0] == '0')) {
            if (board[0][0] == 'X') {
                xcounter++;
            } else {
                ocounter++;
            }
        }
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0]
                && (board[0][2] == 'X' || board[0][2] == '0')) {
            if (board[0][2] == 'X') {
                xcounter++;
            } else {
                ocounter++;
            }
        }
        if (xcounter == ocounter) {
            return "";
        } else {
            return xcounter > ocounter ? "X" : "0";
        }
    }
}
