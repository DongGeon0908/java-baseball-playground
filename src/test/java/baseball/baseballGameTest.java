package baseball;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class baseballGameTest {
    baseballGame baseball;

    @DisplayName("setUp")
    @BeforeEach
    public void setUp() {
        baseball = new baseballGame();
    }

    @DisplayName("난수 생성기")
    @Test
    public void randomNum(){
        assertEquals(3, baseball.randomNum().size());
    }


    @DisplayName("tearDown()")
    @AfterEach
    public void tearDown() {
        baseball = null;
    }

}
