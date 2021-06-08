package stringcalculator.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OperatorTest {

    @DisplayName("연산자_찾기_성공")
    @ParameterizedTest
    @CsvSource({
            "+, ADD",
            "-, SUBTRACT",
            "*, MULTIPLY",
            "/, DIVIDE"
    })
    void findByOperatorSuccessTest(String inputTestCase, Operator operator) {
        Operator op = Operator.findByOperator(inputTestCase);
        assertEquals(operator, op);
    }

    @DisplayName("연산자_찾기_실패")
    @ParameterizedTest
    @CsvSource({
            "/, ADD",
            "*, SUBTRACT",
            "+, MULTIPLY",
            "-, DIVIDE"
    })
    void findByOperatorFailTest(String inputTestCase, Operator operator) {
        Operator op = Operator.findByOperator(inputTestCase);
        assertEquals(operator, op);
    }

    @DisplayName("더하기_연산자_성공")
    @ParameterizedTest
    @CsvSource({
            "100, 100, 200",
            "200, 200, 400",
            "10, -10, 0"
    })
    void addSuccessTest(int num1, int num2, int result) {
        int actual = Operator.ADD.operate(num1, num2);
        assertThat(actual).isEqualTo(result);
    }

    @DisplayName("더하기_연산자_실패")
    @ParameterizedTest
    @CsvSource({
            "100, 100, -200",
            "200, 200, 300",
            "10, -10, 20"
    })
    void addFailTest(int num1, int num2, int result) {
        int actual = Operator.ADD.operate(num1, num2);
        assertThat(actual).isEqualTo(result);
    }

    @DisplayName("빼기_연산자_성공")
    @ParameterizedTest
    @CsvSource({
            "100, 100, 0",
            "200, 200, 0",
            "10, -10, 20"
    })
    void subtractSuccessTest(int num1, int num2, int result) {
        int actual = Operator.SUBTRACT.operate(num1, num2);
        assertThat(actual).isEqualTo(result);
    }

    @DisplayName("빼기_연산자_실패")
    @ParameterizedTest
    @CsvSource({
            "100, 100, 200",
            "200, 200, 100",
            "10, -10, 0"
    })
    void subtractFailTest(int num1, int num2, int result) {
        int actual = Operator.SUBTRACT.operate(num1, num2);
        assertThat(actual).isEqualTo(result);
    }


    @DisplayName("곱하기_연산자_성공")
    @ParameterizedTest
    @CsvSource({
            "100, 100, 10000",
            "200, 200, 40000",
            "10, -10, -100"
    })
    void multiplySuccessTest(int num1, int num2, int result) {
        int actual = Operator.MULTIPLY.operate(num1, num2);
        assertThat(actual).isEqualTo(result);
    }

    @DisplayName("곱하기_연산자_실패")
    @ParameterizedTest
    @CsvSource({
            "100, 100, -10000",
            "200, 200, 10000",
            "10, -10, 100"
    })
    void multiplyFailTest(int num1, int num2, int result) {
        int actual = Operator.MULTIPLY.operate(num1, num2);
        assertThat(actual).isEqualTo(result);
    }

    @DisplayName("나누기_연산자_성공")
    @ParameterizedTest
    @CsvSource({
            "100, 100, 1",
            "200, 200, 1",
            "10, -10, -1"
    })
    void divideSuccessTest(int num1, int num2, int result) {
        int actual = Operator.MULTIPLY.operate(num1, num2);
        assertThat(actual).isEqualTo(result);
    }

    @DisplayName("나누기_연산자_실패")
    @ParameterizedTest
    @CsvSource({
            "100, 100, 2",
            "200, 200, 3",
            "10, -10, -4"
    })
    void divideFailTest(int num1, int num2, int result) {
        int actual = Operator.MULTIPLY.operate(num1, num2);
        assertThat(actual).isEqualTo(result);
    }

}
