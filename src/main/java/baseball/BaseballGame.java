package baseball;

import java.util.*;

public class BaseballGame {

    // 난수 생성 - 중복제거, size() == 3
    Set<Integer> randomNum() {
        Set<Integer> num = new HashSet<>();
        Random random = new Random();

        while (num.size() != 3) {
            num.add(random.nextInt(8) + 1);
        }

        return num;
    }

    // 생성된 난수를 문자열로 변환
    String convertNum(Set<Integer> num) {
        StringBuffer stringBuffer = new StringBuffer();

        for (int index : num) {
            stringBuffer.append(index);
        }

        return stringBuffer.toString();
    }

    // Strike 개수 반환
    int checkStrike(String num1, String num2) {

        int strikeNum = 0;
        for (int index = 0; index < num1.length(); index++) {
            int count = equals(num1.charAt(index), num2.charAt(index));
            strikeNum += count;
        }
        return strikeNum;
    }

    // 위치와 값이 같은지 비교
    int equals(char num1, char num2) {
        if (num1 == num2) {
            return 1;
        }

        return 0;
    }

    // Ball 개수 반환
    int checkBall(String num1, String num2) {
        int ballNum = 0;
        for (int index = 0; index < num1.length(); index++) {
            int count = contains(num1.charAt(index), substring(index, num2));
            ballNum += count;
        }
        return ballNum;
    }

    // 값이 포함되어 있는지 비교　－－ｂｏｏｌｅａｎ으로
    int contains(char num1, String num2) {
        if (num2.contains(String.valueOf(num1))) {
            return 1;
        }
        return 0;
    }

    // 입력값의 위치에 있는 값을 제외시키기
    String substring(int index, String num) {

        String substringNum = num.substring(0, index) + num.substring(index + 1);

        return substringNum;
    }

}
