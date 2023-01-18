package nextstep.ladder.domain;

import java.util.HashMap;
import java.util.Map;

public class LadderResult {
    private Map<Integer, Integer> resultMap = new HashMap<>();

    private void result(int memberPostion, int ladderResult){
            resultMap.put(memberPostion, ladderResult);
    };

}
