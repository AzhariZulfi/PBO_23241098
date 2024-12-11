package com.tutorial;

public class HeroTank extends Hero {
    //atribut
    String atribut = "Tank";

    //Subclass Constructor
    HeroTank (String nama, double defence, double attack){
        super(nama, defence, attack);
    }

    //overriding method
    void cetak(){
        System.out.println("Hero :" + this.atribut);
        super.cetak();
    }
}
