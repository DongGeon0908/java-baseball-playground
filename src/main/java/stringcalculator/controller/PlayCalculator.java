package stringcalculator.controller;

import stringcalculator.service.Calculator;
import stringcalculator.model.InputData;
import stringcalculator.view.InputView;
import stringcalculator.view.OutputView;


public class PlayCalculator {
    public void startCalculator() {

        String userInput = new InputView().input();

        InputData validation = new InputData(userInput);

        int result = new Calculator(validation).getResult();

        new OutputView(result);
    }
}
