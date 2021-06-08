package baseball.controller;

import baseball.model.*;
import baseball.service.KeepingGame;
import baseball.service.PlayGame;

import java.util.List;

public class PlayGameController {

    private final KeepingGame keepingGame;

    public PlayGameController() {
        this.keepingGame = new KeepingGame();
    }


    public void startGame() {

        while (keepingGame.getChoicePlayGameStatus()) {
            List<Integer> randomNumber = new ComputerNumber().getRandomNumber();

            new PlayGame().play(randomNumber);

            keepingGame.setChoicePlayGameStatus();
        }
    }


}
