package baseball.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumber {
    private final Random random = new Random();

    public String getRandomNumber() {
        return saveRandomNumber();
    }

    private String saveRandomNumber() {
        List<Integer> data = new ArrayList<>();

        while (data.size() != 3) {
            int randomNumber = createRandomNumber();
            if (!data.contains(randomNumber)) {
                data.add(randomNumber);
            }
        }
        return makeStringData(data);
    }

    private String makeStringData(List<Integer> number) {
        StringBuilder stringBuilder = new StringBuilder();

        for (Integer index : number) {
            stringBuilder.append(index);
        }

        return stringBuilder.toString();
    }

    private int createRandomNumber() {
        return random.nextInt(8) + 1;
    }

}
