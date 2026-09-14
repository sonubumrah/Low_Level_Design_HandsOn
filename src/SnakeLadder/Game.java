package SnakeLadder;

import java.util.Deque;

public class Game {
    private Board board;
    private Deque<Player> players;
    private Dice dice;

    public Game(Board board, Deque<Player> players, Dice dice) {
        this.board = board;
        this.players = players;
        this.dice = dice;
    }
    public void start() {
        while (true) {
            Player currentPlayer = players.poll();
            int roll = dice.roll();
            System.out.println(currentPlayer.getName() + " rolled a " + roll);
            int newPosition = currentPlayer.getPosition() + roll;
            if (newPosition > board.getSize() * board.getSize()) {
                System.out.println(currentPlayer.getName() + " cannot move, needs exact roll to finish.");
                players.offer(currentPlayer);
                continue;
            }
            if(newPosition <= board.getSize() * board.getSize()) {
                int []index = getIndex(newPosition);
                int row = index[0];
                int col = index[1];
                BoardCell cell= board.getCells(row, col);
                if (cell!=null && cell.getStep() != null) {
                    newPosition = cell.getStep().getEnd();


                    //System.out.println(currentPlayer.getName() + " encountered a " + (cell.getStep().getStart() < cell.getStep().getEnd() ? "ladder" : "snake") + " and moved to position " + newPosition);
                }

            }
            currentPlayer.setPosition(newPosition);
            System.out.println(currentPlayer.getName() + " moved to position " + newPosition);
            if (newPosition == board.getSize() * board.getSize()) {
                System.out.println(currentPlayer.getName() + " wins!");
                break;
            }
            players.offer(currentPlayer);
        }
    }
    public int[] getIndex(int position) {
        int row = (position - 1) / board.getSize();
        int col = (position - 1) % board.getSize();
        return new int[]{row, col};
    }
    public void InitializeGame() {
        // Initialize the board with snakes and ladders
        int size = 10; // 10x10 board
        BoardCell[][] cells = new BoardCell[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                cells[i][j] = new BoardCell(i * size + j + 1, null);
            }
        }
        // Add some snakes and ladders
        cells[2][3] = new BoardCell(24, new Step(24, 5)); // Snake from 24 to 5
        cells[4][5] = new BoardCell(46, new Step(46, 15)); // Snake from 46 to 15
        cells[7][2] = new BoardCell(73, new Step(73, 52)); // Snake from 73 to 52
        cells[1][1] = new BoardCell(12, new Step(12, 28)); // Ladder from 12 to 28
        cells[3][4] = new BoardCell(34, new Step(34, 55)); // Ladder from 34 to 55
        cells[5][6] = new BoardCell(57, new Step(57, 76)); // Ladder from 57 to 76

        this.board = new Board(size);
    }

}
