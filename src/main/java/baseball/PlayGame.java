package baseball;

public class PlayGame {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        ResultView resultView = new ResultView();
        BaseballGame baseballGame = new BaseballGame();

        // 컴퓨터 난수 저장 변수 선언
        String computerNum = "";
        
        // 게임시작
        while (true) {
            // 사용자 입력
            String input = inputView.input();

            // 컴퓨터 난수 저장 변수에 아무것도 없으면, 새롭게 난수를 저장
            if (computerNum.equals("")) {
                computerNum = baseballGame.convertNum(baseballGame.randomNum());
            }

            // 사용자가 입력한 값과 컴퓨터 난수를 비교해서 Ball Count 출력
            int ballCount = baseballGame.checkBall(input, computerNum);
            resultView.ballResult(ballCount);

            // 사용자가 입력한 값과 컴퓨터 난수를 비교해서 Strike Count 출력
            int strikeCount = baseballGame.checkStrike(input, computerNum);
            resultView.strikeResult(strikeCount);

            // Strike Count가 3이 되면 사용자 승리
            boolean successProblem = resultView.success(strikeCount);

            // 게임의 재시작 또는 종료에 대한 응답을 저장하기 위한 변수
            String continueGame = "";
            
            // 재시작 또는 종료할지 사용자의 입력 받기
            if (successProblem) {
                continueGame = inputView.newEnd();
            }
            
            // 게임 종료
            if (continueGame.equals("2")) {
                break;
            }

            // 게임 재시작
            if (continueGame.equals("1")) {
                computerNum = "";
            }


        }
    }
}
