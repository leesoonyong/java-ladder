package nextstep.ladder.domain;

public class Point {
    private final boolean right;
    private final boolean left;

    public Point(boolean right, boolean left) {
        validPoint(right, left);
        this.right = right;
        this.left = left;
    }

    public Point isFirst(boolean left){
        return new Point(false, left);
    }

    public Point isLast(boolean right){
        return new Point(right, false);
    }

    public Point next(boolean right){
        return new Point(right, this.left);
    }


    public Direction move(){
        if(this.right){
            return Direction.RIGHT;
        }
        if(this.left){
            return Direction.LEFT;
        }
        return Direction.PASS;
    }

    private void validPoint(boolean right, boolean left) {
        if(left && right){
            throw new IllegalArgumentException("상태값이 유효하지않습니다");
        }
    }
}
