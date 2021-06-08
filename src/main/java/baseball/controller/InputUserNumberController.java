package baseball.controller;

import baseball.view.InputView;

public class InputUserNumberController {
    private final InputView inputView;

    public InputUserNumberController() {
        this.inputView = new InputView();
    }

    public String inputUserNumber() {
        return inputView.inputNumberMessage();
    }
}
