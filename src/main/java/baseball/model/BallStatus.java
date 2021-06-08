package baseball.model;

public class BallStatus {
    private boolean strike = false;
    private boolean ball = false;

    // 바로 메서드로 가져다 써도 편할것 같다....
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
        int userBaseballNumber = userBaseball.getUserBaseball().get(location);
        int computerBaseballNumber = computerBaseball.getComputerBaseball().get(location);
        this.strike = userBaseballNumber == computerBaseballNumber;
    }

    private void isBall(int location) {
        int userBaseballNumber = userBaseball.getUserBaseball().get(location);

        if (computerBaseball.getComputerBaseball().contains(userBaseballNumber)) {
            this.ball = true;
        }
    }

}
