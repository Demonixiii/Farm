import java.util.Random;

public abstract class Flower {
    Random random = new Random();

    protected String name;
    protected double price;
    protected double neededArea;
    protected double chanceOfGrowth;

    public Flower(String name, double price, double neededArea, double chanceOfGrowth) {
        this.name = name;
        this.price = price;
        this.neededArea = neededArea;
        this.chanceOfGrowth = chanceOfGrowth;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", neededArea=" + neededArea +
                ", chanceOfGrowth=" + chanceOfGrowth +
                '}';
    }

    public void water(){
        chanceOfGrowth += 0;
    }

    public String grow(){
        if (random.nextInt(101) <= chanceOfGrowth) {
            price += 50;
            chanceOfGrowth = 5;
            return "Flower grow yay ^^";
        }
        return "No flower grow :(";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getNeededArea() {
        return neededArea;
    }

    public void setNeededArea(double neededArea) {
        if (neededArea > 100){
            this.neededArea = 100;
        }else if (neededArea < 5){
            this.neededArea = 5;
        }else {
            this.neededArea = neededArea;
        }
    }

    public double getChanceOfGrowth() {
        return chanceOfGrowth;
    }

    public void setChanceOfGrowth(double chanceOfGrowth) {
        if (chanceOfGrowth > 100){
            this.chanceOfGrowth = 100;
        } else if (chanceOfGrowth <5) {
            this.chanceOfGrowth = 5;
        }else {
            this.chanceOfGrowth = chanceOfGrowth;
        }
    }
}
