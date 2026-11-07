import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MobilMewah mobil1 = new MobilMewah(
                "Toyota Alphard", 1500000,
                "R 5466 CAA", 6, "AC, TV, Jok Kulit"
        );
        MobilKeluarga mobil2 = new MobilKeluarga(
                "Toyota Avanza", 350000,
                "R 9879 CD", 6, 500
        );
        MobilKeluarga mobil3 = new MobilKeluarga(
                "Honda Brio", 300000,
                "R 5823 AA", 4, 250
        );
        MobilMewah mobil4 = new MobilMewah(
                "BMW M4 Compe", 2500000,
                "R 666 DO", 2, "AC, Audio, Radar ADAS, Parking Assistant, Sport Seats"
        );
        MobilMewah mobil5 = new MobilMewah(
                "Lexus LM", 3000000,
                "R 404 ER", 7, "AC, TV, Captain Seat Premium, Kulkas Mini"
        );
        Kendaraan[] mobil = {
                mobil1, mobil2, mobil3, mobil4, mobil5
        };

        int pilih;
        do {
            System.out.println("\n=== PENYEWAAN MOBIL ===");
            System.out.println("1. Daftar Mobil");
            System.out.println("2. Sewa Mobil");
            System.out.println("3. Kembalikan Mobil");
            System.out.println("4. Periksa Mobil");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilih = input.nextInt();
            switch (pilih) {
                case 1:
                    for (Kendaraan m : mobil) {
                        System.out.println("\n----------------");
                        m.tampilkanInfo();
                        System.out.println("Status: " +
                                (m.isTersedia() ? "Tersedia" : "Disewa"));
                    }
                    break;

                case 2:
                    for (int i = 0; i < mobil.length; i++) {
                        System.out.println((i + 1) + ". " +
                                mobil[i].getNamaMobil());
                    }
                    System.out.print("Pilih mobil: ");
                    int nomor = input.nextInt();
                    if (nomor >= 1 && nomor <= mobil.length) {
                        Kendaraan m = mobil[nomor - 1];
                        if (m.isTersedia()) {
                            System.out.print("Lama sewa (hari): ");
                            int hari = input.nextInt();
                            if (hari > 0) {
                                BisaDisewa sewa = (BisaDisewa) m;
                                sewa.sewa();
                                System.out.println("Total biaya: Rp" +
                                        m.hitungBiaya(hari));
                            } else {
                                System.out.println("Lama sewa tidak valid.");
                            }
                        } else {
                            System.out.println("Mobil sedang disewa.");
                        }
                    } else {
                        System.out.println("Pilihan tidak tersedia.");
                    }
                    break;

                case 3:
                    for (int i = 0; i < mobil.length; i++) {
                        System.out.println((i + 1) + ". " +
                                mobil[i].getNamaMobil());
                    }
                    System.out.print("Pilih mobil: ");
                    nomor = input.nextInt();
                    if (nomor >= 1 && nomor <= mobil.length) {
                        BisaDisewa kembali =
                                (BisaDisewa) mobil[nomor - 1];
                        kembali.kembalikan();
                    } else {
                        System.out.println("Pilihan tidak tersedia.");
                    }
                    break;
                case 4:
                    for (int i = 0; i < mobil.length; i++) {
                        System.out.println((i + 1) + ". " +
                                mobil[i].getNamaMobil());
                    }
                    System.out.print("Pilih mobil: ");
                    nomor = input.nextInt();
                    if (nomor >= 1 && nomor <= mobil.length) {
                        BisaDiperiksa cek =
                                (BisaDiperiksa) mobil[nomor - 1];

                        cek.periksaKondisi();
                    } else {
                        System.out.println("Pilihan tidak tersedia.");
                    }
                    break;

                case 5:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan salah.");
            }
        } while (pilih != 5);
        input.close();
    }
}
