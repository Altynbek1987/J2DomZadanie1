package com.company;

public class Avto extends Transport {
    private String model;
    private Color color;
    private Double volume;
    private Plant plant;

    public Plant getPlant() {
        return plant;
    }

    public String getModel() {
        return model;
    }

    public Color getColor() {
        return color;
    }

    public Double getVolume() {
        return volume;
    }

    public Avto(String model, Color color, Double volume, Plant plant) {
        this.model = model;
        this.color = color;
        this.volume = volume;
        this.plant = plant;
    }

    public String printInfo(String name) {
        System.out.println("Auto: " + name + " Model: " + getModel() + " Color: " + getColor() + " Volume: " + getVolume()
                + "Название завода: " +  plant.getName() + "Адрес завода: " + plant.getAddress());
        return name;
    }

    public final void printInfo() {
        System.out.println("Model: " + getModel() + " Color: " + getColor() + " Volume: " + getVolume()
                + "Название завода: " +  plant.getName() + "Адрес завода: " + plant.getAddress());
    }

}

