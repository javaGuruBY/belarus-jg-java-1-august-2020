package lesson_6.level_6_middle.task_24;

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

    boolean isWinPosition(int[][] field, int playerToCheck){
        TicTacToe ticTacToe = new TicTacToe();
        boolean winPosition = ticTacToe.isWinPositionForHorizontals(field, playerToCheck) ||
                              ticTacToe.isWinPositionForVerticals(field, playerToCheck) ||
                              ticTacToe.isWinPositionForDiagonals(field, playerToCheck);
        return winPosition;
    }

    boolean isDrawPosition(int[][] field){
        TicTacToe ticTacToe = new TicTacToe();
        int playerToCheck = 0;
        boolean winPositionPlayerOne = ticTacToe.isWinPositionForHorizontals(field, playerToCheck) ||
                ticTacToe.isWinPositionForVerticals(field, playerToCheck) ||
                ticTacToe.isWinPositionForDiagonals(field, playerToCheck);
        playerToCheck = 1;
        boolean winPositionPlayerTwo = ticTacToe.isWinPositionForHorizontals(field, playerToCheck) ||
                ticTacToe.isWinPositionForVerticals(field, playerToCheck) ||
                ticTacToe.isWinPositionForDiagonals(field, playerToCheck);
        boolean nonEmptyCell = true; // must be false
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if(field[i][j] == -1){
                    nonEmptyCell = false;
                }
            }
        }
        if(winPositionPlayerOne == false && winPositionPlayerTwo == false && nonEmptyCell == true){
            return true;
        }
        else return false;
    }

    int[][] createField(){
        int [][] field = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                field[i][j] = -1;
            }
        }
        return field;
    }
}
