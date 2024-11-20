class Data{
    //data member atau variabel instan
    public int intPublic;
    private int intPrivate;
    private double doublePrivate;

    //constructor, modifier public
    public Data(){
        this.intPublic = 0;
        this.intPrivate = 100;
    }

    //method untuk membaca / Getter(hanya untuk membaca)
    public int getIntPrivate(){
        return this.intPrivate;
    }

    //method untuk menulis / Setter(untuk menulis)
    public void setDoublePrivate(double value){
        this.doublePrivate = value;
    }

    //method untuk membaca semua variabel
    void cetak(){
        System.out.println(this.intPublic);
        System.out.println(this.intPrivate);
        System.out.println(this.doublePrivate);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Data data1 = new Data();

        //membaca dan menulis menggunakan public
        data1.intPublic = 5;
        //menulis
        System.out.println("Public :" + data1.intPublic);

        //membaca menggunakan Getter
        int angka = data1.getIntPrivate();
        System.out.println("private :" + angka);

        //menulis menggunakan Setter
        data1.setDoublePrivate(3.14);

        //membaca semua
        data1.cetak();

    }
}
