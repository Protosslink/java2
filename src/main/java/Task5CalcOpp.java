import java.util.Scanner;

public class Task5CalcOpp {

    //Переменные
    private float numOne = 0;
    private float numTwo = 0;
    private float numResult = 0;
    private int numChoiceOperation = 0;

    //Гетеры и сетеры
    public float getNumOne() {
        return numOne;
    }

    public void setNumOne(float numOne) {
        this.numOne = numOne;
    }

    public float getNumTwo() {
        return numTwo;
    }

    public void setNumTwo(float numTwo) {
        this.numTwo = numTwo;
    }

    public int getNumChoiceOperation() {
        return numChoiceOperation;
    }

    public void setNumChoiceOperation(int numChoiceOperation) {
        this.numChoiceOperation = numChoiceOperation;
    }

    public float getNumResult() {
        return numResult;
    }

    public void setNumResult(float numResult) {
        this.numResult = numResult;
    }

    //Выбор операции
    public void choiceOperation() {
        System.out.println("Выбор операции");
        String[] arr = new String[]{"", "1. сложение", "2. вычитание", "3. умножение", "4. деление"};
        for (int i = 1; i < arr.length; i++) System.out.println(arr[i]);
        System.out.print("Введите номер операции: ");
        Scanner scannerChoiseNum = new Scanner(System.in);
        int choiceNum = scannerChoiseNum.nextInt();
        setNumChoiceOperation(choiceNum);
        scannerChoiseNum.close();
    }

    //Расчет оперции

    //Вывод результата
    public void showResult() {
        System.out.println("Ответ " + getNumResult());
    }

    //Ввод чисел
    public float addNum() {
        System.out.print("Введите бробное число ");
        Scanner scannerAddNum = new Scanner(System.in);
        float scannerNum = scannerAddNum.nextFloat();
        return scannerNum;
    }
}
