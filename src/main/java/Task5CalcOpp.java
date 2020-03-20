import java.util.InputMismatchException;
import java.util.Scanner;

public class Task5CalcOpp {

    //Переменные
    private float numOne = 0;
    private float numTwo = 0;
    private float numResult = 0;
    private int numChoiceOperation = 0;
    float scannerNum = 0;


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
        try {
            Scanner scannerChoiseNum = new Scanner(System.in);
            int choiceNum = scannerChoiseNum.nextInt();
            if (choiceNum <= 0 || choiceNum > 4) {
                System.out.println("Ошибка ввода ");
                System.exit(choiceNum);
            }
            setNumChoiceOperation(choiceNum);
        } catch (InputMismatchException e) {
            System.out.println("Ошибка ввода");
            System.exit(numChoiceOperation);
        }
    }

    //Ввод чисел
    public float addNum() {
        try {
            System.out.print("Введите дробное число ");
            Scanner scannerAddNum = new Scanner(System.in);
            scannerNum = scannerAddNum.nextFloat();

        }catch (InputMismatchException e){
            System.out.println("Ошибка ввода");
            System.exit(numChoiceOperation);
        }
        return scannerNum;
    }

    //Сложение
    public void summation(float a, float b) {
        setNumResult(a + b);
    }

    //Вычитание
    public void subtraction(float a, float b) {
        setNumResult(a - b);
    }

    //Уможение
    public void multiplication(float a, float b) {
        setNumResult(a * b);
    }

    //Деление
    public void division(float a, float b) {
        setNumResult(a / b);
    }

    public void calculator() {
        switch (getNumChoiceOperation()) {
            case (1):
                summation(getNumOne(), getNumTwo());
                break;
            case (2):
                subtraction(getNumOne(), getNumTwo());
                break;
            case (3):
                multiplication(getNumOne(), getNumTwo());
                break;
            case (4):
                division(getNumOne(), getNumTwo());
                break;
            default:
                showFail();
                break;
        }
    }

    //Вывод результата
    public void showResult() {
        System.out.println(getNumResult());
    }

    //Вывод ошибки
    public void showFail() {
        System.out.println("Ошибка");
    }
}
