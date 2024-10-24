import java.util.Scanner;

public class Nomor1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan total penjualan salesman: Rp ");
        double totalPenjualan = scanner.nextDouble();

        double komisi;

            if (totalPenjualan < 500000) {
                komisi = totalPenjualan * 0.10;

            } else {
                komisi = 50000 * 0.10; // untuk pertama
                komisi += (totalPenjualan - 500000) * 0.15; //untuk kedua
            } 

            System.out.printf("Total penjualan salesman: Rp %.1f%n", totalPenjualan);
            System.out.printf("Komisi yang didapatkan: Rp %.1f%n", komisi);
            System.out.printf("Total penjualan salesman: Rp %.1f%n", totalPenjualan);
            System.out.printf("Komisi yang didapatkan: Rp %.1f%n", komisi);
            }
    }
