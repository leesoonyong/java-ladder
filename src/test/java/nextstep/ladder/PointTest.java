package nextstep.ladder;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;

public class PointTest {

    @Test
    void pass(){
        Point point = new Point(false,true);
        Assertions.assertThat(point.move()).isEqaulTo(T)
    }
}
