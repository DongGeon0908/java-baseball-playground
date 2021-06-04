package stringcalculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator Calculator;

    @DisplayName("setUp")
    @BeforeEach
    public void setUp() {
        Calculator = new Calculator();
    }

    @DisplayName("문자_계산기_연산_성공")
    @Test
    public void calculateSuccess(){
        int actual = Calculator.calculate(3,5,"+");
        assertEquals(8, actual);
    }

    @DisplayName("문자_계산기_연산_실패")
    @Test
    public void calculateFail(){
        int actual = Calculator.calculate(3,5,"++");
        assertEquals(8, actual);
    }

    // Testcase를 작성할 수 없는 코드는 잘못된 코드일까요?
    @DisplayName("문자_계산기_실행_성공")
    @Test
    public void playCalculator(){
        Calculator.playCalculator();
    }

    @DisplayName("tearDown()")
    @AfterEach
    public void tearDown() {
        Calculator = null;
    }

}
