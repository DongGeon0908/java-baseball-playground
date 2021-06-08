package baseball.model;


// 게임 이겼는지 판단하는 것도 여기서 판단,,,
public class InningStatus {
    private int strike = 0;
    private int ball = 0;

    // 나띵이라는 변수를 쓸 필요가 있을까? -> isNothing이라는 메서드로 하면 좋을 것 같다.. 객체에 메세지를 던진다..
    private boolean nothing = true;

    public int getStrikeResult() {
        if (this.strike != 0) {
            setNothingResult();
        }

        return this.strike;
    }

    public void setStrikeResult(boolean isStrike) {
        if (isStrike) {
            this.strike += 1;
        }
    }

    public int getBallResult() {
        if (this.ball != 0) {
            setNothingResult();
        }

        return this.ball;
    }

    public void setBallResult(boolean isBall) {
        if (isBall) {
            this.ball += 1;
        }
    }

    public boolean getNothingResult() {
        return this.nothing;
    }
    
    // 외부에서 호출해서 값을 비교해서 사용되는 SRP를 깨트리느ㅜㄴ것이다...
    private void setNothingResult() {
        this.nothing = false;
    }

}
