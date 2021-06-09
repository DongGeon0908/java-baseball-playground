package baseball.service;

import baseball.model.GameStatus;
import baseball.util.StringUtil;
import baseball.view.InputView;


public class KeepingGame {

    private boolean choicePlayGameStatus = true;

    public boolean getChoicePlayGameStatus() {
        return this.choicePlayGameStatus;
    }

    public void setChoicePlayGameStatus() {
        this.choicePlayGameStatus = keepOrExit();
    }

    public boolean keepOrExit() {
        String keepOrExitMessage = new InputView().choiceGameMessage();

        choiceNumberSize(keepOrExitMessage);

        choiceNumberForm(keepOrExitMessage);

        return GameStatus
                .findByGameStatus(keepOrExitMessage)
                .isContinueGame();
    }

    private void choiceNumberSize(String input) {
        if (input.length() != 1) {
            throw new IllegalArgumentException("잘못된 입력입니다.");
        }
    }

    private void choiceNumberForm(String input) {
        if (!StringUtil.isCharacter(input.charAt(0))) {
            throw new IllegalArgumentException("잘못된 입력입니다.");
        }
    }
}
