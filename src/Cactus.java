public class Cactus extends Flower{

    public Cactus(String name, double price, double neededArea, double chanceOfGrowth) {
        super(name, price, neededArea, chanceOfGrowth);
    }

    @Override
    public void water() {
        setChanceOfGrowth(chanceOfGrowth + 80);chanceOfGrowth += 80;
    }

}
