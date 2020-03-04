/**
 * @author Barabanov D
 * @class Jellybean используется в классе Task4Candy
 */

public class Jellybean extends Candy {
    //Уникальный параметр класса Jellybean
    private int calories;

    //Конструктор класса Jellybean
    public Jellybean(int calories) {
        this.calories = calories;
    }

    //Сеттеры и геттеры
    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    //Переопределение метода showInformationAboutCandy для класса Jellybean
    @Override
    public String showInformationAboutCandy(String title, int weight, double price) {
        return super.showInformationAboutCandy(title, weight, price);
    }
}

