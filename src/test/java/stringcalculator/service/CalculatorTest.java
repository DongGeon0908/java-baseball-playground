package stringcalculator.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import stringcalculator.model.Operator;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

    @DisplayName("사용자_입력_파싱_체크_성공")
    @ParameterizedTest
    @CsvSource({
            "3",
            "-6",
            "+10"
    })
    void checkNumberSuccessTest(String inputTestCase) {
        Integer.parseInt(inputTestCase);
    }


    @DisplayName("사용자_입력_파싱_체크_실패")
    @ParameterizedTest
    @CsvSource({
            "3)",
            "%6",
            "@10"
    })
    void checkNumberFailTest(String inputTestCase) {
        Integer.parseInt(inputTestCase);
    }


    @DisplayName("계산기_연산_성공")
    @ParameterizedTest
    @CsvSource({
            "3, 5, +, 8",
            "-6, 6, +, 0",
            "100, -50, +, 50"
    })
    void calculateSuccessTest(int num1, int num2, String op, int result) {
        int calculatorResult = Operator.findByOperator(op).operate(num1, num2);
        assertThat(calculatorResult).isEqualTo(result);
    }


    @DisplayName("계산기_연산_실패")
    @ParameterizedTest
    @CsvSource({
            "3, 5, +, -8",
            "-6, 6, +, 3",
            "100, -50, +, 1000"
    })
    void calculateFailTest(int num1, int num2, String op, int result) {
        int calculatorResult = Operator.findByOperator(op).operate(num1, num2);
        assertThat(calculatorResult).isEqualTo(result);
    }

    @DisplayName("계산기_연산_결과_성공")
    @ParameterizedTest
    @CsvSource({
            "3 + 6, 9",
            "5 - 10 + 6, 1",
            "6 * 10 + 15, 75"
    })
    void resultCalculatorSuccessTest(String inputText, int result) {
        Queue<String> values = new LinkedList<>(Arrays.asList(inputText.split(" ")));

        int testResult = Integer.parseInt(values.poll());
        while (!values.isEmpty()) {
            String operator = values.poll();
            int number = Integer.parseInt(values.poll());
            testResult = Operator.findByOperator(operator).operate(testResult, number);
        }

        assertThat(testResult).isEqualTo(result);
    }

    @DisplayName("계산기_연산_결과_실패")
    @ParameterizedTest
    @CsvSource({
            "3 - 6, 9",
            "5 - 10 * 6, 1",
            "6 * 10 + 15, -75"
    })
    void resultCalculatorFailTest(String inputText, int result) {
        Queue<String> values = new LinkedList<>(Arrays.asList(inputText.split(" ")));

        int testResult = Integer.parseInt(values.poll());
        while (!values.isEmpty()) {
            String operator = values.poll();
            int number = Integer.parseInt(values.poll());
            testResult = Operator.findByOperator(operator).operate(testResult, number);
        }

        assertThat(testResult).isEqualTo(result);
    }
}
