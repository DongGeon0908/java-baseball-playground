package baseball.model;

import java.util.*;

// 추상화 단계에 대해 ...
public class ComputerBaseball {

    private final List<Integer> computerNumber;
    private final Random random = new Random();

    public ComputerBaseball() {
        computerNumber = new ArrayList<>();
        randomNumber();
    }

    public List<Integer> getComputerBaseball() {
        return computerNumber;
    }

    private void randomNumber() {
        while (computerNumber.size() != 3) {
            validateContainsNumber(createRandomNumber());
        }
    }

    private void validateContainsNumber(int number) {
        if (!computerNumber.contains(number)) {
            computerNumber.add(number);
        }
    }

    private int createRandomNumber() {
        return random.nextInt(8) + 1;
    }

}
