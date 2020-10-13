package lesson_6.level_5_middle.task_21;

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

    boolean isWinPositionForVerticals(int[][] field, int playerToCheck){
        boolean winVertical = false;
        for (int i = 0; i < field.length; i++) {
            winVertical = true;
            for (int j = 0; j < field[i].length; j++) {
                if(playerToCheck != field[j][i]){
                    winVertical = false;
                }
            }
            if(winVertical) {
                break;
            }
        }
        return winVertical;
    }

    boolean isWinPositionForDiagonals(int[][] field, int playerToCheck){
        boolean winFirstDiagonal = true;
        for (int i = 0; i < field.length; i++) {
            if(playerToCheck != field[i][i]){
                winFirstDiagonal = false;
                break;
            }
        }
        boolean winSecondDiagonal = true;
        for (int i = 0; i < field.length; i++) {
            if(playerToCheck != field[i][field.length - 1 - i]){
                winSecondDiagonal = false;
                break;
            }
        }
        if(winFirstDiagonal || winSecondDiagonal){
            return true;
        }
        else return false;
    }
}
