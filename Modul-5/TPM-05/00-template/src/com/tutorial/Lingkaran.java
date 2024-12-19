package com.tutorial;

public class Lingkaran extends BangunDatar{
    //atribut
    float r;

    //constructor
    Lingkaran(float r){
        this.r = r;
    }

    //overriding
    float luas(){
        return (float) (Math.PI * r * r);
    }

    //overriding
    float keliling(){
        return (float) (2* Math.PI * r);
    }
}
