public class Farm {
    private int flowerCount = 0;
    private int bigAnimorCount = 0;
    private int smallAnimorCount =0;
    private double areaSize = 100;

    public Farm(int flowerCount, int bigAnimorCount, int smallAnimorCount, double areaSize) {
        this.flowerCount = flowerCount;
        this.bigAnimorCount = bigAnimorCount;
        this.smallAnimorCount = smallAnimorCount;
        this.areaSize = areaSize;
    }

    public int getFlowerCount() {
        return flowerCount;
    }

    public void setFlowerCount(int flowerCount) {
        this.flowerCount = flowerCount;
    }

    public int getBigAnimorCount() {
        return bigAnimorCount;
    }

    public void setBigAnimorCount(int bigAnimorCount) {
        this.bigAnimorCount = bigAnimorCount;
    }

    public int getSmallAnimorCount() {
        return smallAnimorCount;
    }

    public void setSmallAnimorCount(int smallAnimorCount) {
        this.smallAnimorCount = smallAnimorCount;
    }

    public double getAreaSize() {
        return areaSize;
    }

    public void setAreaSize(double areaSize) {
        this.areaSize = areaSize;
    }
}
