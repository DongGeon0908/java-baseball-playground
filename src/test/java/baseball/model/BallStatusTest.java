package baseball.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BallStatusTest {

    @DisplayName("베이스볼_스트라이크_상태_체크")
    @Test
    void isStrikeTest() {

        List<Integer> userNumber = new ArrayList<>();
        userNumber.add(1);
        userNumber.add(2);
        userNumber.add(3);


        List<Integer> computerNumber = new ArrayList<>();
        computerNumber.add(1);
        computerNumber.add(2);
        computerNumber.add(3);

        boolean actual = userNumber.get(2) == computerNumber.get(2);
        assertThat(actual).isEqualTo(true);
    }

    @DisplayName("베이스볼_볼_상태_체크")
    @Test
    void isBallTest() {

        List<Integer> computerNumber = new ArrayList<>();
        computerNumber.add(1);
        computerNumber.add(2);
        computerNumber.add(3);

        for (int i : computerNumber) {
            assertThat(i).isEqualTo(2);
        }


    }

}
