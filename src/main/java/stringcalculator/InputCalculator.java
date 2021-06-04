package stringcalculator;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class InputCalculator {

    private final Scanner scanner = new Scanner(System.in);
    private Queue<String> number;
    private int checkNumber;

    public void inputException(String inputText) {
        if (inputText.equals("") || inputText == null) {
            throw new IllegalArgumentException("잘못된 입력입니다.");
        }
    }

    public String input() {
        System.out.print("입력 : ");
        String inputText = scanner.nextLine();

        inputException(inputText);

        return inputText;
    }

    public void init(String inputText) {
        number = new LinkedList<>(Arrays.asList(inputText.split(" ")));
    }

    public int checkNumberException(String inputText) {
        try {
            checkNumber = Integer.parseInt(inputText);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        return checkNumber;
    }

    public Queue<String> getInputText() {
        return number;
    }
}
