package com.javaguru.student_vadim_migun.training.HeadFirst;

class BeerSong {
    public static void main(String[] args) {

        int beerNum = 99;
        String word = "бутылок (бутылки)";

        while (beerNum > 0) {
            if (beerNum == 1) {
                word = "бутылка";
            }
            System.out.println(beerNum + " " + word + " пива на стене");
            System.out.println(beerNum + " " + word + " пива.");
            System.out.println("Возьми одну.");
            System.out.println("Пусти по кругу.");

            System.out.println();  // сделал пробел для читабельности в консоли

            beerNum = beerNum - 1;
             if (beerNum > 1) {   // исправил 0 на 1
                 System.out.println(beerNum + " " + word + " пива на стене");
             } else if (beerNum == 1) {    // дописал 3 строки
                 word = "бутылка";
                 System.out.println(beerNum + " " + word + " пива на стене!!!!");
             } else {
                 System.out.println("Нет бутылок пива на стене");
                 }

                  // исходный вариант

/*             beerNum = beerNum - 1;
             if (beerNum > 0) {
                 System.out.println(beerNum + " " + word + " пива на стене");
             } else {
                 System.out.println("Нет бутылок пива на стене");
             }
*/

        }
    }
}
