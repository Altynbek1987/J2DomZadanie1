package com.company;

public class Avto extends Transport {
    private String model;
    private Color color;
    private Double volume;

    public String getModel() {
        return model;
    }

    public Color getColor() {
        return color;
    }

    public Double getVolume() {
        return volume;
    }

    public Avto(String model, Color color, Double volume) {
        this.model = model;
        this.color = color;
        this.volume = volume;
    }

    public String printInfo(String name) {
        System.out.println("Auto: " + name + " Model: " + getModel() + " Color: " + getColor() + " Volume: " + getVolume());
        return name;
    }

    public final void printInfo() {
        System.out.println("Model: " + getModel() + " Color: " + getColor() + " Volume: " + getVolume());
    }

}

