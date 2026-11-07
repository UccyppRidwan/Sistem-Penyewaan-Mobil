public class MobilMewah extends Mobil implements BisaDisewa, BisaDiperiksa {
    private String fasilitas;
    public MobilMewah(String namaMobil, double hargaSewa,
                      String platNomor, int jumlahKursi,
                      String fasilitas) {

        super(namaMobil, hargaSewa, platNomor, jumlahKursi);
        this.fasilitas = fasilitas;
    }
    public String getFasilitas() {
        return fasilitas;
    }

    public void setFasilitas(String fasilitas) {
        this.fasilitas = fasilitas;
    }
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Fasilitas: " + fasilitas);
    }
    @Override
    public void periksaKondisi() {
        System.out.println("Kondisi mobil mewah baik.");
    }
}
