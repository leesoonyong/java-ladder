package nextstep.ladder.domain;

import java.util.HashMap;
import java.util.Map;

public class LadderResult {
    private Map<Integer, Integer> resultMap = new HashMap<>();

    private void move(int memberPostion, Ladder ladder){
            resultMap.put(memberPostion, ladder.moveLine(ladder));
    };

}
