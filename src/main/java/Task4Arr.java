public class Task4Arr {

    //Генерация случайного числа в диапозоне min, max
    public int numArr(int min, int max) {
        int diapason = max + Math.abs(min) + 1;
        return (int) (Math.random() * diapason) - max;
    }


    public void addArrInt() {
        //Объявление массива
        int[] arr;
        //Определение Массива
        arr = new int[20];
        //Заполнение массива
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = numArr(-10, 10);
            System.out.println(arr[i]);
        }
    }
}


