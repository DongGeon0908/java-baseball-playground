package stringcalculator;

import java.util.Arrays;

public enum Operator {

    ADD("+") {
        @Override
        public int Operation(int num1, int num2) {
            return num1 + num2;
        }
    }, SUBTRACT("-") {
        @Override
        public int Operation(int num1, int num2) {
            return num1 - num2;
        }
    }, MULTIPLY("*") {
        @Override
        public int Operation(int num1, int num2) {
            return num1 * num2;
        }
    }, DIVIDE("/") {
        @Override
        public int Operation(int num1, int num2) {
            return num1 / num2;
        }
    };

    private final String operator;

    Operator(final String operator) {
        this.operator = operator;
    }

    public static Operator findByOperator(String inputOperator) {
        return Arrays.stream(Operator.values())
                .filter(op -> op.operator.equals(inputOperator))
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException("잘못된 입력입니다."));
    }

    public abstract int Operation(int num1, int num2);
}
