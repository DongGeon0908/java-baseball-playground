package baseball.view;

public class OutputView {

    public static void outputBallHint(int ballNum) {
        System.out.print(ballNum + "볼 ");
    }

    public static void outputStrikeHint(int strikeNum) {
        System.out.print(strikeNum + "스트라이크");
    }

    public static void outputNothingHint() {
        System.out.print("Nothing");
    }

    public static void successGame() {
        System.out.println();
        System.out.print("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        System.out.println();
    }
}
