public class Mobil extends Kendaraan implements BisaDisewa, BisaDiperiksa {
    private int jumlahKursi;
    public Mobil(String namaMobil, double hargaSewa,
                 String platNomor, int jumlahKursi) {
        super(namaMobil, hargaSewa, platNomor);
        this.jumlahKursi = jumlahKursi;
    }
    public int getJumlahKursi() {
        return jumlahKursi;
    }

    public void setJumlahKursi(int jumlahKursi) {
        this.jumlahKursi = jumlahKursi;
    }
    @Override
    public void sewa() {
        prosesSewa();
    }
    @Override
    public void kembalikan() {
        setTersedia(true);
        System.out.println("Mobil berhasil dikembalikan.");
    }
    @Override
    public void prosesSewa() {
        super.tampilkanInfo();
        if (isTersedia()) {
            setTersedia(false);
            System.out.println("Mobil berhasil disewa.");
        } else {
            System.out.println("Mobil sedang disewa.");
        }
    }
    @Override
    public void periksaKondisi() {
        System.out.println("Kondisi mobil baik.");
    }
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Kursi: " + jumlahKursi);
    }
}
