package TicTacToeLLD;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe!");
        System.out.println("Please enter the size of the board and the number of players");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int numPlayers = scanner.nextInt();
        Player player1 = new Player("Player 1", PieceType.X);
        Player player2 = new Player("Player 2", PieceType.O);
        Deque<Player> players=new LinkedList<>();
        players.add(player1);
        players.add(player2);
        Board board = new Board(size);
        Game game = new Game(board, players);
        game.startGame();


    }
}
