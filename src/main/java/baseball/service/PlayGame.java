package baseball.service;

import baseball.controller.InningGameController;
import baseball.controller.InputUserNumberController;
import baseball.model.InningStatus;


import java.util.List;

public class PlayGame {

    private final InningGameController inningGame;

    public PlayGame() {
        this.inningGame = new InningGameController();
    }

    // baseballnumber 안에 컴퓨터넘버와 유저넘버가 존재,,,
    // randomNumber를 받을 필요가.....매개변수로 1급 객체로 받도록
    public void play(List<Integer> randomNumber) { // List<Integer> 이런식으로 받으면 노우노우 (역할과 책임,,,)
        
        while (true) {
            List<Integer> userNumber = new InputUserNumberController().inputUserNumber();

            InningStatus resultStatus = new GameResult().compare(userNumber, randomNumber);

            if (inningGame.showInningStatusResult(resultStatus)) {
                break;
            }

        }
    }

}
