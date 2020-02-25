package com.company;

public class Main {

    public static void main(String[] args) {
        Avto avto = new Avto("Odissey", Color.WHITE, 3.0);
        Moto moto = new Moto("Ural", Color.BLACK, 1.5, "As", 150);
        Moto moto1 = new Moto("Suzuki", Color.RED, 2.5, "Hamlo", 250);
        avto.printInfo();
        avto.printInfo("Sergei");
        moto.printInfo("Ivan");
        moto1.printInfo("Asan");

    }
}
