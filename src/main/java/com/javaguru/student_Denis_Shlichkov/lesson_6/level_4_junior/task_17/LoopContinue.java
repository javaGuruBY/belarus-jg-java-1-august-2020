package lesson_6.level_4_junior.task_17;

class LoopContinue {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6};
        int sumNumberAfterThree = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] <= 3) {
                continue;
            }
            else {
                sumNumberAfterThree += arr[i];
            }
        }
        System.out.println("Sum of elements after the number three = " + sumNumberAfterThree);
    }
}
