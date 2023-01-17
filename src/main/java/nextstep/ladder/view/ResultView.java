package nextstep.ladder.view;

import nextstep.ladder.domain.*;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ResultView {
    private static final Scanner sc = new Scanner(System.in);
    private static final String HEIGHT_BAR = "|";
    private static final String SPACE_LINE = "     ";
    private static final String BRIDGE_LINE = "-----";


    public static void resultLadder(List<Member> members, Ladder ladder, List<String> rewards){
        resultMember(members);
        resultLadder(ladder);
        resultReward(rewards);
    }


    private static void resultMember(List<Member> members) {
        System.out.println(members.stream()
                .map(Member::getName)
                .map(ResultView::stringFormat)
                .collect(Collectors.joining("")));
    }

    private static void resultReward(List<String> rewards) {
        System.out.println(rewards.stream()
                .map(ResultView::stringFormat)
                .collect(Collectors.joining("")));
    }

    private static String stringFormat(String value) {
        return String.format("%5s", value);
    }

    public static void resultLadder(Ladder ladder) {
        ladder.getLines()
                .forEach(ResultView::resultLine);
    }

    private static void resultLine(Line line) {
        System.out.print(stringFormat(HEIGHT_BAR));
        StringBuilder stringBuilder = new StringBuilder();
        line.getPoints()
                .forEach(point -> stringBuilder.append(divideValue(point.move()))
                .append(HEIGHT_BAR));
        System.out.println(stringBuilder);
    }

    private static String divideValue(Direction direction) {
        if (direction.equals(Direction.RIGHT)) {
            return BRIDGE_LINE;
        }
        return SPACE_LINE;
    }
}
