package baseball.service;

import baseball.model.BallStatus;
import baseball.model.InningStatus;

import java.util.List;

public class GameResult {
    

    // List<Integer> userNumber, List<Integer> randomNumber -> 일급 컬렉션으로 받아서 그 안에서 계산하도록
    public InningStatus compare(List<Integer> userNumber, List<Integer> randomNumber) {
        BallStatus ballStatus = new BallStatus();
        InningStatus resultStatus = new InningStatus();

        for (int index = 0; index < 3; index++) {
            ballStatus.setStrikeStatus(randomNumber.get(index), userNumber.get(index));
            ballStatus.setBallStatus(randomNumber, userNumber.get(index));

            // contains XXXX
            // ballStatus --> 이 부분의 로직이 다른에가 역할 갖고 있다..
            // 다른 메서드로 인해 해당 메서드가
            //
            if (ballStatus.getStrikeStatus()) {
                resultStatus.setStrikeResult(ballStatus.getStrikeStatus());
                continue;
            }
            resultStatus.setBallResult(ballStatus.getBallStatus());
        }

        return resultStatus;
    }
}
