/**
 * @author Barabanov D
 * @class Candy  используется в классе Task4Candy
 */

public class Candy {

    //Массив candy, в подарке 3 сладостей
    Candy[] candyArr = new Candy[3];
    //Общие переменные класса Candy
    private String title;
    private int weight;
    private double price;
    private String informationAboutCandy;
    int sumWeight = 0;
    double sumPrice = 0;


    //Сеттеры и геттеры
        public String getInformationAboutCandy() {
        return informationAboutCandy;
    }

    public void setInformationAboutCandy(String informationAboutCandy) {
        this.informationAboutCandy = informationAboutCandy;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String showInformationAboutCandy(String title, int weight, double price) {
        return ("Название сладости " + getTitle() + " вес " + getWeight() + " цена " + getPrice());
    }

    public double showSumPrice() {
        System.out.println("Общая сумма подарка: " + sumPrice);
        return sumPrice;
    }

    public int showSumWeight() {
        System.out.println("Общий вес подарка: " + sumWeight);
        return sumWeight;
    }

    public double calculationSumPrice() {
        for (int i = 0; i < candyArr.length; i++) {
            sumPrice = sumPrice + candyArr[i].getPrice();
         //   System.out.println(sumPrice + " test");
        }
        return sumPrice;
    }

    public int calculationSumWeight() {
        for (int i = 0; i < candyArr.length; i++) {
            sumWeight = sumWeight + candyArr[i].getWeight();
           // System.out.println(sumWeight + " test");
        }
        return sumWeight;
    }
}