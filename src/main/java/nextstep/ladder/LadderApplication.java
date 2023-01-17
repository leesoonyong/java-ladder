package nextstep.ladder;

import nextstep.ladder.domain.Height;
import nextstep.ladder.domain.Ladder;
import nextstep.ladder.domain.Reward;
import nextstep.ladder.domain.Members;

import static nextstep.ladder.view.ResultView.resultLadder;
import static nextstep.ladder.view.inputView.*;

public class LadderApplication {
    public static void main(String[] args) {
        Members members = new Members(inputJoinMember());
        Height height = new Height(inputLadderCount());
        Reward ladderReward = new Reward(inputLaddeReward());
        Ladder ladder = new Ladder(members, height);

        resultLadder(members.getMembers(), ladder, null);

        inputMemberValue();
    }
}
