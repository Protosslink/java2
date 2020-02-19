/**
 * @author Barabanov Dmitriy
 * @Class Calc используется в классе ChoiseProgramm
 * @see #selectOperation
 * @see #summation
 * @see #subtraction
 * @see #multiplication
 * @see #division
 */

import java.util.Scanner;

public class Calc {

    //Ввод и проверка ввода операции пользователем, функция возвращает номер операции (1,2,3,4)
    public int selectOperation() {
        String[] arr = new String[]{"", "сложение", "вычитание", "умножение", "деление"};
        System.out.println("Выбор операции");
        System.out.println("1 " + arr[1]);
        System.out.println("2 " + arr[2]);
        System.out.println("3 " + arr[3]);
        System.out.println("4 " + arr[4]);
        System.out.print("Введите номер операции: ");
        Scanner scannerSelectingAnOperation = new Scanner(System.in);
        int intSelectingAnOperation = scannerSelectingAnOperation.nextInt();
        if (intSelectingAnOperation > 4 || intSelectingAnOperation <= 0) {
            System.out.println("Ошибка ввода");
            System.exit(intSelectingAnOperation);
        } else {
            System.out.println("Выбрано " + arr[intSelectingAnOperation]);
            if (intSelectingAnOperation == 1) summation();
            else if (intSelectingAnOperation == 2) subtraction();
            else if (intSelectingAnOperation == 3) multiplication();
            else if (intSelectingAnOperation == 4) division();
        }
        return intSelectingAnOperation;
    }


    //Сложение
    public void summation() {
        Scanner scannerSummation = new Scanner(System.in);
        float x;
        float y;
        System.out.print("Введите дробное число: ");
        x = scannerSummation.nextFloat();
        System.out.print("Введите дробное число: ");
        y = scannerSummation.nextFloat();
        System.out.printf("%.4f", x + y);
    }

    //Вычитание
    public void subtraction() {
        Scanner scannerSummation = new Scanner(System.in);
        float x;
        float y;
        System.out.print("Введите дробное число: ");
        x = scannerSummation.nextFloat();
        System.out.print("Введите дробное число: ");
        y = scannerSummation.nextFloat();
        System.out.printf("%.4f", x - y);

    }

    //Уможение
    public void multiplication() {
        Scanner scannerSummation = new Scanner(System.in);
        float x;
        float y;
        System.out.print("Введите дробное число: ");
        x = scannerSummation.nextFloat();
        System.out.print("Введите дробное число: ");
        y = scannerSummation.nextFloat();
        System.out.printf("%.4f", x * y);

    }

    //Деление
    public void division() {
        Scanner scannerSummation = new Scanner(System.in);
        float x;
        float y;
        System.out.print("Введите дробное число: ");
        x = scannerSummation.nextFloat();
        System.out.print("Введите дробное число: ");
        y = scannerSummation.nextFloat();
        System.out.printf("%.4f", x / y);

    }
}









