package lesson_6.level_2_intern.task_7;

class WhileDefinition4 {

    public static void main(String[] args) {
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            i++; //было вынесено из тела цикла
        }

    }
}
