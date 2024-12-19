package com.tutorial;

public class PersegiPanjang extends BangunDatar {
    //atribut
    float panjang;
    float lebar;

    //constructor
    PersegiPanjang(float Panjang, float Lebar){
        this.panjang = Panjang;
        this.lebar = Lebar;
    }

    //overriding
    float luas(){
        return panjang * lebar;
    }

    //overriding
    float keliling(){
        return 2 * (panjang + lebar);
    }
}
