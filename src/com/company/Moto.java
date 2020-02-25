package com.company;

public final class Moto extends Avto {
    private String baiker;
    private int speed;

    public Moto(String model, Color color, Double volume, String baiker, int speed) {
        super(model, color, volume);
        this.baiker = baiker;
        this.speed = speed;
    }

    public String getBaiker() {
        return baiker;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String printInfo(String name) {
    return super.printInfo(name)+" Baiker: " + getBaiker() + " Speed: " + getSpeed();
    }
}
