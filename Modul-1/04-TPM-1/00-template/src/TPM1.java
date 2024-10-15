import java.util.Scanner;

class Kalkulator {
    // Membuat atribut untuk objek
    public int pilihan;
    public double bilanganPertama;
    public double bilanganKedua;
    public double hasil;

    // Constructor
    public Kalkulator(int inputPilihan, double inputBilanganPertama, double inputBilanganKedua) {
        pilihan = inputPilihan;
        bilanganPertama = inputBilanganPertama;
        bilanganKedua = inputBilanganKedua;
        // inisialisasi variabel hasil
        hasil = 0; 
        // Switch untuk memilih operasi
        switch (pilihan) {
            case 1 -> {
                hasil = bilanganPertama * bilanganKedua;
                System.out.println("Hasil dari " + bilanganPertama + " x " + bilanganKedua + " = " + hasil);
            }
            case 2 -> {
                if (bilanganKedua != 0) {
                    hasil = bilanganPertama / bilanganKedua;
                    System.out.println("Hasil dari " + bilanganPertama + " / " + bilanganKedua + " = " + hasil);
                } else {
                    System.out.println("Error: Tidak bisa membagi dengan nol.");
                }
            }
            case 3 -> {
                hasil = bilanganPertama + bilanganKedua;
                System.out.println("Hasil dari " + bilanganPertama + " + " + bilanganKedua + " = " + hasil);
            }
            case 4 -> {
                hasil = bilanganPertama - bilanganKedua;
                System.out.println("Hasil dari " + bilanganPertama + " - " + bilanganKedua + " = " + hasil);
            }
            default -> System.out.println("Pilihan tidak valid. Silakan pilih antara 1 hingga 4.");
        }
    }
}

public class TPM1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ulang;

        do {
            // Menampilkan pilihan operasi
            System.out.println("Pilih operasi:");
            System.out.println("1. Perkalian");
            System.out.println("2. Pembagian");
            System.out.println("3. Penjumlahan");
            System.out.println("4. Pengurangan");

            // Input pilihan operasi
            System.out.print("Masukkan pilihan (1-4): ");
            int pilihan = input.nextInt();

            // Input bilangan pertama
            System.out.print("Masukkan bilangan pertama: ");
            double bilanganPertama = input.nextDouble();

            // Input bilangan kedua
            System.out.print("Masukkan bilangan kedua: ");
            double bilanganKedua = input.nextDouble();

            // Membuat objek Kalkulator
            Kalkulator kalkulator = new Kalkulator(pilihan, bilanganPertama, bilanganKedua);

            // Menanyakan apakah ingin mengulang
            System.out.print("Apakah ingin mengulang? (y/n): ");
            ulang = input.next();

        } while (ulang.equalsIgnoreCase("y"));

        System.out.println("Program selesai.");
        input.close();
    }
}
