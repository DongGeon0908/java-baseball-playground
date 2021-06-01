package baseball;

public class ResultView {

    // 사용자의 입력값에 따른 Ball Count
    void ballResult(int ballNum) {
        if (ballNum == 0) {
            return;
        }
        System.out.print(ballNum + "볼 ");
    }

    // 사용자의 입력값에 따른 Strike Count
    void strikeResult(int strikeNum) {
        if (strikeNum == 0) {
            return;
        }
        System.out.println(strikeNum + "스트라이크");
    }

    // Strike Count를 통해 사용자의 입력이 정답인지 확인!
    boolean success(int strikeNum) {
        if (strikeNum == 3) {
            System.out.println(strikeNum + "개의 숫자를 모두 맞히셨습니다! 게임 종료");
            return true;
        }
        return false;
    }
}
