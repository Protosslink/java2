import java.util.Scanner;

public class ChoiseProgramm {

    public int ChoiseProg() {
        System.out.println("1 калькулятор");
        System.out.println("2 поиск максимального числа в массиве");
        System.out.print("Введите номер приложения: ");
        Scanner scanerChoise = new Scanner(System.in);
        int choise = scanerChoise.nextInt();
        if (choise != 1 && choise != 2) {
            System.out.println("Ошибка ввода");
            System.exit(choise);
        } else {
            if (choise == 1) {
                System.out.println("Выбран калькулятор");
                Calc newCalc = new Calc();
                newCalc.selectOperation();
            } else System.out.println("Выбран поиск максимального числа в массиве");
        }
        return choise;
    }
}
