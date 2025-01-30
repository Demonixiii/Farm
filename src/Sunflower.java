public class Sunflower extends Flower{
    public Sunflower(String name, double price, double neededArea, double chanceOfGrowth) {
        super(name, price, neededArea, chanceOfGrowth);
    }

    @Override
    public void water() {
        setChanceOfGrowth(chanceOfGrowth + 60);
    }
}
