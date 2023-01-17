package nextstep.ladder.domain;

public enum Direction {

    PASS(0),
    LEFT(-1),
    RIGHT(1);

    private int positionCount;

    Direction(int positionCount) {
        this.positionCount = positionCount;
    }

    public int getPositionCount() {
        return positionCount;
    }
}
