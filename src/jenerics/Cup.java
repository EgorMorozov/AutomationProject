package jenerics;

public class Cup {
    public Liquid liquid;
    public String shape;
    public int volume;


    public <T extends Liquid> Cup fillTheCup(T liquid) {
        this.liquid = liquid;
        return this;
    }

    public Cup(String shape, int volume) {
        this.shape = shape;
        this.volume = volume;
    }

    public <T extends Liquid> Cup(String shape, int volume, T liquid) {
        this.shape = shape;
        this.volume = volume;
        fillTheCup(liquid);
    }

}
