package com.tutorial;

public class HeroTank extends Hero {
    // atribut
    String nama = "class hero tank";

    // overriding terhadap method
    // 'super' untuk mengakses anggota (variabel atau metode) dari superclass.
    void cetak(){
        System.out.println(" ini adalah : " + super.nama);
    }
    
}
