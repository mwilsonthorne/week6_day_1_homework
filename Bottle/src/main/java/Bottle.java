public class Bottle {
    private int vol;


    public Bottle(int vol){
        this.vol = vol;
    }

    public void setVol(int Vol) {
        this.vol = vol;
    }

    public int getVolume() {
        return this.vol;
    }

    public int getDrink() {
        return this.vol - 10;
    }

    public int getEmpty() {
        this.vol = 0;
        return this.vol;
    }

    public int getFill() {
        this.vol = 100;
        return this.vol;
    }

}
