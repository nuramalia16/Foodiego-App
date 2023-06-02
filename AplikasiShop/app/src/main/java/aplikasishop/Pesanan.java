package aplikasishop;

public class Pesanan {
    String nama;
    int Jumlah;
    int Harga;
    int totalHarga;

    public Pesanan(String nama,int Harga) {
        this.nama = nama;
        this.Harga = Harga;
    }
    public void setJumlah(int jumlaBaru) {
        Jumlah = jumlaBaru;
        totalHarga = Jumlah * Harga;
    }

}
