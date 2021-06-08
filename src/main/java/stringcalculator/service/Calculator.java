package stringcalculator.service;


import stringcalculator.model.Operator;
import stringcalculator.model.InputData;

import java.util.Queue;

public class Calculator {

    private int result = 0;

    public Calculator(InputData inputData) {
        resultCalculator(inputData);
    }

    public int getResult() {
        return this.result;
    }

    private void resultCalculator(InputData inputData) {
        Queue<String> values = inputData.getNumberAndOperator();

        int result = inputCheckNumber(values.poll());
        while (!values.isEmpty()) {
            String operator = values.poll();
            int number = inputCheckNumber(values.poll());
            result = calculate(result, number, operator);
        }

        this.result = result;
    }

    private int calculate(int num1, int num2, String op) {
        return Operator.findByOperator(op).operate(num1, num2);
    }

    private int inputCheckNumber(String inputText) {
        int checkNumber = 0;
        try {
            checkNumber = Integer.parseInt(inputText);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        return checkNumber;
    }


}
