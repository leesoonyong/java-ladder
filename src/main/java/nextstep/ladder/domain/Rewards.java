package nextstep.ladder.domain;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Rewards {

    private final List<String> rewards;

    public Rewards(String rewards){
            this(valueOf(rewards));
    }

    public Rewards(List<String> rewards) {
        this.rewards = rewards;
    }

    private static List<String> valueOf(String reward){
        return Arrays.stream(reward.split(","))
                .collect(Collectors.toList());
    }

    public String findResultIndex(int reward){
        return rewards.get(reward);
    }

    public List<String> getRewards() {
        return Collections.unmodifiableList(rewards);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rewards rewards1 = (Rewards) o;
        return Objects.equals(rewards, rewards1.rewards);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rewards);
    }
}
