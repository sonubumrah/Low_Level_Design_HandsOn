package SnakeLadder;

public class BoardCell {
    private int position;
    private Step step;

    public BoardCell(int position, Step step) {
        this.position = position;
        this.step = step;
    }

    public int getPosition() {
        return position;
    }

    public Step getStep() {
        return step;
    }
}
