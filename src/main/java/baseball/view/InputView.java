package baseball.view;

import baseball.util.InputUtil;
import baseball.util.OutputUtil;

public class InputView {

    public String inputNumberMessage() {
        OutputUtil.enterLine();
        OutputUtil.stringOutput("숫자를 입력해 주세요 : ");

        String inputNumber = InputUtil.input();

        return inputNumber;
    }

    public String choiceGameMessage() {
        OutputUtil.stringOutput("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        OutputUtil.enterLine();

        String inputNumber = InputUtil.input();

        return inputNumber;
    }

}
