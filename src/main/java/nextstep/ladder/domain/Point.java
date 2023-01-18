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

    public int move(){
        if(right){
            return Direction.RIGHT.getPositionCount();
        }
        if(left){
            return Direction.LEFT.getPositionCount();
        }
        return Direction.PASS.getPositionCount();
    }

    private void validPoint(boolean right, boolean left) {
        if(left && right){
            throw new IllegalArgumentException("상태값이 유효하지않습니다");
        }
    }
}
