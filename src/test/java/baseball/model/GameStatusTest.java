package baseball.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameStatusTest {
    @DisplayName("게임_상태_체크_성공")
    @ParameterizedTest
    @CsvSource({
            "1, START",
            "2, EXIT"
    })
    void findByGameStatusSuccessTest(String inputTestCase, GameStatus input) {
        GameStatus gameStatus = GameStatus.findByGameStatus(inputTestCase);
        assertEquals(input, gameStatus);
    }

    @DisplayName("게임_상태_체크_실패")
    @ParameterizedTest
    @CsvSource({
            "1, EXIT",
            "2, START"
    })
    void findByGameStatusFailTest(String inputTestCase, GameStatus input) {
        GameStatus gameStatus = GameStatus.findByGameStatus(inputTestCase);
        assertEquals(input, gameStatus);
    }
}
