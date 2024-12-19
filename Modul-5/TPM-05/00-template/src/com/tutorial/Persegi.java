package com.tutorial;

public class Persegi extends BangunDatar {
    //atribut
    float sisi;

    //constructor
    Persegi(float sisi){
        this.sisi = sisi;
    }
    
    //overriding
    float luas(){
        return sisi*sisi;
    }

    //overriding
    float keliling(){
        return 4 * sisi;
    }
}
