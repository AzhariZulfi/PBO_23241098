package com.tutorial;

public class Main {
    public static void main(String[] args) {
        //membuat objek dari superclass
        Hero hero1 = new Hero();
        hero1.nama = "\nalpi";
        hero1.cetak();

        //membuat subclass dari HeroMage
        HeroTank hero2 = new HeroTank();
        System.out.println("\nini objek dari turunan class Hero");
        hero2.nama = "tigreal";
        hero2.cetak();

        //membuat subclass dari HeroMage
        HeroMage hero3 = new HeroMage();
        System.out.println("\nini objek dari turunan class Hero/dari class HeroMage");
        hero3.nama = "eudora";
        hero3.cetak();
    }
}
