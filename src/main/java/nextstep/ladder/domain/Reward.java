package nextstep.ladder.domain;

import java.util.Objects;

public class Reward {

    private static final String MAX_NAME_SIZE_MESSAGE = "결과를 입력 해주세요.";

    private final String reward;

    public Reward(String reward){
        validEmptyCheck(reward);
        this.reward = reward;
    }

    private void validEmptyCheck(String reward){
        if(reward.isBlank()){
            throw new IllegalArgumentException(MAX_NAME_SIZE_MESSAGE);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reward reward1 = (Reward) o;
        return Objects.equals(reward, reward1.reward);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reward);
    }
}
