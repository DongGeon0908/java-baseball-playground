package stringcalculator;


import java.util.Queue;

public class Calculator {

    private final InputCalculator inputCalculator;
    private final OutputCalculator outputCalculator;

    public Calculator() {
        this.inputCalculator = new InputCalculator();
        this.outputCalculator = new OutputCalculator();
    }

    public int calculate(int num1, int num2, String op) {
        return Operator.findByOperator(op).Operation(num1, num2);
    }

    public void playCalculator() {
        inputCalculator.init(inputCalculator.input());
        Queue<String> input = inputCalculator.getInputText();

        int result = inputCalculator.checkNumberException(input.poll());
        while (!input.isEmpty()) {
            String operator = input.poll();
            int number = inputCalculator.checkNumberException(input.poll());
            result = calculate(result, number, operator);
        }

        outputCalculator.output(result);
    }

}
