package com.seproject.enums;

public enum DiceResult {
    //도개걸윷모에 대해 enum으로 정의하였다. moveSteps에 각 결과에 대한 이동 칸 수를 저장한다.
    DO(1),    //도: 1칸 이동
    GAE(2),   //개: 2칸 이동
    GEOL(3),  //걸: 3칸 이동
    YUT(4),   //윷: 4칸 이동
    MO(5),    //모: 5칸 이동
    BACKDO(-1); //빽도: -1칸 이동
    private final int moveSteps;  //각 결과에 대한 이동 칸 수

    //생성자이다. DiceResult의 각 값에 대해 이동 칸 수를 설정한다.
    DiceResult(int moveSteps) {
        this.moveSteps = moveSteps;
    }
    //이동할 칸 수를 반환한다.
    public int getMoveSteps() {
        return moveSteps;
    }

}