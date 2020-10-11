package lesson_6.level_4_junior.task_18;

class TwoDimensionalArrayTest {
    public static void main(String[] args) {
        TwoDimensionalArrayTest test = new TwoDimensionalArrayTest();
        test.createArrayTest();
        test.amountElementsArray();
    }

    void createArrayTest(){
        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();
        int [][] array = new int[3][5];
        twoDimensionalArray.createArrayMatrix(array);
    }

    void amountElementsArray() {
        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();
        int [][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int amountElementsArray = twoDimensionalArray.amountNumbersOfArray(array);
        if(amountElementsArray == 45) {
            System.out.println("Test - OK");
        }
        else System.out.println("Test - FAIL");
    }
}
