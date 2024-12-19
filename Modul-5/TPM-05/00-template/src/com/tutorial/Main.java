package com.tutorial;

public class Main {
    public static void main (String[] args){
        //membuat objek
        Persegi persegi1 = new Persegi(5);
        Lingkaran lingkaran1 = new Lingkaran(5);
        PersegiPanjang persegiPanjang1 = new PersegiPanjang(2, 3);
        Segitiga segitiga1 = new Segitiga(2, 3);

        //menampilkan hasil
        System.out.println("Persegi:");
        System.out.println("Luas = " + persegi1.luas());  
        System.out.println("Luas = " + persegi1.keliling());

        System.out.println("\nLingkaran:");
        System.out.println("Luas = " + lingkaran1.luas());  
        System.out.println("Luas = " + lingkaran1.keliling());

        System.out.println("\nPersegi Panjang:");
        System.out.println("Luas = " + persegiPanjang1.luas());  
        System.out.println("Luas = " + persegiPanjang1.keliling());

        System.out.println("\nSegitiga:");
        System.out.println("Luas = " + segitiga1.luas());  
        System.out.println("Luas = " + segitiga1.keliling());

    }
}
