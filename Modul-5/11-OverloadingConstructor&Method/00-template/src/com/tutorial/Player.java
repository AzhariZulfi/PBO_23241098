package com.tutorial;

public class Player {
    //atribut
    private String nama;
    private static int jumlahplayer;

    //constructor
    //opsi1 (isi nama manual)
    Player (String nama){
        Player.jumlahplayer++;
        this.nama = nama;
    }

    //constructor overloading
    //opsi2 (isi nama default/tidak bisa diubah)
    Player (){
        Player.jumlahplayer++;
        this.nama = "Player" + Player.jumlahplayer;
    }

    //method cetak (karna private)
    void cetak(){
        System.out.println("nama :" + this.nama);
    }
}
