package com.tutorial;

// import package eskternal
import com.terminal.Console;

// import package sampai log
import static com.terminal.Console.log;

class player {
    // objek vaariabel
    private String nama;

    // konstruktor
    player(String nama){
        this.nama = nama;
    }

    // method cetak
    void cetak(){
        Console.log("ini menggunakan console");
        Console.log("nama : " + this.nama);

        log("ini pakai log aja");
        log("nama : " + this.nama);
    }
}

