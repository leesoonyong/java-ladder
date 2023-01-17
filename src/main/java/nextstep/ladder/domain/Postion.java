package nextstep.ladder.domain;

public class Postion {
    private final Direction direction;
    private int postion;

    public Postion(Point point, int postion) {
        this.direction = point.move();
        this.postion = postion;
    }

    public int positionResult(){
        return direction.getPositionCount() + this.postion;
    }
}
