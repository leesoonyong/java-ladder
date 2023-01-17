package nextstep.ladder.domain;

import java.util.List;

public class Member {

    private static final String MAX_NAME_SIZE_MESSAGE = "이름은 최대 5글자만 입력할 수 있습니다.";
    private static final String EMPTY_NAME_MESSAGE = "이름을 입력해주세요.";
    private static final int MAX_NAME_SIZE = 5;
    private final String name;

    public Member(String name){
        validEmptyCheck(name);
        validNameSize(name);
        this.name = name;
    }

    private void validNameSize(String name){
        if(name.length() > MAX_NAME_SIZE){
            throw new IllegalArgumentException(MAX_NAME_SIZE_MESSAGE);
        }
    }

    private void validEmptyCheck(String name){
        if(name.isBlank()){
            throw new IllegalArgumentException(EMPTY_NAME_MESSAGE);
        }
    }

    public String getName() {
        return name;
    }
}
