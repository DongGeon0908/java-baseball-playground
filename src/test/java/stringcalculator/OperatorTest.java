package stringcalculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OperatorTest {


    @DisplayName("더하기_연산자_성공")
    @Test
    public void AddSuccess() {
        int actual = Operator.ADD.Operation(100,100);
        assertThat(actual).isEqualTo(200);
    }

    @DisplayName("빼기_연산자_성공")
    @Test
    public void AddFail() {
        int actual = Operator.SUBTRACT.Operation(200,100);
        assertThat(actual).isEqualTo(100);
    }

    @DisplayName("곱하기_연산자_성공")
    @Test
    public void MultiplyFail() {
        int actual = Operator.MULTIPLY.Operation(10,10);
        assertThat(actual).isEqualTo(100);
    }

    @DisplayName("나누기_연산자_성공")
    @Test
    public void DivideFail() {
        int actual = Operator.DIVIDE.Operation(10,10);
        assertThat(actual).isEqualTo(1);
    }

    @DisplayName("연산자_검색_성공")
    @Test
    public void calculateSuccess() {
        Operator op = Operator.findByOperator("+");
        assertEquals(Operator.ADD, op);
    }

    @DisplayName("연산자_검색_실패")
    @Test
    public void calculateFail() {
        Operator op = Operator.findByOperator("+");
        assertEquals(Operator.DIVIDE, op);
    }

}
