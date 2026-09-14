package SnakeLadder;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Game game = new Game();
        Deque<Player> players= new LinkedList<>();
        Player player1 = new Player("Player 1", 1);
        Player player2 = new Player("Player 2", 1);
        players.add(player1);
        players.add(player2);
        System.out.println("Please enter the board size:");
        Scanner scanner=new Scanner(System.in);
        int boardSize=scanner.nextInt();
        Board board = new Board(boardSize);
        Dice dice = new Dice();
        Game game = new Game( board, players, dice);
        game.InitializeGame();
        game.start();

    }
}
