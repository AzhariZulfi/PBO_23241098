class Mahasiswa {
    //Membuat atribut untuk objek
    public String nama;
    public String nim;
    public String prodi;
    public int umur;
    public double ipk;

    //Constructor
    //namanya sama dengan class
    //tidak punya return value
    //method yang pertama kali dipanggil saat objek dipanggil
    public Mahasiswa(String Inputnama, String Inputnim, String Inputprodi, int Inputumur, double Inputipk) {
        //isi data atribut
        nama = Inputnama;
        nim = Inputnim;
        prodi = Inputprodi;
        umur = Inputumur;
        ipk = Inputipk;

        //cetak data
        System.out.println("Nama    : " + nama);
        System.out.println("NIM     : " + nim);
        System.out.println("Prodi   : " + prodi);
        System.out.println("umur    : " + umur);
        System.out.println("ipk     : " + ipk);

    }
}

public class App2 {
        public static void main(String[] args) throws Exception {

        Mahasiswa mhs_1 = new Mahasiswa("Azhari", "23241098", "PTI", 20, 3.0);

    }
}