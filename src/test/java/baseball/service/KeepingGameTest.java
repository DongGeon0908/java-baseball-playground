package baseball.service;

import baseball.util.StringUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KeepingGameTest {

    @DisplayName("게임_재시작_입력_유효성_검사_성공")
    @ParameterizedTest
    @CsvSource({
            "1",
            "2"
    })
    void choiceNumberFormSuccessTest(String inputTestCase) {
        if (!StringUtil.isCharacter(inputTestCase.charAt(0))) {
            throw new IllegalArgumentException("잘못된 입력입니다.");
        }
    }

    @DisplayName("게임_재시작_입력_유효성_검사_실패")
    @ParameterizedTest
    @CsvSource({
            "ㅇ",
            "ㄴ",
            ")"
    })
    void choiceNumberFormFailTest(String inputTestCase) {
        if (!StringUtil.isCharacter(inputTestCase.charAt(0))) {
            throw new IllegalArgumentException("잘못된 입력입니다.");
        }
    }


    @DisplayName("게임_재시작_입력_크기_검사_성공")
    @ParameterizedTest
    @CsvSource({
            "1",
            "2"
    })
    void choiceNumberSizeSuccessTest(String inputTestCase) {
        if (inputTestCase.length() != 1) {
            throw new IllegalArgumentException("잘못된 입력입니다.");
        }
    }

    @DisplayName("게임_재시작_입력_크기_검사_실패")
    @ParameterizedTest
    @CsvSource({
            "123",
            ""
    })
    void choiceNumberSizeFailTest(String inputTestCase) {
        if (inputTestCase.length() != 1) {
            throw new IllegalArgumentException("잘못된 입력입니다.");
        }
    }
}
