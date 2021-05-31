package stringCalculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class stringCalculatorTest {
    stringCalculator strCal;

    @DisplayName("setUp")
    @BeforeEach
    public void setUp() {
        strCal = new stringCalculator();
    }

    @DisplayName("문자열 나누기")
    @Test
    public void split() {
        String[] actual = strCal.split("2 + 3 * 4 / 2");
        assertThat(actual).containsExactly("2", "+", "3", "*", "4", "/", "2");
    }

    @DisplayName("숫자 구하기")
    @Test
    public void numberSplit() {
        int[] actual = strCal.numberSplit(new String[]{"2", "+", "3", "*", "4", "/", "2"});
        assertThat(actual).containsExactly(2, 3, 4, 2);
    }

    @DisplayName("기호 구하기")
    @Test
    public void operatorSplit() {
        String[] actual = strCal.operatorSplit(new String[]{"2", "+", "3", "*", "4", "/", "2"});
        assertThat(actual).containsExactly("+", "*", "/");
    }


    @DisplayName("더하기")
    @Test
    public void add() {
        assertEquals(10, strCal.add(5, 5));
    }

    @DisplayName("빼기")
    @Test
    public void subtract() {
        assertEquals(10, strCal.subtract(20, 10));
    }

    @DisplayName("곱하기")
    @Test
    public void multiply() {
        assertEquals(10, strCal.multiply(1, 10));
    }

    @DisplayName("나누기")
    @Test
    public void divide() {
        assertEquals(5, strCal.divide(20, 4));
    }

    @DisplayName("tearDown()")
    @AfterEach
    public void tearDown() {
        strCal = null;
    }


}
