package baseball.model;

import baseball.util.StringUtil;

import java.util.*;

public class Baseball {
    private final List<Integer> baseballNumber;

    public Baseball(String inputNumber) {
        validation(inputNumber);
        baseballNumber = new ArrayList<>();
        makeBaseballNumber(inputNumber);
    }

    public List<Integer> getBaseballNumber() {
        return baseballNumber;
    }

    private void makeBaseballNumber(String number) {
        for (char index : number.toCharArray()) {
            int parseInt = changeCharToInt(index);
            baseballNumber.add(parseInt);
        }
    }

    private int changeCharToInt(char charData) {
        return charData - '0';
    }

    private void validation(String input) {
        validateContainsNumber(input);
        validateInputForm(input);
    }


    private void validateContainsNumber(String input) {
        Set<String> data = new HashSet<>(Arrays.asList(input.split("")));

        if (data.size() != 3) {
            throw new IllegalArgumentException("잘못된 입력입니다.");
        }
    }

    private void validateInputForm(String input) {
        for (char index : input.toCharArray()) {
            if (!StringUtil.isCharacter(index)) {
                throw new IllegalArgumentException("잘못된 입력입니다.");
            }
        }
    }

}
