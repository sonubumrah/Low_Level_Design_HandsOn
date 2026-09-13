package TicTacToeLLD;

import java.util.Deque;
import java.util.Scanner;

public class Game {
    private Board board;
    private Deque<Player> players;

    public Game(Board board, Deque<Player> players) {
        this.board = board;
        this.players = players;
    }

    public void startGame() {
        System.out.println("Starting a new game of Tic Tac Toe!");
        while (true) {
            Player currentPlayer = players.poll();
            System.out.println(currentPlayer.getName() + "'s turn. Please enter row and column (0-based index):");
            Scanner scanner = new Scanner(System.in);
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            if (isEmptyCell(row, col)) {
                board.setPiece(row, col, currentPlayer.getPieceType());
                if (checkWin(currentPlayer.getPieceType())) {
                    System.out.println(currentPlayer.getName() + " wins!");
                    break;
                }
                players.add(currentPlayer);
            } else {
                System.out.println("Cell is already occupied. Try again.");
                players.addFirst(currentPlayer);
            }
        }
    }

    private boolean checkWin(PieceType pieceType) {
        // Check rows
        for (int i = 0; i < board.getSize(); i++) {
            if (board.getPiece(i, 0) == pieceType && board.getPiece(i, 1) == pieceType && board.getPiece(i, 2) == pieceType) {
                return true;
            }
        }
        // Check columns
        for (int j = 0; j < board.getSize(); j++) {
            if (board.getPiece(0, j) == pieceType && board.getPiece(1, j) == pieceType && board.getPiece(2, j) == pieceType) {
                return true;
            }
        }
        // Check diagonals
        if (board.getPiece(0, 0) == pieceType && board.getPiece(1, 1) == pieceType && board.getPiece(2, 2) == pieceType) {
            return true;
        }
        if (board.getPiece(0, 2) == pieceType && board.getPiece(1, 1) == pieceType && board.getPiece(2, 0) == pieceType) {
            return true;
        }
        return false;
    }

    public boolean isEmptyCell(int row, int col) {
        return board.getPiece(row, col) == null;
    }

}
