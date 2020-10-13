package lesson_6.level_5_middle.task_22;

class TicTacToeTest {
        public static void main(String[] args) {
        TicTacToeTest test = new TicTacToeTest();
        test.winHorizontalTest();
        test.winVerticalsTest();
        test.isWinPositionForDiagonalsTest();
        test.isWinPositionTest();
    }

    void winHorizontalTest(){
        TicTacToe ticTacToe = new TicTacToe();
        int [][] field = {{-1, -1, -1}, {0, 0, 0}, {1, 1, 1}};
        int playerToCheck = 0;
        System.out.println("Test to Win Horizontals");
        boolean winHorizontal = ticTacToe.isWinPositionForHorizontals(field, playerToCheck);
        if(winHorizontal) {
            System.out.println("Test - OK");
        }
        else System.out.println("Test - FAIL");
        playerToCheck = 1;
        winHorizontal = ticTacToe.isWinPositionForHorizontals(field, playerToCheck);
        if(winHorizontal) {
            System.out.println("Test - OK");
        }
        else System.out.println("Test - FAIL");
        int [][] fieldSecond = {{1, 0, -1}, {-1, 0, 0}, {1, 0, 1}};
        winHorizontal = ticTacToe.isWinPositionForHorizontals(fieldSecond, playerToCheck);
        if(winHorizontal) {
            System.out.println("Test - FAIL");
        }
        else System.out.println("Test - OK");
    }

    void winVerticalsTest(){
        TicTacToe ticTacToe = new TicTacToe();
        int [][] field = {{1, -1, 1},
                          {0, 0, 1},
                          {1, 1, 1}};
        int playerToCheck = 1;
        System.out.println("Test to Win Verticals");
        boolean winVertical = ticTacToe.isWinPositionForVerticals(field, playerToCheck);
        if(winVertical) {
            System.out.println("Test - OK");
        }
        else System.out.println("Test - FAIL");
        int [][] fieldSecond = {{1, 0, 1},
                                {0, 0, 1},
                                {1, 0, 1}};
        playerToCheck = 0;
        winVertical = ticTacToe.isWinPositionForVerticals(fieldSecond, playerToCheck);
        if(winVertical) {
            System.out.println("Test - OK");
        }
        else System.out.println("Test - FAIL");
        int [][] fieldThird = {{1, 1, 1},
                               {0, 0, 0},
                               {-1,-1,-1}};
        winVertical = ticTacToe.isWinPositionForVerticals(fieldThird, playerToCheck);
        if(winVertical) {
            System.out.println("Test - FAIL");
        }
        else System.out.println("Test - OK");
    }

    void isWinPositionForDiagonalsTest(){
        TicTacToe ticTacToe = new TicTacToe();
        // two tests for first diagonal
        int [][] field = {{0, -1, 1},
                          {0, 0, 1},
                          {1, 1, 0}};
        int playerToCheck = 0;
        System.out.println("Test to Win Diagonals");
        boolean winDiagonals = ticTacToe.isWinPositionForDiagonals(field, playerToCheck);
        if(winDiagonals) {
            System.out.println("Test - OK");
        }
        else System.out.println("Test - FAIL");

        int [][] fieldTwo = {{0, -1, 1},
                             {0, -1, 1},
                             {1, 1, 0}};
        playerToCheck = 1;
        winDiagonals = ticTacToe.isWinPositionForDiagonals(fieldTwo, playerToCheck);
        if(winDiagonals) {
            System.out.println("Test - FAIL");
        }
        else System.out.println("Test - OK");

        // two tests for second diagonal
        int [][] fieldThree = {{0, -1, 1},
                               {0, 1, 1},
                               {1, 1, 0}};
        playerToCheck = 1;
        winDiagonals = ticTacToe.isWinPositionForDiagonals(fieldThree, playerToCheck);
        if(winDiagonals) {
            System.out.println("Test - OK");
        }
        else System.out.println("Test - FAIL");

        int [][] fieldFour = {{1, -1, 0},
                              {0, 0, 1},
                              {0, 1, 0}};
        playerToCheck = 0;
        winDiagonals = ticTacToe.isWinPositionForDiagonals(fieldFour, playerToCheck);
        if(winDiagonals) {
            System.out.println("Test - OK");
        }
        else System.out.println("Test - FAIL");
    }

    void isWinPositionTest(){
        TicTacToe ticTacToe = new TicTacToe();
        int [][] field = {{-1, -1, 1},
                {0, 0, 1},
                {1, 1, 0}};
        int playerToCheck = 1;
        boolean winPosition = ticTacToe.isWinPosition(field, playerToCheck);
        System.out.println("Test to Win Position");
        if(winPosition){
            System.out.println("Test - FAIL");
        }
        else System.out.println("Test - OK");

        int [][] fieldTwo = {{-1, -1, 1},
                             {0, 0, 0},
                             {1, 1, 0}};
        playerToCheck = 0;
        winPosition = ticTacToe.isWinPosition(fieldTwo, playerToCheck);
        if(winPosition){
            System.out.println("Test - OK");
        }
        else System.out.println("Test - FAIL");

        int [][] fieldThree = {{-1, -1, 0},
                               {0, 1, 0},
                               {1, 1, 0}};
        playerToCheck = 0;
        winPosition = ticTacToe.isWinPosition(fieldThree, playerToCheck);
        if(winPosition){
            System.out.println("Test - OK");
        }
        else System.out.println("Test - FAIL");

        int [][] fieldFour = {{-1,-1, 1},
                              { 0, 1, 0},
                              { 1, 1, 0}};
        playerToCheck = 1;
        winPosition = ticTacToe.isWinPosition(fieldFour, playerToCheck);
        if(winPosition){
            System.out.println("Test - OK");
        }
        else System.out.println("Test - FAIL");
    }
}
