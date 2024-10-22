package MultidimensionalArray;

import java.util.Scanner;

class Barang {
    String kode;
    String nama;
    int harga;

    public Barang(String kode, String nama, int harga) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
    }
}

public class TokoSerbaAda {
    
    public static void main(String[] args) {
        System.out.println("TOKO SERBA ADA");
        System.out.println("***************");
        Scanner input = new Scanner(System.in);

        // Daftar barang
        Barang[] daftarBarang = {
            new Barang("a001", "Buku", 3000),
            new Barang("a002", "Pensil", 4000),
            new Barang("a003", "Pulpen", 5000)
        };

        System.out.print("Masukkan jumlah item barang: ");
        int jumlahItem = input.nextInt();

        String[] kodeBarang = new String[jumlahItem];
        int[] jumlahBeli = new int[jumlahItem];

        // Input data pembelian
        for (int i = 0; i < jumlahItem; i++) {
            System.out.println("Data ke-" + (i + 1));
            System.out.print("Masukkan Kode: ");
            kodeBarang[i] = input.next();
            System.out.print("Masukkan jumlah beli: ");
            jumlahBeli[i] = input.nextInt();
        }

        System.out.println("\nTOKO SERBA ADA");
        System.out.println("************");
        System.out.printf("%-3s %-12s %-12s %-7s %-12s %-12s\n", "No", "Kode Barang", "Nama Barang", "Harga", "Jumlah Beli", "Jumlah Bayar");
        System.out.println("===============================================");

        int totalBayar = 0;
        for (int i = 0; i < jumlahItem; i++) {
            for (Barang barang : daftarBarang) {
                if (barang.kode.equals(kodeBarang[i])) {
                    int jumlahBayar = barang.harga * jumlahBeli[i];
                    totalBayar += jumlahBayar;
                    System.out.printf("%-3d %-12s %-12s %-7d %-12d %-12d\n", (i + 1), barang.kode, barang.nama, barang.harga, jumlahBeli[i], jumlahBayar);
                }
            }
        }

        System.out.println("===============================================");
        System.out.println("Total Bayar: " + totalBayar);

        input.close();
    }
}