/**
 * @author Barabanov D
 * @class Chocolate используется в классе Task4Candy
 */

public class Chocolate extends Candy {
    //Уникальный параметр класса Chocolate
    private String madeIn;

    //Конструктор класса Chocolate
    public Chocolate(String madeIn) {
        this.madeIn = madeIn;
    }

    //Сеттеры и геттеры
    public String getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }

    //Переопределение метода showInformationAboutCandy для класса Chocolate
    @Override
    public String showInformationAboutCandy(String title, int weight, double price) {
        return super.showInformationAboutCandy(title, weight, price);
    }
}
