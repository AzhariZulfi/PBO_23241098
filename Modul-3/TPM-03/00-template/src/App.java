class Hitung_Gaji_Bersih{
    private int gaji_pokok;
    private int tunjangan;
    private double pajak;

    //setter gaji pokok
    public void setGajiPokok(int gaji_pokok){
        this.gaji_pokok = gaji_pokok;
    }

    //getter gaji pokok
    public int getGajiPokok(){
        return gaji_pokok;
    }

    //setter tunjangan
    public void setTunjangan(int tunjangan){
        this.tunjangan = tunjangan;
    }

    //getter tunjangan
    public int getTunjangan(){
        return tunjangan;
    }

    //setter pajak
    public void setPajak(double pajak){
        this.pajak = pajak;
    }

    //getter pajak
    public double getPajak(){
        double TotalPajak = (gaji_pokok + tunjangan) * pajak / 100;
        return TotalPajak;
    }

    //menghitung gaji bersih
    public double RumusGajiBersih(){
        return (gaji_pokok + tunjangan) - getPajak();
    }

    //mencetak gaji bersih
    void cetak(){
        System.out.println("Gaji bersih anda adalah sebesar : Rp." + RumusGajiBersih());
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Hitung_Gaji_Bersih Gaji1 = new Hitung_Gaji_Bersih();

        //mengisi gaji pokok
        Gaji1.setGajiPokok(2625000);

        //mengisi tunjangan
        Gaji1.setTunjangan(500000);

        //mengisi pajak
        Gaji1.setPajak(20);;

        //mencetak/memanggil hasil
        Gaji1.cetak();
    }
}
