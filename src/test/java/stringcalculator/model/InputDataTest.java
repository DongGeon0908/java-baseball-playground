package stringcalculator.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class InputDataTest {

    @DisplayName("사용자_입력_유효성_체크_성공")
    @ParameterizedTest
    @CsvSource({
            "3 + 2 - 0",
            "6 - 4 + 5",
            "1 * 100 + 5 + 60"
    })
    void validateSuccessTest(String inputTestCase) {
        if (inputTestCase.equals("")) {
            throw new IllegalArgumentException("잘못된 입력입니다.");
        }
    }

    @DisplayName("사용자_입력_유효성_체크_실패")
    @Test
    void validateFailTest() {
        String inputTestCase = "";
        if (inputTestCase.equals("")) {
            throw new IllegalArgumentException("잘못된 입력입니다.");
        }
    }

    @DisplayName("사용자_입력_저장_성공")
    @ParameterizedTest
    @CsvSource({
            "3 + 2 - 0",
            "6 - 4 + 5",
            "1 * 100 + 5 + 60"
    })
    void inputData(String inputTestCase) {
        new InputData(inputTestCase);
    }

    @DisplayName("사용자_입력_저장_실패")
    @Test
    void inputData() {
        new InputData(null);
    }


}
