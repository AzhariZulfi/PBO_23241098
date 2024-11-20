class Player{
    //data member atau variabel instant
    String nama; //default, bisa diakses dari luar class
    public int exp;//public, bisa diakses dari luar class
    private int health;//private, tidak bisa diakses dari luas class

    //constructor modifier default
    Player (String nama, int exp, int health){
    this.nama = nama;
    this.exp = exp;
    this.health = health;
    }

    //method, default
    void cetak(){
        kurangiExp();
        System.out.println("Player     :" + this.nama);
        System.out.println("Exp        :" + this.exp);
        System.out.println("Health     :" + this.health);
    }

    //method, public
    public void ubahHealth(int value){
        this.health = value;
    }

    //method, private
    private void kurangiExp(){
        this.exp -= 10; //exp = exp - 10
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        //instansiasi objek
        Player player1 = new Player("alpi", 50, 100);

        //DEFAULT
        //membaca
        System.out.println(player1.nama);
        //menulis
        player1.nama = "azhari";
        //membaca
        System.out.println(player1.nama);

        //PUBLIC
        //membaca
        System.out.println(player1.exp);
        //menulis
        player1.exp = 75;
        //membaca
        System.out.println(player1.exp);

        //PRIVATE
        //METHOD DEFAULT
        //membaca
        player1.cetak();
        
        //METHOD PUBLIC
        //menulis
        player1.ubahHealth(125);
        player1.cetak();

        //METHOD PRIVATE
        player1.cetak();
    }
}
