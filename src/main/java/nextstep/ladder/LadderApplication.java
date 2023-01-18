package nextstep.ladder;

import nextstep.ladder.domain.*;

import static nextstep.ladder.view.ResultView.resultLadder;
import static nextstep.ladder.view.inputView.*;

public class LadderApplication {
    public static void main(String[] args) {
        Members members = new Members(inputJoinMember());
        Height height = new Height(inputLadderCount());
        Rewards ladderReward = new Rewards(inputLaddeReward());
        Ladder ladder = new Ladder(members, height);

        resultLadder(members.getMembers(), ladder, ladderReward.getRewards());

        int memberIndex = members.findMemberIndex(inputMemberValue());
        int resultValue = ladder.moveLine(memberIndex);
        String result = ladderReward.findResultIndex(resultValue);

        LadderResult ladderResult = new LadderResult(memberIndex, result);


    }
}
