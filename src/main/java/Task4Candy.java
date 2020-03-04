/**
 * @author Barabanov D
 * @class Task4Candy  используется в классе ChoiseProgramm
 */

public class Task4Candy {


    //Набор подарка
    public void addGift() {
        //Создание объекта Мармелад
      /*  Jellybean jellybean = new Jellybean();
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
        jellybean.showInformationAboutCandy(jellybean.getTitle(),jellybean.getWeight(),jellybean.getPrice());
        chocolate.showInformationAboutCandy(chocolate.getTitle(),chocolate.getWeight(),chocolate.getPrice());
        zephyr.showInformationAboutCandy(zephyr.getTitle(),zephyr.getWeight(),zephyr.getPrice());
        //Подсчет общей цены подарка
        sumPrice(jellybean.getPrice(), chocolate.getPrice(), zephyr.getPrice());
        //Подсчет Общего веса подарка
        sumWeight(jellybean.getWeight(), chocolate.getWeight(), zephyr.getWeight());*/

        Candy candy = new Candy();
        Chocolate chocolate = new Chocolate("Россия");
        chocolate.setPrice(20);
        chocolate.setWeight(40);
        chocolate.setTitle("Шоколад");
        chocolate.setInformationAboutCandy(chocolate.showInformationAboutCandy(chocolate.getTitle(), chocolate.getWeight(), chocolate.getPrice()) + " произведенно " + chocolate.getMadeIn());
        System.out.println(chocolate.getInformationAboutCandy());
        Zephyr zephyr = new Zephyr("Красный");
        zephyr.setTitle("Зефир");
        zephyr.setPrice(10);
        zephyr.setWeight(50);
        zephyr.setInformationAboutCandy(zephyr.showInformationAboutCandy(zephyr.getTitle(), zephyr.getWeight(), zephyr.getPrice()) + " цвет " + zephyr.getColor());
        System.out.println(zephyr.getInformationAboutCandy());
        Jellybean jellybean = new Jellybean(60);
        jellybean.setTitle("мармелад");
        jellybean.setPrice(20);
        jellybean.setWeight(30);
        jellybean.setInformationAboutCandy(jellybean.showInformationAboutCandy(jellybean.getTitle(), jellybean.getWeight(), jellybean.getPrice()) + " калории " + jellybean.getCalories());
        System.out.println(jellybean.getInformationAboutCandy());
        candy.candyArr[0] = chocolate;
        candy.candyArr[1] = zephyr;
        candy.candyArr[2] = jellybean;
        candy.calculationSumPrice();
        candy.calculationSumWeight();
        candy.showSumPrice();
        candy.showSumWeight();


    }

}


