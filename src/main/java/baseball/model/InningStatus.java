package baseball.model;

import baseball.view.OutputView;

public class InningStatus {
    private int strike = 0;
    private int ball = 0;


    public void inspectInningStatus(BallStatus ballStatus) {
        if (ballStatus.getStrikeStatus()) {
            this.strike += 1;
            return;
        }

        if (ballStatus.getBallStatus()) {
            this.ball += 1;
        }
    }


    // 분기를 줄여야보자
    // 낫띵을 먼저 검사하고 --> ball, strike 등 존재하면 출력하도록 메서드 분리~~ 각각의 명칭을 조금 더 명확하게 하기!!
    // 기능이 갖는 의미를 명확하게 구분짓기
    // 메소드를 분리하는 방식으로
    // 현재 코드는 가독성이 떨어짐 <-- 바꾸기 바꾸기,,

    public boolean inningResult() {
        if (inningWin()) {
            OutputView.successGame();
            return true;
        }

        if (showInningBall()) {
            OutputView.outputBallHint(this.ball);
        }

        if (showInningStrike()) {
            OutputView.outputStrikeHint(this.strike);
        }

        if (showInningNothing()) {
            OutputView.outputNothingHint();
        }

        return false;
    }


    public boolean inningWin() {
        return this.strike == 3;
    }

    private boolean showInningNothing() {
        return !showInningStrike() && !showInningBall();
    }

    private boolean showInningBall() {
        return this.ball != 0;
    }

    private boolean showInningStrike() {
        return this.strike != 0;
    }


}
