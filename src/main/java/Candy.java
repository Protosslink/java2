/**
 * @author Barabanov D
 * @class Candy  используется в классе Task4Candy
 */

public class Candy {

    //Общие переменные класса Candy
    private String title;
    private int weight;
    private double price;

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

    public void showInformationAboutCandy(){
        System.out.println("Название сладости " + getTitle() + " Вес " + getWeight() + " цена " + getPrice());
    }


}