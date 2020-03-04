/**
 * @author Barabanov D
 * @class Jellybean используется в классе Task4Candy
 */

public class Jellybean extends Candy {
    //Уникальный параметр класса Jellybean
    private String calories;

    //Конструктор класса Jellybean
    public Jellybean(String calories) {
        this.calories = calories;
    }

    //Сеттеры и геттеры
    public String getCalories() {
        return calories;
    }

    public void setCalories(String calories) {
        this.calories = calories;
    }
}

