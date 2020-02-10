import java.util.Scanner;

/**
 * Create by Barabanov Dmitriy on 30.01.2019
 *
 * @author Barabanov Dmitriy
 */
public class Base {
    public static void main(String[] args) {

        //Выбор приложения
        ChoiseProgramm chProg = new ChoiseProgramm();
        int selected = chProg.ChoiseProg();

        //Запуск калькулятора
        Calc Calculator = new Calc();
        Calculator.selectOperation();

        //Сложение
        Calculator.summation();

    }
}


