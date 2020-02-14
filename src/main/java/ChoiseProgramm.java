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
        System.out.print("Введите номер приложения: ");
        Scanner scanerChoise = new Scanner(System.in);
        int choise = scanerChoise.nextInt();
        /*Проверка выбора опрерации пользователем, 1 или 2, иначе ошибка*/
        if (choise != 1 && choise != 2) {
            System.out.println("Ошибка ввода");
            System.exit(choise);
        } else {
            /*Если пользователь ввел 1, то запускается калькулятор*/
            if (choise == 1) {
                System.out.println("Выбран калькулятор");
                Calc newCalc = new Calc();
                newCalc.selectOperation();
                /*Если пользователь ввел 2, то запускается поиск максимального числа в массиве*/
            } else System.out.println("Выбран поиск максимального числа в массиве");
            ArrWords newArrWords = new ArrWords();
            newArrWords.maxWordsArr();
        }
        return choise;
    }
}
