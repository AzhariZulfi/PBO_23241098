class Mahasiswa{
    //Atribut dari objek
    String Nama;
    String NIM;
    String Prodi;
    int Umur;
    Double IPK;

}

public class App {
    public static void main(String[] args) throws Exception {
        
        //Membuat objek
        Mahasiswa mhs_1 = new Mahasiswa();

        //Memberikan nilai pada objek
        mhs_1.Nama = "Muhammad Azhari Zulfiansyah";
        mhs_1.NIM = "23241098";
        mhs_1.Prodi = "Pendidikan Teknologi Informasi";
        mhs_1.Umur = 20;
        mhs_1.IPK = 3.0;
        
        //Mencetak objek
        System.out.println("Nama    : " + mhs_1.Nama);
        System.out.println("NIM     : " + mhs_1.NIM);
        System.out.println("Prodi   : " + mhs_1.Prodi);
        System.out.println("Umur    : " + mhs_1.Umur);
        System.out.println("IPK     : " + mhs_1.IPK);
    }
}
