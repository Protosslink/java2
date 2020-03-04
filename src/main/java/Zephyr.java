/**
 * @author Barabanov D
 * @class Zephyr  используется в классе Task4Gif
 */

public class Zephyr extends Candy {
    //Уникальный параметр класса Zephyr
    private String color;

    //Конструктор класса Zephyr
    public Zephyr(String color) {
        this.color = color;
    }

    //Сеттеры и геттеры
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //Переопределение метода showInformationAboutCandy для класса Zephyr
    @Override
    public String showInformationAboutCandy(String title, int weight, double price) {
        return super.showInformationAboutCandy(title, weight, price);
    }
}
