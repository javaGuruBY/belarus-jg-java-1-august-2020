package com.javaguru.student_vadim_migun.lesson_7.level_1.Task_1;

class FindWordInStr {

    public static void main(String[] args){
        String s = "AASDQWEas, asdawrqw qw asfasfa sfawtet asfasfa. 34n qw,.} qw qw a; a' a., a{[ a}], a a//.";
        String word = findWord(s);
        System.out.println(word);
    }

    public static String findWord(String s) {
        String[] str = s.split("\\W+");         // массив строк без разделителей
        int[] howMuch = new int[str.length];    // каждому слову соответствует число одинаковых
        int maxCount = 0;                       // число макс кол-вал встречающихся
        int index = 0;                          // последний индекс с макс.
        for(int i=0; i<str.length; i++)
            for(int j=0; j<str.length; j++)
                if(str[i].equals(str[j])) howMuch[i]++; // заполним массив
        for(int i=0; i<howMuch.length; i++)
            if(howMuch[i]>maxCount) {
                maxCount = howMuch[i];                  // найдем макс.
                index = i;                              // найдем индекс с макс.
            }
        return str[index];                     // здесь то самое слово под индексом
    }
}

