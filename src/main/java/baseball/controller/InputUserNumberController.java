package baseball.controller;

import baseball.model.UserNumberList;
import baseball.view.InputView;

import java.util.List;

public class InputUserNumberController {
    private final InputView inputView;

    public InputUserNumberController() {
        this.inputView = new InputView();
    }

    public List<Integer> inputUserNumber() {
        return new UserNumberList().getUserNumber(inputView.inputNumberMessage());
    }
}
