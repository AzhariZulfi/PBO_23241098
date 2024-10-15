class MOTOR {
    //Membuat atribut untuk objek
    public String merk;
    public int tahun;
    public String warna;
    public String noPolisi;

    //Constructor
    //merknya sama dengan class
    //tidak punya return value
    //method yang pertama kali dipanggil saat objek dipanggil
    public MOTOR(String Inputmerk, int Inputtahun, String Inputwarna, String InputnoPolisi) {
        //isi data atribut
        merk = Inputmerk;
        tahun = Inputtahun;
        warna = Inputwarna;
        noPolisi = InputnoPolisi;

        //cetak data
        System.out.println("merk        : " + merk);
        System.out.println("tahun       : " + tahun);
        System.out.println("warna       : " + warna);
        System.out.println("noPolisi    : " + noPolisi);

    }
}

public class KelasMotorku {
        public static void main(String[] args) throws Exception {

        MOTOR motorku = new MOTOR("Honda GL Pro", 1997, "G 5879 BF", "motorku.showInfoMotor");

    }
}