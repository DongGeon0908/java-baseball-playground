package baseball.service;

import baseball.controller.InputUserNumberController;
import baseball.model.BallStatus;
import baseball.model.ComputerBaseball;
import baseball.model.InningStatus;
import baseball.model.UserBaseball;

public class PlayGame {
    public void play() {
        ComputerBaseball computerBaseball = new ComputerBaseball();

        for (int i : computerBaseball.getComputerBaseball()) {
            System.out.print(i);
        }

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
