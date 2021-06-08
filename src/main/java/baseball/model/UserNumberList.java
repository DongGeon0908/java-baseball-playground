package baseball.model;

import baseball.util.CheckUtil;

import java.util.ArrayList;
import java.util.List;

public class UserNumberList{

    // number의 책임
    private final List<Integer> userNumber = new ArrayList<>();

    // number의 책임
    // String userInput 생성자로 받자. --> 생성자에서 체크진행
    public List<Integer> getUserNumber(String userInput) {
        return setUserNumber(userInput);
    }

    // number의 책임
    private List<Integer> setUserNumber(String number) {

        checkInputSize(number);
        checkInputForm(number);

        for (char index : number.toCharArray()) {
            checkInputOverlap(userNumber, index);
            userNumber.add(changeCharToInt(index));
        }

        return userNumber;
    }





    // usernumber의 책임
    private void checkInputOverlap(List<Integer> saveNumber, int inputNumber) {
        if (saveNumber.contains(inputNumber)) {
            throw new IllegalArgumentException("잘못된 입력입니다.");
        }
    }

    // usernumber의 책임
    private void checkInputSize(String input) {
        if (input.length() != 3) {
            throw new IllegalArgumentException("잘못된 입력입니다.");
        }
    }

    // usernumber의 책임
    private void checkInputForm(String input) {
        for (char number : input.toCharArray()) {
            if (!CheckUtil.checkNumberForm(number)) {
                throw new IllegalArgumentException("잘못된 입력입니다.");
            }
        }

    }

    // usernumber의 책임
    private int changeCharToInt(char charData) {
        return charData - '0';
    }

}