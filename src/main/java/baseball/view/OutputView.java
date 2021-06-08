package baseball.view;

import baseball.util.OutputUtil;

public class OutputView {

    public static void outputBallHint(int ballNum) {
        OutputUtil.stringOutput(ballNum + "볼 ");
    }

    public static void outputStrikeHint(int strikeNum) {
        OutputUtil.stringOutput(strikeNum + "스트라이크");
    }

    public static void outputNothingHint() {
        OutputUtil.stringOutput("Nothing");
    }

    public static void successGame() {
        OutputUtil.enterLine();
        OutputUtil.stringOutput("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        OutputUtil.enterLine();
    }

}
