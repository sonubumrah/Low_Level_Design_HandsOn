package TicTacToeLLD;

public class Board {
    private int size;
    private PieceType[][] board;

    public Board(int size) {
        this.size = size;
        this.board = new PieceType[size][size];
    }

    public int getSize() {
        return size;
    }

    public PieceType getPiece(int row, int col) {
        return board[row][col];
    }

    public void setPiece(int row, int col, PieceType pieceType) {
        board[row][col] = pieceType;
    }
}
