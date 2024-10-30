class Bangun_Datar{
    double panjang;
    double lebar;

    Bangun_Datar(double Panjang, double Lebar){
        this.panjang = Panjang;
        this.lebar = Lebar; 
    }

    double HitungLuas(){
        return panjang * lebar;
    }

    double HitungKeliling(){
        return 2 * (panjang + lebar);
    }

    void CetakHasil(){
        System.out.println("Luas        : " + HitungLuas());
        System.out.println("Keliling    : " + HitungKeliling());
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        
    Bangun_Datar persegi_panjang = new Bangun_Datar(2, 2);

    persegi_panjang.CetakHasil();
    }
}
