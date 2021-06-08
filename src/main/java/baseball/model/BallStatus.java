package baseball.model;

import java.util.List;

public class BallStatus {
    private boolean strike = false;
    private boolean ball = false;

    public boolean getStrikeStatus(){
        return this.strike;
    }

    public boolean getBallStatus(){
        return this.ball;
    }

    public void setStrikeStatus(int num1, int num2) {
        this.strike = isStrike(num1, num2);
    }

    public void setBallStatus(List<Integer> num1, Integer num2) {
        this.ball = isBall(num1, num2);
    }

    // 비교하는 로직이 BallStatus 책임인지..
    private boolean isStrike(Integer num1, Integer num2) {
        return num1.equals(num2);
    }

    // 비교하는 로직이 BallStatus 책임인지.. --> contains
    private boolean isBall(List<Integer> num1, Integer num2) {
        return num1.contains(num2);
    }

}
