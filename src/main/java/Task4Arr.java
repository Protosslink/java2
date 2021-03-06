/**
 * @author Barabanov D
 * @class Task4Arr используется в классе ChoiseProgramm
 */

import java.util.Arrays;

public class Task4Arr {

    //Генерация случайного числа в диапозоне min, max
    public int numArr(int min, int max) {
        int diapason = max + Math.abs(min) + 1;
        return (int) (Math.random() * diapason) - max;
    }

    public void addArrInt() {

        int maxNegativeNum = 0; //Максимальный отрицательный элемент
        int minPositiveNum = 10; //Минимальный положительный элемент
        //Объявление массива
        int[] arr;
        //Определение Массива
        arr = new int[20];
        //Инициализация массива числами от -10 до 10
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = numArr(-10, 10);
        }
        //Вывод массива на экран
        System.out.println(Arrays.toString(arr));

        //Нахождение максимального отрицательного элемента
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < maxNegativeNum) {
                maxNegativeNum = arr[i];
            }
        }
        System.out.println("Максимальный отрицательный элемет = " + maxNegativeNum);

        //Нахождение минимального положительного числа
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0 && arr[i] < minPositiveNum) {
                minPositiveNum = arr[i];
            }
        }
        System.out.println("Минимальный положительный элемент = " + minPositiveNum);

        //Меняем местами максимально отрицательный и минимально положительный элементы в массиве
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == maxNegativeNum) {
                arr[i] = minPositiveNum;
            } else if (arr[i] == minPositiveNum) {
                arr[i] = maxNegativeNum;
            }
        }
        //Вывод массива на экран
        System.out.println(Arrays.toString(arr));
    }

}


