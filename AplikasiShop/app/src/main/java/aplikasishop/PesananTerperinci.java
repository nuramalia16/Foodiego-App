package aplikasishop;

abstract class PesananTerperinci {
    String nama;
    int Jumlah;
    int Harga;

    public PesananTerperinci(String nama, int Harga, int Jumlah) {
        this.nama = nama;
        this.Jumlah = Jumlah;
        this.Harga = Harga;
    }

    abstract void setJumlah(int jumlaBaru);
}
