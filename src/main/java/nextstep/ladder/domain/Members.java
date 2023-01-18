package nextstep.ladder.domain;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.stream.Collectors;

public class Members {

    private final List<Member> members;
    public Members(String members){
        this(valueOf(members));
    }

    public Members(List<Member> members){
        this.members = members;
    }

    private static List<Member> valueOf(String members){
        return Arrays.stream(members.split(","))
                .map(Member::new)
                .collect(Collectors.toList());
    }

    public int findMemberIndex(String member){
        validMemberCheck(member);
        return members.indexOf(member);
    }

    public void validMemberCheck(String member){
        if(!members.contains(member)){
            throw new IllegalArgumentException("해당 이름을 가진 사람이 존재하지 않습니다.");
        }
    }

    public List<Member> getMembers() {
        return Collections.unmodifiableList(members);
    }

    public int getSize() {
        return members.size();
    }
}
