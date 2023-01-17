package nextstep.ladder.domain;

public enum Direction {

    PASS(0),
    LEFT(-1),
    RIGHT(1);

    private int position;

    Direction(int position) {
        this.position = position;
    }

    public int getPosition() {
        return position;
    }
}
