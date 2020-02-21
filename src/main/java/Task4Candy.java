import java.util.Scanner;

public class Task4Candy {

    //Ввод в консоль цвета
    public String scannerColor() {
        Scanner addScannerColor = new Scanner(System.in);
        System.out.print("Введите цвет: ");
        String scanerColor = addScannerColor.nextLine();
        //System.out.print(scanerColor);
        return scanerColor;
    }

    //Ввод в консоль веса
    public int scannerWeight() {
        Scanner addScannerWeight = new Scanner(System.in);
        System.out.print("Введите вес : ");
        int scanerColor = addScannerWeight.nextInt();
        //System.out.print(scanerColor);
        return scanerColor;
    }

    //Ввод в консоль цены
    public double scannerPrice() {
        Scanner addScannerPrice = new Scanner(System.in);
        System.out.print("Введите цену в рублях : ");
        double scanerPrice = addScannerPrice.nextDouble();
        //System.out.print(scanerColor);
        return scanerPrice;
    }

    //Общий вес подарка
    public int totalWeight(int candy, int jellybean) {
        return candy + jellybean;
    }

    //Общая стоимость подарка
    public double totalPrice(double candy, double jellybean) {
        return candy + jellybean;
    }

    public void gift() {
        //Создание объекта Конфета
        Candy candy = new Candy();
        candy.setTitle("Конфета");
        candy.setColor(scannerColor());
        candy.setWeight(scannerWeight());
        candy.setPrice(scannerPrice());

        //Создание объекта Мармелад
        Jellybean jellybean = new Jellybean();
        jellybean.setTitle("Мармелад");
        jellybean.setColor(scannerColor());
        jellybean.setWeight(scannerWeight());
        jellybean.setPrice(scannerPrice());

        //Вывод информации о подарке
        System.out.println("Информация о конфетах:");
        System.out.println(candy.getTitle() + " цвет " + candy.getColor() + " вес " + candy.getWeight() + " цена " + candy.getPrice());
        System.out.println("Информация о мармеладе:");
        System.out.println(jellybean.getTitle() + " цвет " + jellybean.getColor() + " вес " + jellybean.getWeight() + " цена " + jellybean.getPrice());
        //Общая информация о подарке
        System.out.println("Общая стоимость подарка: " + totalPrice(candy.getPrice(), jellybean.getPrice()));
        System.out.println("Общий вес подарка: " + totalWeight(candy.getWeight(), jellybean.getWeight()));
    }
}


