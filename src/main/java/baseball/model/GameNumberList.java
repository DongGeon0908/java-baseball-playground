package baseball.model;

import java.util.ArrayList;
import java.util.List;

public class GameNumberList {

    private final List<Integer> numberList;

    public GameNumberList(List<Integer> inputNumberList){
        this.numberList = inputNumberList;
    }

    public List<Integer> getNumberList() {
        return this.numberList;
    }

}
