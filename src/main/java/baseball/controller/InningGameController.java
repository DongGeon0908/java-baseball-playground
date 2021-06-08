package baseball.controller;

import baseball.model.InningStatus;
import baseball.view.OutputView;

// Inning에 대한 결과값을 여기서 알아야 할까?
public class InningGameController {

    public boolean showInningStatusResult(InningStatus resultStatus) {
        inningBallResult(resultStatus.getBallResult());
        inningStrikeResult(resultStatus.getStrikeResult());
        inningNothingResult(resultStatus.getNothingResult());

        return inningWin(resultStatus.getStrikeResult());
    }
    
    // 메세지를 던지자

    // inningStatus 안에서 판단해야한다.. 역할을 inningStatus에서 해야한다..
    private boolean inningWin(int strike) {
        if (strike == 3) {
            OutputView.successGame();
            return true;
        }
        return false;
    }

    // showInningBall
    private void inningBallResult(int ball) {
        if (ball != 0) {
            OutputView.outputBallHint(ball);
        }
    }

    // showInningStrike
    private void inningStrikeResult(int strike) {
        if (strike != 0) {
            OutputView.outputStrikeHint(strike);
        }
    }

    // showInningNothing
    private void inningNothingResult(boolean checkStatus) {
        if (checkStatus) {
            OutputView.outputNothingHint();
        }
    }
}
