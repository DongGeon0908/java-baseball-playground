package baseball.controller;

import baseball.service.KeepingGame;
import baseball.service.PlayGame;

public class PlayGameController {

    private final KeepingGame keepingGame;

    public PlayGameController() {
        this.keepingGame = new KeepingGame();
    }

    public void startGame() {
        while (keepingGame.getChoicePlayGameStatus()) {
            new PlayGame().play();
            keepingGame.setChoicePlayGameStatus();
        }
    }
}
