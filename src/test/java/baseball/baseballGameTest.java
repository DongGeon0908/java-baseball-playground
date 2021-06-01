package baseball;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class baseballGameTest {
    BaseballGame baseballGame;

    @DisplayName("setUp")
    @BeforeEach
    public void setUp() {
        baseballGame = new BaseballGame();
    }

    @DisplayName("난수 생성기")
    @Test
    public void randomNum() {
        int actual = baseballGame.randomNum().size();
        assertEquals(3, actual);
    }

    @DisplayName("생성된 난수 문자열로 변환")
    @Test
    public void convertNum() {
        int actual = baseballGame.convertNum(baseballGame.randomNum()).length();
        assertEquals(3, actual);
    }


    @DisplayName("equals Test")
    @Test
    public void equals() {
        int actual = baseballGame.equals('1', '4');
        assertEquals(0, actual);
    }

    @DisplayName("Strike 개수 반환")
    @Test
    public void checkStrike() {
        int actual = baseballGame.checkStrike("123", "163");
        assertEquals(2, actual);
    }

    @DisplayName("입력값의 위치에 있는 값을 제외시키기")
    @Test
    public void substring() {
        String actual = baseballGame.substring(2, "abc");
        assertEquals("ab", actual);
    }

    @DisplayName("값이 포함되어 있는지 비교")
    @Test
    public void contains() {
        int actual = baseballGame.contains('1', "321");
        assertEquals(1, actual);
    }

    @DisplayName("Ball 개수 반환")
    @Test
    public void checkBall() {
        int actual = baseballGame.checkBall("123", "356");
        assertEquals(1, actual);
    }


    @DisplayName("tearDown()")
    @AfterEach
    public void tearDown() {
        baseballGame = null;
    }

}
