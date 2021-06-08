package baseball.model;

import baseball.view.OutputView;

public class InningStatus {
    private int strike = 0;
    private int ball = 0;


    public void inspectInningStatus(BallStatus ballStatus) {
        if (ballStatus.getStrikeStatus()) {
            this.strike += 1;
        }

        if (ballStatus.getBallStatus()) {
            this.ball += 1;
        }
    }


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
        if (this.strike == 3) {
            return true;
        }
        return false;
    }

    private boolean showInningNothing() {
        return !showInningStrike() && !showInningBall();
    }

    private boolean showInningBall() {
        if (this.ball != 0) {
            return true;
        }
        return false;
    }

    private boolean showInningStrike() {
        if (this.strike != 0) {
            return true;
        }
        return false;
    }


}
