package com.javaguru.student_vladimir_petranovski.lesson_13.level_3.task_20;
/*
Правильно ли написан try catch блок? Откомпилируется ли код?

try {

} catch (Exception e) {

} catch (ArithmeticException a) {

}

Создайте класс MultiCatchExample и в его main() методе
поместите правильный try catch блок и в коментариях напишите пояснение.
 */

class MultiCatchExample {
    public static void main(String[] args) {
        try {

        } catch (ArithmeticException e) {

        } catch (Exception a) {

        } // потому что блок catch пробегает по стеку исключений по иерархии,
    } //     если бы Exception был первым в  catch, тогда бы второй блок не нужен был
}
