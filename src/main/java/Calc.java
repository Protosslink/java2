import java.util.Scanner;

public class Calc {

    //Ввод операции пользователем
    public int selectOperation() {
        System.out.println("Выбор операции");
        System.out.println("1 Сложение");
        System.out.println("2 Вычитание");
        System.out.println("3 Умножение");
        System.out.println("4 Деление");
        System.out.print("Введите номер операции: ");
        Scanner scannerSelectingAnOperation = new Scanner(System.in);
        int intSelectingAnOperation = scannerSelectingAnOperation.nextInt();
        //System.out.print("Вы выбрали операцию " + intSelectingAnOperation);
        if(intSelectingAnOperation > 4 || intSelectingAnOperation < 0){
            System.out.println("Ошибка ввода");
            System.exit(intSelectingAnOperation);
        }
        return intSelectingAnOperation;
    }
}






