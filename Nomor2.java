import java.util.Scanner;

public class Nomor2 {
    // Definisikan jenis bungalow dan tarifnya
    static class BungalowType {
        int kode;
        double tarif;
        double biayaPelayanan;

        public BungalowType(int kode, double tarif, double biayaPelayanan) {
            this.kode = kode;
            this.tarif = tarif;
            this.biayaPelayanan = biayaPelayanan;
        }
    }

    public static void main(String[] args) {
        // Definisikan jenis bungalow
        BungalowType[] jenisBungalow = new BungalowType[] {
            new BungalowType(1, 50000, 0.3),
            new BungalowType(2, 40000, 0.2),
            new BungalowType(3, 30000, 0.1)
        };

        // Inputkan jumlah pelanggan
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah pelanggan: ");
        int jumlahPelanggan = scanner.nextInt();

        // Inputkan data pelanggan
        double totalPendapatan = 0;
        for (int i = 0; i < jumlahPelanggan; i++) {
            System.out.print("Masukkan jenis bungalow (1/2/3) untuk pelanggan ke-" + (i + 1) + ": ");
            int kodeBungalow = scanner.nextInt();
            System.out.print("Masukkan lama menginap untuk pelanggan ke-" + (i + 1) + ": ");
            int lamaMenginap = scanner.nextInt();

            // Cari jenis bungalow yang dipilih
            BungalowType bungalowType = null;
            for (BungalowType jenis : jenisBungalow) {
                if (jenis.kode == kodeBungalow) {
                    bungalowType = jenis;
                    break;
                }
            }

            // Hitung biaya menginap
            double biayaMenginap = lamaMenginap * bungalowType.tarif;

            // Hitung biaya pelayanan
            double biayaPelayanan = biayaMenginap * bungalowType.biayaPelayanan;

            // Hitung total biaya
            double totalBiaya = biayaMenginap + biayaPelayanan;

            // Tambahkan total biaya ke total pendapatan
            totalPendapatan += totalBiaya;

            // Tampilkan hasil
            System.out.println("Biaya menginap: Rp " + biayaMenginap);
            System.out.println("Biaya pelayanan: Rp " + biayaPelayanan);
            System.out.println("Total biaya: Rp " + totalBiaya);
            System.out.println();
        }

        // Tampilkan total pendapatan
        System.out.println("Total pendapatan: Rp " + totalPendapatan);
    }
}
