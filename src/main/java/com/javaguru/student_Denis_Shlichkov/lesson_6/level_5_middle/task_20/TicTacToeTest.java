package lesson_6.level_5_middle.task_20;

class TicTacToeTest {
    public static void main(String[] args) {
        TicTacToeTest test = new TicTacToeTest();
        test.winHorizontalTest();
        test.winVerticalsTest();
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
}
