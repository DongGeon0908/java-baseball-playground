package baseball;

import java.util.Scanner;

public class InputView {
    
    // 사용자 문자 입력받기
    String input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자를 입력해 주세요 : ");

        return scanner.nextLine();

    }

    // 게임 재시작 또는 종료
    String newEnd() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

        return scanner.nextLine();
    }
}
