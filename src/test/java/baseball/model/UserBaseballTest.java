package baseball.model;

import baseball.util.StringUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;
import java.util.List;


public class UserBaseballTest {

    @DisplayName("입력값_파싱_유효성_검사_성공")
    @ParameterizedTest
    @CsvSource({
            "12345667",
            "123454567",
            "1254875667"
    })
    void validateInputFormSuccessTest(String input) {

        for (char testcase : input.toCharArray()) {
            if (!StringUtil.isCharacter(testcase)) {
                throw new IllegalArgumentException("잘못된 입력입니다.");
            }
        }
    }

    @DisplayName("입력값_파싱_유효성_검사_실패")
    @ParameterizedTest
    @CsvSource({
            "1234566)7",
            "123454+567",
            "125487ㄷ5667"
    })
    void validateInputFormFailTest(String input) {

        for (char testcase : input.toCharArray()) {
            if (!StringUtil.isCharacter(testcase)) {
                throw new IllegalArgumentException("잘못된 입력입니다.");
            }
        }
    }

    @DisplayName("입력값_포함_유효성_검사_성공")
    @ParameterizedTest
    @CsvSource({
            "1",
            "4",
            "3"
    })
    void validateContainsNumberSuccessTest(String input) {
        List<Integer> userNumber = new ArrayList<>();

        userNumber.add(6);
        userNumber.add(5);
        userNumber.add(7);

        if (userNumber.contains(Integer.parseInt(input))) {
            throw new IllegalArgumentException("잘못된 입력입니다.");
        }
    }

    @DisplayName("입력값_포함_유효성_검사_실패")
    @ParameterizedTest
    @CsvSource({
            "1",
            "4",
            "3"
    })
    void validateContainsNumberFailTest(String input) {
        List<Integer> userNumber = new ArrayList<>();

        userNumber.add(1);
        userNumber.add(4);
        userNumber.add(3);
        userNumber.add(7);
        userNumber.add(9);


        if (userNumber.contains(Integer.parseInt(input))) {
            throw new IllegalArgumentException("잘못된 입력입니다.");
        }
    }
}
