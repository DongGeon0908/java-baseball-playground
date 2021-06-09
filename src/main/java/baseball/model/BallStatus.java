package baseball.model;

public class BallStatus {
    private boolean strike = false;
    private boolean ball = false;

    private final UserBaseball userBaseball;
    private final ComputerBaseball computerBaseball;

    public BallStatus(UserBaseball userBaseball, ComputerBaseball computerBaseball, int location) {
        this.userBaseball = userBaseball;
        this.computerBaseball = computerBaseball;

        isStrike(location);

        if (!this.strike) {
            isBall(location);
        }
    }

    public boolean getStrikeStatus() {
        return this.strike;
    }

    public boolean getBallStatus() {
        return this.ball;
    }

    private void isStrike(int location) {

        // baseball에서 비교를 담당하도록 해도 좋다.. // baseballNumber 2개를 비교하는것...--> 추상화 <- 컴퓨터, 유저
        int userBaseballNumber = userBaseball.getBaseballNumber().get(location);
        int computerBaseballNumber = computerBaseball.getBaseballNumber().get(location);
        this.strike = userBaseballNumber == computerBaseballNumber;
    }

    private void isBall(int location) {
        int userBaseballNumber = userBaseball.getBaseballNumber().get(location);

        if (computerBaseball.getBaseballNumber().contains(userBaseballNumber)) {
            this.ball = true;
        }
    }

}
