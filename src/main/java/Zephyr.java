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
}
