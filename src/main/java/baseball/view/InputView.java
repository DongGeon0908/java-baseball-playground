package baseball.view;

import java.util.Scanner;

public class InputView {

    private static final Scanner scanner = new Scanner(System.in);

    public String inputNumberMessage() {
        System.out.println();
        System.out.print("숫자를 입력해 주세요 : ");

        return scanner.nextLine();
    }

    public String choiceGameMessage() {
        System.out.print("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        System.out.println();

        return scanner.nextLine();
    }

}
