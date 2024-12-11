package com.tutorial;

public class Main {
    public static void main(String[] args) {
        //membuat objek dari superclass
        Hero hero1 = new Hero();
        System.out.println("Ini Hero dari Superclass");
        hero1.nama = "alpi";
        hero1.cetak();

        //membuat objek dari subclass (Hero Tank)
        HeroTank hero2 = new HeroTank();
        hero2.nama = "Tigreal";
        hero2.defencePower = 100;
        hero2.cetak();
    }
}
