package baseball.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ComputerBaseballTest {

    @DisplayName("컴퓨터_넘버_생성_체크")
    @Test
    void randomNumberTest() {
        List<Integer> computerNumber = new ArrayList<>();
        Random random = new Random();


        while (computerNumber.size() != 3) {
            int number = random.nextInt(8) + 1;
            if (!computerNumber.contains(number)) {
                computerNumber.add(number);
            }
        }
        assertThat(computerNumber.size()).isEqualTo(3);
    }
}
