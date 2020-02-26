package com.company;

public class Main {

    public static void main(String[] args) {
        Avto avto = new Avto("Odissey ,", Color.WHITE, 3.0, new Plant("GM ", "Бишкек"));
        Moto moto = new Moto("Ural ,", Color.BLACK, 1.5, new Plant("MG ", "Osh"), "As", 150);
        Moto moto1 = new Moto("Suzuki ,", Color.RED, 2.5, new Plant("OO", "Naryn"), "Hamlo", 250);
        System.out.println(avto.printInfo());
        System.out.println(moto.printInfo());
        System.out.println( moto1.printInfo());

        System.out.println(moto.printSound("Rrrrrrrr"));
        avto.printSound("Vvvvvv:", 3);
        avto.printSound(2, "Gggggg");

    }
}
