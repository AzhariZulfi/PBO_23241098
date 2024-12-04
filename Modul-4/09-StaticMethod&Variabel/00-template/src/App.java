import java.util.ArrayList;

class Player{
    //variabel objek
    private String nama;

    //static variabel
    private static  int numberofPlayer;

    //static variabel untuk menampung nama objek
    private static ArrayList<String> namaList = new ArrayList<String>(); 

    //konstruktor
    Player(String nama){
        this.nama = nama;
        Player.numberofPlayer++; //menambah objek
        Player.namaList.add(this.nama);
    }

    //method untuk membaca private
    void cetak(){
        System.out.println("nama :" + this.nama);
    }
    //static method
    static void showNumberofPlayer(){
    System.out.println("# of player :" + Player.numberofPlayer);
    }

    //static method2
    static ArrayList<String> getNama(){
        return Player.namaList;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        //membuat objek baru
        Player player1 = new Player("Alpi");
        Player player2 = new Player("Azhari");
        Player player3 = new Player("Zulfi");
        Player player4 = new Player("Ucup");

        //menerapkan static variabel dan method
        Player.showNumberofPlayer();

        //menampilkan semua nama player dengan array
        System.out.println(Player.getNama());
    }

}
