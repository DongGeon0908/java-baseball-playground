package baseball.model;

import java.util.*;

public class ComputerNumber {

    private final List<Integer> randomNumber = new ArrayList<>();

    // number의 책임
    public List<Integer> getRandomNumber() {
        return setRandomNumber();
    }

    // number의 책임
    private List<Integer> setRandomNumber() {
        while (randomNumber.size() != 3) {
            containsNumber(randomNumber, createRandomNumber());
        }
        return randomNumber;
    }


    private final Random random = new Random();

    // 랜덤 number의 책임
    private void containsNumber(List<Integer> number, int randomNumber) {
        if (!number.contains(randomNumber)) {
            number.add(randomNumber);
        }
    }

    // 랜덤 넘버의 책임
    private int createRandomNumber() {
        return random.nextInt(8) + 1;
    }

}
