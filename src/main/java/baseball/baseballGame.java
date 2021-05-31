package baseball;

import java.util.*;

public class baseballGame {
    public static void main(String[] args) {

    }

    // 난수 생성 - 중복제거, size() == 3
    Map<Integer, Integer> randomNum() {
        Map<Integer, Integer> num = new HashMap<>();
        Random random = new Random();

        int count = 0;
        while (count < 3) {
            num.put(count++, random.nextInt(8) + 1);
        }

        return num;
    }


}
