package com.company;

public class Avto extends Transport {
    private Color color;
    private Double volume;
    private Plant plant;

    public Plant getPlant() {
        return plant;
    }

    public Color getColor() {
        return color;
    }

    public Double getVolume() {
        return volume;
    }

    public Avto(String model, Color color, Double volume, Plant plant) {
        super(model);
        this.color = color;
        this.volume = volume;
        this.plant = plant;
    }

    public String printInfo() {
        return " Model: " + getModel() + " Color: " + getColor() + " Volume: " + getVolume()
                + " Название завода: " + plant.getName() + " Адрес завода: " + plant.getAddress();
    }

    public String printSound(String sound) {
        return sound;
    }

    public void printSound(String sound, int i) {
        for (int j = 0; j < i; j++) {
            System.out.println(sound);
        }
    }

    public final void printSound(int j, String sound) {
        for (int i = 0; i < j; i++) {
            System.out.println(sound);
        }
    }

}

