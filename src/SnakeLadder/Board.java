package SnakeLadder;

public class Board {

    private int size;
    private BoardCell[][]cells;
    public Board(int size) {
        this.size = size;
        this.cells = new BoardCell[size][size];
    }
    public int getSize() {
        return size;
    }
    public BoardCell getCells(int row, int col) {
        return cells[row][col];
    }
}
