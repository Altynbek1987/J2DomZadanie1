package com.company;

public final class Moto extends Avto {
    private String baiker;
    private int speed;

    public Moto(String model, Color color, Double volume, Plant plant, String baiker, int speed) {
        super(model, color, volume, plant);
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
    public String printInfo() {
        return super.printInfo() + " Baiker: " + getBaiker() + " Speed: " + getSpeed();
    }

    @Override
    public String printSound(String sound) {
        return super.printSound(sound);
    }
}
