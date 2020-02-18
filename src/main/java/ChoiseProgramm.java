/**
 * @author Barabanov Dmitriy
 * @class ChoiseProgramm используется в классе Base
 * @see #ChoiseProg
 */

import java.util.Scanner;

/*Выбор программы: Калькулятор или поиск максимального числа в массиве*/
public class ChoiseProgramm {

    public int ChoiseProg() {
        System.out.println("1 калькулятор");
        System.out.println("2 поиск максимального числа в массиве");
        System.out.println("3 задание 4 массив");
        System.out.println("4 задание 4 формирование подарка");
        System.out.print("Введите номер приложения: ");
        Scanner scanerChoise = new Scanner(System.in);
        int choise = scanerChoise.nextInt();
        /*Проверка выбора опрерации пользователем, 1 или 2, иначе ошибка*/
        if (choise < 1 || choise > 4) {
            System.out.println("Ошибка ввода");
            System.exit(choise);
        } else {
            /*Если пользователь ввел 1, то запускается калькулятор*/
            if (choise == 1) {
                System.out.println("Выбран калькулятор");
                Calc newCalc = new Calc();
                newCalc.selectOperation();
                /*Если пользователь ввел 2, то запускается поиск максимального числа в массиве*/
            } else if (choise == 2) {
                System.out.println("Выбран поиск максимального числа в массиве");
                ArrWords newArrWords = new ArrWords();
                newArrWords.maxWordsArr();
                /*Если пользователь ввел 3, то запускается задание 4 массив*/
            } else if (choise == 3) {
                System.out.println("Выбрано задание 4 массив");
                Task4Arr newTask = new Task4Arr();
                newTask.addArrInt();
            }else if (choise == 4) {
                System.out.println("Выбрано задание 4 Формирование подарка");
                Task4Gift newGift = new Task4Gift();

            }
        }
        return choise;
    }
}
