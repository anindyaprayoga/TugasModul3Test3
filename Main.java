import java.util.Scanner;

/**
 * Kelas utama yang mengandung metode main.
 */
public class Main {
    /**
     * Metode utama untuk menjalankan program.
     * @param args argumen baris perintah
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stock abcCompany = new Stock();

        System.out.println("Masukkan harga saham yang ingin dibeli:");
        double buyPrice = scanner.nextDouble();
        System.out.println("Masukkan jumlah saham yang ingin dibeli:");
        int buyShares = scanner.nextInt();
        abcCompany.buy(buyPrice, buyShares);

        System.out.println("Masukkan harga saham yang ingin dijual:");
        double sellPrice = scanner.nextDouble();
        System.out.println("Masukkan jumlah saham yang ingin dijual:");
        int sellShares = scanner.nextInt();
        abcCompany.sell(sellPrice, sellShares);

        System.out.println("Jumlah saham anda saat ini");
        System.out.println(abcCompany.getShares());
        System.out.println("Harga saham terakhir");
        System.out.println(abcCompany.getPrice());
        System.out.println("Harga rata-rata");
        System.out.println(abcCompany.getAveragePrice());
    }
}


