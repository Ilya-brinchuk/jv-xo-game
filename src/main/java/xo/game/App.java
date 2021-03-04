package xo.game;

public class App {

    public static void main(String[] args) {
        WinnerIdentifier identifier = new WinnerIdentifier();
        char[][] board = new char[][] {
                {'0', 'X', 'X'},
                {' ', ' ', 'X'},
                {'0', ' ', 'X'}
        };
        System.out.println(identifier.determinateWinner(board));
    }
}
