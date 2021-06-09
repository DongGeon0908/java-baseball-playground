package baseball.service;

import baseball.controller.InputUserNumberController;
import baseball.model.*;

public class PlayGame {
    public void play() {

        RandomNumber randomNumber = new RandomNumber();
        ComputerBaseball computerBaseball = new ComputerBaseball(randomNumber.getRandomNumber());

        for (int i : computerBaseball.getBaseballNumber()) {
            System.out.print(i);
        }

        // 이런 while문 자체보다는 객체가 데이터를 가져서,,,
        while (true) {
            String userNumber = new InputUserNumberController().inputUserNumber();
            UserBaseball userBaseball = new UserBaseball(userNumber);
            InningStatus inningStatus = new InningStatus();

            for (int index = 0; index < 3; index++) {
                BallStatus ballStatus = new BallStatus(userBaseball, computerBaseball, index);
                inningStatus.inspectInningStatus(ballStatus);
            }

            if (inningStatus.inningResult()) {
                break;
            }

        }
    }

}
