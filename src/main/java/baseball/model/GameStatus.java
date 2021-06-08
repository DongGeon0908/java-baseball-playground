package baseball.model;

import java.util.Arrays;

public enum GameStatus {
    START("1"){
        @Override
        public boolean choiceGameStatus() {
            return true;
        }
    },
    EXIT("2"){
        @Override
        public boolean choiceGameStatus() {
            return false;
        }
    };

    private final String choice;

    GameStatus(final String choice) {
        this.choice = choice;
    }

    public static GameStatus findByGameStatus(String inputChoice) {
        return Arrays.stream(GameStatus.values())
                .filter(status -> status.choice.equals(inputChoice))
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException("잘못된 입력입니다."));
    }

    public abstract boolean choiceGameStatus();

}
