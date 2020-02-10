
/**
 *
 *
 *
 */

import java.util.Scanner;


public class ChoiseProgramm {

    public int ChoiseProg () {
        System.out.println("Для запуска калькулятора введите 1");
        System.out.println("Для поиска максимального числа в массиве введите 2");
        System.out.print("Ввод числа: ");
        Scanner scanerChoise = new Scanner(System.in);
        int choise = scanerChoise.nextInt();
        if (choise != 1 && choise != 2) {
            System.out.println("Ошибка ввода");
            System.exit(choise);
        } else {
            if (choise == 1) System.out.println("Выбран калькулятор");
            else System.out.println("Выбран поиск максимального числа в массиве");
        }
        scanerChoise.close();
        return choise;
    }
}
