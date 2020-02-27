/**
 * @author Barabanov D
 * @class Task4Candy  используется в классе ChoiseProgramm
 */

public class Task4Candy {


    //Набор подарка
    public void addGift() {
        //Создание объекта Мармелад
        Jellybean jellybean = new Jellybean();
        jellybean.setTitle("Мармелад");
        jellybean.setWeight(20);
        jellybean.setPrice(75.50);
        //Создание объекта Зефир
        Zephyr zephyr = new Zephyr();
        zephyr.setTitle("Зефир");
        zephyr.setWeight(30);
        zephyr.setPrice(200.12);
        //Создание объекта Шоколад
        Chocolate chocolate = new Chocolate();
        chocolate.setTitle("Шоколад");
        chocolate.setWeight(40);
        chocolate.setPrice(300.30);
        //Информация о сладостях
        jellybean.showInformationAboutCandy();
        chocolate.showInformationAboutCandy();
        zephyr.showInformationAboutCandy();
        //Подсчет общей цены подарка
        sumPrice(jellybean.getPrice(), chocolate.getPrice(), zephyr.getPrice());
        //Подсчет Общего веса подарка
        int sumWeight = jellybean.getWeight() + chocolate.getWeight() + zephyr.getWeight();
        System.out.println("Вес подарка = " + sumWeight);

    }
    public void sumPrice(double a, double b, double c){
        double d = a + b + c;
        System.out.println("Стоимость подарка = " + d);
    }
    public void sumWeight(int a, int b, int c){
        int d = a + b + c;
        System.out.println("Вес подарка = " + d);
    }
}


