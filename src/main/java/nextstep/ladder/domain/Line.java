package nextstep.ladder.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Line {
    private final List<Point> points = new ArrayList<>();
    private static final Random random = new Random();

    public Line(Members members){
        pointAdd(members.getSize() - 2);
    }

    public void pointAdd(int lineCount){
        Point point = Point.isFirst(random.nextBoolean());
        points.add(point);
        for (int i = 1; i < lineCount;  i++) {
            points.add(point.next(random.nextBoolean()));
        }
        points.add(point.isLast());
    }

    public List<Point> getPoints() {
        return Collections.unmodifiableList(points);
    }

    public int move() {
        return points.stream()
                .mapToInt(Point::move)
                .sum();
    }
}
