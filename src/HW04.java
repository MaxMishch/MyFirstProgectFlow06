public class HW04 {
    public static void main(String[] args) {

//        Задача №1
//        Необходимо вывести числа от 0 до 15.

        for (int i = 1; i < 16; i++) {
            System.out.println(i);
        }


//        Задача №2
//        Необходимо вывести все положительные степени числа 5 которые меньше 10000, вывести результат возведения в степень.
        for (int i = 1; i < 10000; i = 5 * i) {
            System.out.println(i);
        }

//        Задача №3
//
//        Необходимо вывести все числа кратные 4 между числами 40 и 60 включительно.
//                Реализовать 2 варианта:
//        использовать конструкцию if для определения кратности (цикл с шагом 1, i = i + 1);
//        без использования конструкции if (шаг цикла на ваше усмотрение).

        for (int i = 40; i <= 60; i++) {
            if(i % 4 == 0){
                System.out.println(i);
            }
        }
        System.out.println("--------------------");

        int i = 40;
        do {
            System.out.println(i);
            i = i + 4;

        } while (i <= 60);

    }
}
