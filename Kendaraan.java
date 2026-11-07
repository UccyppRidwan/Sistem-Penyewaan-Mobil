public abstract class Kendaraan {
    public static final String NAMA_PERUSAHAAN = "Rental Mobil";
    private String namaMobil;
    private double hargaSewa;
    private String platNomor;
    private boolean tersedia;
    private final String jenis = "Kendaraan";
    public Kendaraan(String namaMobil, double hargaSewa, String platNomor) {
        this.namaMobil = namaMobil;
        this.hargaSewa = hargaSewa;
        this.platNomor = platNomor;
        this.tersedia = true;
    }
    public Kendaraan(String namaMobil, String platNomor) {
        this(namaMobil, 0, platNomor);
    }
    public String getNamaMobil() {
        return namaMobil;
    }
    public void setNamaMobil(String namaMobil) {
        this.namaMobil = namaMobil;
    }
    public double getHargaSewa() {
        return hargaSewa;
    }
    public void setHargaSewa(double hargaSewa) {
        this.hargaSewa = hargaSewa;
    }
    public String getPlatNomor() {
        return platNomor;
    }
    public boolean isTersedia() {
        return tersedia;
    }
    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }
    public void tampilkanInfo() {
        System.out.println("Nama Mobil : " + namaMobil);
        System.out.println("Plat Nomor : " + platNomor);
        System.out.println("Harga Sewa : Rp" + hargaSewa);
    }
    public double hitungBiaya(int hari) {
        return hargaSewa * hari;
    }
    public abstract void prosesSewa();
}
