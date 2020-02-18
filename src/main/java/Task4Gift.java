public class Task4Gift {

    Candy redCandy = new Candy("Аленка", 40, 50.50, "красный");

    //Candy, Jellybean, etc.

    class Candy {

        //Переменные класса Candy
        private String title;
        private int weight;
        private double price;
        private String color;

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

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

    }
}



