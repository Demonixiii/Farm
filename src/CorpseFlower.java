public class CorpseFlower extends Flower{
    public CorpseFlower(String name, double price, double neededArea, double chanceOfGrowth) {
        super(name, price, neededArea, chanceOfGrowth);
    }

    @Override
    public void water() {
        setChanceOfGrowth(chanceOfGrowth + 30);
    }
}
