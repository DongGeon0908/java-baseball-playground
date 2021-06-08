package baseball.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class checkUtilTest {

    @DisplayName("숫자_파싱_성공")
    @ParameterizedTest
    @CsvSource({
            "1",
            "2",
            "3",
            "4"
    })
    void choiceNumberFormSuccessTest(String inputTestCase) {
        boolean actual = Character.isDigit(inputTestCase.charAt(0));
        assertThat(actual).isEqualTo(true);
    }

    @DisplayName("숫자_파싱_실패")
    @ParameterizedTest
    @CsvSource({
            "z",
            ")",
            "*",
            "+"
    })
    void choiceNumberFormFailTest(String inputTestCase) {
        boolean actual = Character.isDigit(inputTestCase.charAt(0));
        assertThat(actual).isEqualTo(false);
    }
}
