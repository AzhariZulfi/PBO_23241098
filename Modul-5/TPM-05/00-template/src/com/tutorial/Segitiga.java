package com.tutorial;

//class segitiga siku-siku
public class Segitiga extends BangunDatar{
    //atribut
    float alas;
    float tinggi;

    //constructor
    Segitiga (float alas, float tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    //overriding
    float luas(){
        return 0.5f * alas * tinggi;
    }

    //overriding
    float keliling(){
        float sisiMiring = (float) Math.sqrt((alas * alas) + (tinggi * tinggi));
        return alas + tinggi + sisiMiring;
    }
}
