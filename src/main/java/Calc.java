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
            if (intSelectingAnOperation == 1) summation(addNum(), addNum());
            else if (intSelectingAnOperation == 2) subtraction(addNum(), addNum());
            else if (intSelectingAnOperation == 3) multiplication(addNum(), addNum());
            else if (intSelectingAnOperation == 4) division(addNum(), addNum());
        }
        return intSelectingAnOperation;
    }

    //Ввод числа
    public float addNum() {
        Scanner scannerAddNum = new Scanner(System.in);
        System.out.print("Введите дробное число: ");
        return scannerAddNum.nextFloat();
    }

    //Сложение
    public void summation(float a, float b) {
        System.out.printf("%.4f", a + b);
    }

    //Вычитание
    public void subtraction(float a, float b) {
        System.out.printf("%.4f", a - b);
    }

    //Уможение
    public void multiplication(float a, float b) {
        System.out.printf("%.4f", a * b);
    }

    //Деление
    public void division(float a, float b) {
        System.out.printf("%.4f", a / b);
    }
}









