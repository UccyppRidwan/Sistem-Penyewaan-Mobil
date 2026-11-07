public class MobilKeluarga extends Mobil implements BisaDiperiksa {
    private int kapasitasBagasi;
    public MobilKeluarga(String namaMobil, double hargaSewa,
                         String platNomor, int jumlahKursi,
                         int kapasitasBagasi) {
        super(namaMobil, hargaSewa, platNomor, jumlahKursi);
        this.kapasitasBagasi = kapasitasBagasi;
    }
    public int getKapasitasBagasi() {
        return kapasitasBagasi;
    }
    public void setKapasitasBagasi(int kapasitasBagasi) {
        this.kapasitasBagasi = kapasitasBagasi;
    }
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Bagasi: " + kapasitasBagasi + " liter");
    }
    @Override
    public void periksaKondisi() {
        System.out.println("Kondisi mobil keluarga baik.");
    }
}
