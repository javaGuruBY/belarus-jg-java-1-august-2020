package lesson_6.level_5_middle.task_19;

class TicTacToe {
    boolean isWinPositionForHorizontals(int[][] field, int playerToCheck){
        boolean winHorizontal = false;
        for (int i = 0; i < field.length; i++) {
            winHorizontal = true;
            for (int j = 0; j < field[i].length; j++) {
                if(playerToCheck != field[i][j]){
                    winHorizontal = false;
                }
            }
            if(winHorizontal) {
                break;
            }
        }
        return winHorizontal;
    }
}
