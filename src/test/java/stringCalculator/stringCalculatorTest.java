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
        int actual = strCal.add(5, 5);
        assertEquals(10, actual);
    }

    @DisplayName("빼기")
    @Test
    public void subtract() {
        int actual = strCal.subtract(20, 10);
        assertEquals(10, actual);
    }

    @DisplayName("곱하기")
    @Test
    public void multiply() {
        int actual = strCal.multiply(1, 10);
        assertEquals(10, actual);
    }

    @DisplayName("나누기")
    @Test
    public void divide() {
        int actual = strCal.divide(20, 4);
        assertEquals(5, actual);
    }

    @DisplayName("tearDown()")
    @AfterEach
    public void tearDown() {
        strCal = null;
    }


}
