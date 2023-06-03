package aplikasishop;

public class Pesanan {
    String nama;
    int Jumlah;
    int Harga;
    int totalHarga;

    public Pesanan(String nama,int Harga,int Jumlah) {
        this.nama = nama;
        this.Harga = Harga;
        this.Jumlah = Jumlah;
    }
    public void setJumlah(int jumlaBaru) {
        Jumlah = jumlaBaru;
        totalHarga = Jumlah * Harga;
    }

}
