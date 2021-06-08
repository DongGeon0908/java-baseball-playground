package baseball.model;

import baseball.util.CheckUtil;

import java.util.ArrayList;
import java.util.List;

// 추상화 단계에 대해 ...
public class UserBaseball {

    private final List<Integer> userNumber;

    public UserBaseball(String inputNumber) {
        this.userNumber = new ArrayList<>();
        userNumber(inputNumber);
    }

    public List<Integer> getUserBaseball() {
        return userNumber;
    }

    private void userNumber(String number) {

        validateInputSize(number);

        for (char index : number.toCharArray()) {
            validateInputForm(index);
            int parseInt = changeCharToInt(index);
            validateContainsNumber(parseInt);
            userNumber.add(parseInt);
        }
    }

    private void validateContainsNumber(int index) {
        if (userNumber.contains(index)) {
            throw new IllegalArgumentException("잘못된 입력입니다.");
        }
    }

    private void validateInputSize(String input) {
        if (input.length() != 3) {
            throw new IllegalArgumentException("잘못된 입력입니다.");
        }
    }

    private void validateInputForm(char number) {
        if (!CheckUtil.checkNumberForm(number)) {
            throw new IllegalArgumentException("잘못된 입력입니다.");
        }
    }

    private int changeCharToInt(char charData) {
        return charData - '0';
    }

}