package stringcalculator.model;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class InputData {
    private final Queue<String> values;

    public InputData(String inputText) {

        validateInputData(inputText);

        this.values = new LinkedList<>(Arrays.asList(inputText.split(" ")));
    }

    private void validateInputData(String inputText) {
        if (inputText.equals("")) {
            throw new IllegalArgumentException("잘못된 입력입니다.");
        }
    }

    public Queue<String> getNumberAndOperator() {
        return values;
    }

}
