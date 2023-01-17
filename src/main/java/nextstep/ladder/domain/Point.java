package nextstep.ladder.domain;

public class Point {
    private final boolean right;
    private final boolean left;

    public Point(boolean left, boolean right) {
        validPoint(left, right);
        this.left = left;
        this.right = right;
    }

    public static Point isFirst(boolean right){
        return new Point(false, right);
    }

    public Point isLast(){
        return new Point(false, this.right);
    }

    public Point next(boolean right){
        if(this.right){
           return new Point(true, false);
        }
        return new Point(false, right);
    }

    public Direction move(){
        if(right){
            return Direction.RIGHT;
        }
        if(left){
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
