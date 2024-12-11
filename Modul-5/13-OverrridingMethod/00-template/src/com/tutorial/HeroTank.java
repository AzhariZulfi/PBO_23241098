package com.tutorial;

public class HeroTank extends Hero {
    //atribut(hanya dimiliki subclass)
    double defencePower;

    //overriding method cetak (dari superclass)
    //bisa mendapatkan warisan dari superclass
    //method
    void cetak(){
        System.out.println("\nIni adalah Hero Tank");
        System.out.println("Nama Hero : " + this.nama);
        System.out.println("Defence Power :" + this.defencePower);
    }
}
