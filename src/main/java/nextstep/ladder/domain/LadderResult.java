package nextstep.ladder.domain;

import java.util.HashMap;
import java.util.Map;

public class LadderResult {
    private Map<Integer, String> resultMap = new HashMap<>();

    public LadderResult(int memberPosition, String result) {
        resultMap.put(memberPosition, result);
    }
}
