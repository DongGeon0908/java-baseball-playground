package stringcalculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class InputCalculatorTest {
    InputCalculator inputCalculator;

    @DisplayName("setUp")
    @BeforeEach
    public void setUp() {
        inputCalculator = new InputCalculator();
    }

    @DisplayName("사용자_입력_오류_있음")
    @Test
    public void inputExceptionCheck(){
        inputCalculator.inputException("");
    }

    @DisplayName("사용자_입력_오류_없음")
    @Test
    public void inputExceptionUncheck(){
        inputCalculator.inputException("Hello");
    }

    @DisplayName("문자_입력_저장_성공")
    @Test
    public void initSuccess(){
        inputCalculator.init("2 + 3 * 4 / 2");
    }

    // 입력받은 문자를 저장할때 오류를 검사하는게 맞을까??
    @DisplayName("문자_입력_저장_실패")
    @Test
    public void initFail(){
        inputCalculator.init("2 + 3 ** 4 / 2");
    }

    @DisplayName("문자_숫자_파싱_성공")
    @Test
    public void checkNumberExceptionSuccess(){
        int actual = inputCalculator.checkNumberException("-20");
        assertEquals(-20, actual);
    }

    // 실패해야 하는데???
    @DisplayName("문자_숫자_파싱_실패")
    @Test
    public void checkNumberExceptionFail(){
        int actual = inputCalculator.checkNumberException("--20");
        assertEquals(-20, actual);
    }

    @DisplayName("tearDown()")
    @AfterEach
    public void tearDown() {
        inputCalculator = null;
    }
}
