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
        jellybean.setPrice(100);
        //Создание объекта Зефир
        Zephyr zephyr = new Zephyr();
        zephyr.setTitle("Зефир");
        zephyr.setWeight(30);
        zephyr.setPrice(200);
        //Создание объекта Шоколад
        Chocolate chocolate = new Chocolate();
        chocolate.setTitle("Шоколад");
        chocolate.setWeight(40);
        chocolate.setPrice(300);
        //Информация о сладостях
        jellybean.showInformationAboutCandy();
        chocolate.showInformationAboutCandy();
        zephyr.showInformationAboutCandy();
        //Подсчет общей цены подарка
        System.out.println("Стоимость подарка = " + jellybean.getPrice() + chocolate.getPrice() + zephyr.getPrice());
        //Подсчет Общего веса подарка
        System.out.println("Вес подарка = " + jellybean.getWeight() + chocolate.getWeight() + zephyr.getWeight());

    }
}


